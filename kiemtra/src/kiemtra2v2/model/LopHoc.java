package kiemtra2v2.model;

public class LopHoc {
    // property
    private static int ID;
    private String tenLop;
    private String tenGiaoVien;

    // constructor

    public LopHoc() {
        ID++;
    }

    public LopHoc(String tenLop, String tenGiaoVien) {
        ID++;
        this.tenLop = tenLop;
        this.tenGiaoVien = tenGiaoVien;
    }

    // getters, setters

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }
}
