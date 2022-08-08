package kiemtra3;


import kiemtra3.controller.AccountController;
import kiemtra3.view.ViewAccount;

public class Main {
    public static void main(String[] args) {
        //ViewAccount view = new ViewAccount();

        AccountController accountController = new AccountController();

        accountController.enterAccount();

    }
}
