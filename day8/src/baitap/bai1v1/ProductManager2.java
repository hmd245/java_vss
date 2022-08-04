package baitap.bai1v1;

import baitap.bai1.PriceComparator;
import baitap.bai1.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//Bước 2: Xây dựng lớp ProductManager
//gồm các phương thức thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp.

public class ProductManager2 {

    // Khai báo ArrayList để lưu danh sách sản phẩm.
    LinkedList<Product> products = new LinkedList<>();

    // Them san pham
    public void addProduct(Product pro) {
        products.add(pro);
    }

    // Sua thong tin san pham theo id
    public void editbyID(int id, String des) {
        for (Product i : products) {
            if (i.getId() == id) {
                i.setDescription(des);
            }
        }
    }

    // Xoa san pham theo id
    public void removebyID(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    // Hien thi danh sach san pham
    public void displayProduct() {
        for (Product i : products) {
            System.out.println(i.toString());
        }
    }

    // Tim kiem san pham theo ten
    public Product findbyName(String name) {
        for (Product i : products) {
            if (i.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }

    // Sap xep san pham tang dan theo gia
    public void sortAscendingOrder() {
        Collections.sort(products, new PriceComparator());
    }
    // Sap xep san pham giam dan theo gia

    public void sortDescendingOrder() {
        Comparator priceComparator = Collections.reverseOrder(new PriceComparator());
        Collections.sort(products, priceComparator);
        //Collections.sort(products, Collections.reverseOrder(new PriceComparator()));
    }
}