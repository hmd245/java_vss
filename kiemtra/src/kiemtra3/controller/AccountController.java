package kiemtra3.controller;

import kiemtra3.model.Account;
import kiemtra3.model.AccountHistory;
import kiemtra3.view.ViewAccount;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AccountController {
    public static Scanner scanner = new Scanner(System.in);

    // property
    private ViewAccount view = new ViewAccount();
    List<Account> accountList = new ArrayList<Account>();
    List<AccountHistory> accountHistoryList = new ArrayList<AccountHistory>();

    // constructor


    public AccountController() {
    }

    // 1. Hàm nhập Account và lưu thông tin vào file
    public void enterAccount() {
        int choose = 0;
        boolean exit = false;

        while (true) {
            view.showMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    setAccountInfo();

                case 2:
                    printReadFile();
                    break;
                case 3:
                    editAccount();
                    break;
                case 4:
                    deleteAccount();
                    break;
                case 5:
                    searchAccountByName();
                    break;
                case 6:
                    sortAccountByName();
                    break;
                case 7:
                    deductionAccount();
                    break;
                case 8:
                    addMoney();
                    break;
                case 0:
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
        }
    }


    //
    public void setAccountInfo() {
        //Account account = new Account();

        System.out.print("Nhap ten account: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.print("Nhap so tai khoan account: ");
        String number = scanner.nextLine();

        System.out.print("Nhap so du account: ");
        Double amount = scanner.nextDouble();

        Account account = new Account(name, number, amount);

        account.setFullName(name);
        account.setAccountNumber(number);
        account.setAmount(amount);

        accountList.add(account);
        getAccountInfo();

    }
    public void getAccountInfo() {
        for (Account account : accountList) {
            System.out.println(account.toString());
        }
    }


    // 2. Hàm in ra màn hình danh sách đọc từ file
    public void printReadFile() {
        System.out.println("Hien thi danh sach doc tu file: ");
        // Ghi account vào file
        writeToFile("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\account.txt", accountList);

        // Đọc account từ file
        List<Account> accountList1 = readDataFromFile("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\account.txt");
        for (Account acc : accountList1) {
            System.out.println(acc);
        }
    }

    // Phương thức ghi danh sach san pham hien co vao file nhi phan
    public static void writeToFile(String path, List<Account> accountList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accountList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile2(String path, List<AccountHistory> accountHistoryList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(accountHistoryList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Lấy danh sách account trong file nhị phân
    public static List<Account> readDataFromFile(String path) {
        List<Account> accounts = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            accounts = (List<Account>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return accounts;
    }


    // 3. Hàm sửa thông tin Account theo id
    public void editAccount() {
        System.out.println("Nhap id account can edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                System.out.println("Nhap lai ten account: ");
                String nameAccount = scanner.nextLine();
                System.out.println("Nhap lai accountNumber: ");
                String accountNumber = scanner.nextLine();
                System.out.println("Nhap lai amount(so tien trong tai khoan): ");
                Double amount = scanner.nextDouble();

                accountList.get(i).setFullName(nameAccount);
                accountList.get(i).setAccountNumber(accountNumber);
                accountList.get(i).setAmount(amount);
                System.out.println("Da sua thong tin account thanh cong");
                getAccountInfo();
            }
        }
        // Ghi thông tin vào file
        writeToFile("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\account.txt", accountList);

    }
    // 4. Hàm xóa thông tin account theo id // còn AccountHistory
    public void deleteAccount() {
        System.out.println("Nhap id account can xoa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Account accountDelete = null;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountDelete = accountList.get(i);
                break;
            }
        }
        if (accountDelete != null) {
            accountList.remove(accountDelete);
        }
        else {
            System.out.println("ID khong ton tai");
        }

        System.out.println("Danh sach account sau khi xoa:");
        getAccountInfo();

        // Ghi thông tin vào file
        writeToFile("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\account.txt", accountList);
    }

    // 5. Hàm tìm kiếm theo tên
    public void searchAccountByName() {
        System.out.println("Nhap ten account can tim kiem: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        for (int i = 0; i < accountList.size(); i++) {
            //System.out.println(accountList.get(i).getFullName());
            if (accountList.get(i).getFullName().equalsIgnoreCase(name)) {
                System.out.println("Ket qua tim search1: " + accountList.get(i));
            }
        }
    }
    // 6. Hàm sắp xếp theo tên
    public void sortAccountByName() {
        Collections.sort(accountList, new SortAccountByName());
        getAccountInfo();
    }

    // 7. Chức năng trừ tiền, check tiền trong tài khoản có đủ không?
    // (đưa vào AccountHistory) (Lưu tất cả thông tin vào file) (xử lý synchronized)
    // synchronized method
    public synchronized void deductionAccount() {
        System.out.println("Nhap ten account can tru tien: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getFullName().equalsIgnoreCase(name)) {
                System.out.println("Nhap so tien muon tru: ");
                Double deduction = scanner.nextDouble();
                Double newAmount = accountList.get(i).getAmount() - deduction;
                accountList.get(i).setAmount(newAmount);
                System.out.println("Da tru tien account thanh cong");
                getAccountInfo();

                // đưa vào AccountHistory
                AccountHistory accountHistory = new AccountHistory();
                int accountId = accountList.get(i).getId();
                scanner.nextLine();
                System.out.println("Nhap mo ta: ");
                String description = scanner.nextLine();
                accountHistory.setAccountId(accountId);
                accountHistory.setType(deduction);
                accountHistory.setAmount(newAmount);
                accountHistory.setDescription(description);

                accountHistoryList.add(accountHistory);
            }
        }

        // Ghi thông tin vào file accountHistory.txt
        writeToFile2("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\accountHistory.txt", accountHistoryList);

    }

    // 8. Chức năng cộng tiền (đưa vào AccountHistory).
    //      (Lưu tất cả thông tin vào file) (xử lý synchronized)
    public synchronized void  addMoney() {
        System.out.println("Nhap ten account can cong tien: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getFullName().equalsIgnoreCase(name)) {
                System.out.println("Nhap so tien muon cong: ");
                Double addAmount = scanner.nextDouble();
                Double newAmount = accountList.get(i).getAmount() + addAmount;
                accountList.get(i).setAmount(newAmount);
                System.out.println("Da cong tien account thanh cong");
                getAccountInfo();

                // đưa vào AccountHistory
                AccountHistory accountHistory = new AccountHistory();
                int accountId = accountList.get(i).getId();
                scanner.nextLine();
                System.out.println("Nhap mo ta: ");
                String description = scanner.nextLine();
                accountHistory.setAccountId(accountId);
                accountHistory.setType(addAmount);
                accountHistory.setAmount(newAmount);
                accountHistory.setDescription(description);

                accountHistoryList.add(accountHistory);
            }
        }
        // Ghi thông tin vào file accountHistory.txt
        writeToFile2("D:\\workplace\\java_fresher\\java_vss\\kiemtra\\src\\kiemtra3\\accountHistory.txt", accountHistoryList);
    }
}
