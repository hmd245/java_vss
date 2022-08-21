-- Bước 1: Tạo cơ sở dữ liệu có tên là QuanLyDiemThi bằng câu lệnh:
CREATE DATABASE IF NOT EXISTS QuanLyDiemThi;
-- Bước 2: Chọn Database QuanLyDiemThi để thao tác với cơ sở dữ liệu này:
USE QuanLyDiemThi;
-- Bước 3: Tiếp theo sử dụng câu lệnh Create Table để tạo bảng
CREATE TABLE HocSinh(
	MaHS VARCHAR(20) PRIMARY KEY,
    TenHS VARCHAR(50),
    NgaySinh DATETIME,
    Lop VARCHAR(20),
    GioiTinh VARCHAR(20)
);

CREATE TABLE MonHoc(
	MaMH VARCHAR(20) PRIMARY KEY,
    TenMH VARCHAR(45)
);


CREATE TABLE BangDiem(
	MaHS VARCHAR(20),
    MaMH VARCHAR(20),
    DiemThi INT,
    NgayKT DATETIME,
    PRIMARY KEY(MaHS, MaMH),
    FOREIGN KEY (MaHS) REFERENCES HocSinh(MaHS),
    FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
);

CREATE TABLE GiaoVien(
	MaGV VARCHAR(20) PRIMARY KEY,
    TenGV VARCHAR(20),
    SDT VARCHAR(10)
);

-- Bước 7: Chỉnh sửa lại bảng MonHoc bổ sung thêm trường MaGV là khoá ngoại của bảng MonHoc
ALTER TABLE MonHoc ADD MaGV VARCHAR(20);
ALTER TABLE MonHoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);