package kiemtra3.model;

import java.io.Serializable;

public class AccountHistory implements Serializable {
    // property
    static int create;
    private int IdHistory;
    private int accountId;
    //boolean type;
    double type;
    private double amount;
    private String description;

    // constructor
    public AccountHistory() {
        IdHistory = create++;
    }

    public AccountHistory(int accountId, double type, double amount, String description) {
        IdHistory = create++;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    // getter, setter
    public int getID() {
        return IdHistory;
    }

    public void setID(int IdHistory) {
        this.IdHistory = IdHistory;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

//    public boolean isType() {
//        return type;
//    }

//    public void setType(boolean type) {
//        this.type = type;
//    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "accountId=" + accountId +
                ", type=" + type +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
