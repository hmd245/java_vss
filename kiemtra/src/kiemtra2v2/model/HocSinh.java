package kiemtra2v2.model;

import java.util.Date;

public class HocSinh {
    // property
    private static int id;
    private String hoTen;
    private Date ngaySinh;

    // constructor


    public HocSinh() {
        id++;
    }

    public HocSinh(String hoTen, String ngaySinh) {
        id++;
        this.hoTen = hoTen;
        this.ngaySinh = new Date(ngaySinh);
    }

    // getters, setters

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
