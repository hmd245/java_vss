package baitap.bai1v1;

import baitap.bai1.Product;
import baitap.bai1.ProductManager;

public class Main {

    public static void printProducts(ProductManager list) {
        list.displayProduct();
    }

    public static void main(String[] args) {
        //Them san pham
        System.out.println("Them san pham: ");
        ProductManager productManager = new ProductManager();

        Product product1 = new Product(5, "samsung10", 18000000, "mau gold");

        productManager.addProduct(new Product(1, "iphone8", 9000000, "mau vang"));
        productManager.addProduct(new Product(2, "xiaomi10", 3000000, "mau den"));
        productManager.addProduct(new Product(3, "samsung8", 8000000, "mau xanh"));
        productManager.addProduct(product1);

        printProducts(productManager);
        System.out.println("-----------------------------------");

        //Tim kiem theo ten
        System.out.println("Tim kiem theo ten: ");
        System.out.println(productManager.findbyName("iphone8"));
        System.out.println("-----------------------------------");

        // Sua thong tin san pham theo id
        System.out.println("Sua thong tin san phan theo id: ");
        productManager.editbyID(2, "Black");
        printProducts(productManager);
        System.out.println("------------------------------------");

        // Xoa san pham theo id
        System.out.println("Xoa san pham theo id");
        productManager.removebyID(1);
        printProducts(productManager);
        System.out.println("------------------------------------");

        productManager.addProduct(new Product(1, "aaa", 100000, "mau xanh dai duong"));

        // Sap xep tang dan
        System.out.println("Sap xep tang dan theo gia");
        productManager.sortAscendingOrder();
        printProducts(productManager);
        System.out.println("-------------------------------------");

        // Sap xep giam dan
        System.out.println("Sap xep giam dan theo gia");
        productManager.sortDescendingOrder();
        printProducts(productManager);
        System.out.println("-------------------------------------");

    }
}