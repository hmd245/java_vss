package baitap10.bai1;


import thuchanh10.bai2.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductManager {
    // Khởi tạo một list để lưu sản phẩm
    public static List<Product> productList = new ArrayList<>();
    public static List<Product> productListFind = new ArrayList<>();

    public static void main(String[] args) {

//         Thêm sản phẩm và ghi vào file product_day10.txt
        System.out.println("Them san pham va ghi vao file: ");
        Product product1 = new Product(6, "iphone8", "Apple", 1000, "mau vang");
        Product product2 = new Product(7, "iphone10", "Apple", 2000, "mau vang");

        ProductManager productManager = new ProductManager();
        //productManager.displayProduct();

        productList.add(product1);
        productList.add(product2);
        //System.out.println(productList.toString());

        // Ghi sản phẩm vào file
        writeToFile("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai1\\product_day10.txt", productList);

        // Đọc sản phẩm từ file
        List<Product> productList1 = readDataFromFile("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai1\\product_day10.txt");
        for (Product pro : productList1) {
            System.out.println(pro);
        }

//        Thêm sản phẩm tìm kiếm được vào file
        System.out.println("Nhap ten san pham can tim kiem: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(productManager.findByName(name));
        productListFind.add(productManager.findByName(name));
        // Ghi sản phẩm đã tìm kiếm được vào file
        writeToFile("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai1\\product_day10.txt", productListFind);

        System.out.println("Doc san pham da tim kiem tu trong file ");
        List<Product> productList2 = readDataFromFile("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai1\\product_day10.txt");

        for (Product pro : productList2) {
            System.out.println(pro);
        }
    }

//    Các phương thức
    // Phương thức hiển thị sản phẩm
    /*
    public void displayProduct() {
        for (Product i : productList) {
            System.out.println(i.toString());
        }
    }
     */

    // Phương thức tìm kiếm thông tin sản phẩm
    public Product findByName(String name) {
        for (Product i : productList) {
            if (i.getTenSanPham().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }

    // Phương thức ghi danh sach san pham hien co vao file nhi phan
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lay danh sach san pham trong file nhi phan
    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
