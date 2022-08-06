package baitap10.bai1;

import java.io.Serializable;

public class Product implements Serializable {
    // Property
    private int maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double giaSanPham;
    private String moTaSanPham;

    // Constructor
    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, String hangSanXuat,
                   double giaSanPham, String moTaSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.giaSanPham = giaSanPham;
        this.moTaSanPham = moTaSanPham;
    }

    // Getters, setters
    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", moTaSanPham='" + moTaSanPham + '\'' +
                '}';
    }
}
