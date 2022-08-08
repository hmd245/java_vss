package kiemtra3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {
    // property
    private int ID = 0;
    static int count;
    private String fullName;
    private String accountNumber;
    private double amount;
    List<AccountHistory> accountHistoryList = new ArrayList<AccountHistory>();

    // constructor
    public Account() {
        ID=++count;
    }

    public Account(String fullName, String accountNumber, double amount) {
        ID=++count;

        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // getters, setter
    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<AccountHistory> getAccountHistoryList() {
        return accountHistoryList;
    }

    public void setAccountHistoryList(List<AccountHistory> accountHistoryList) {
        this.accountHistoryList = accountHistoryList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", accountHistoryList=" + accountHistoryList +
                '}';
    }
}
