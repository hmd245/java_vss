-- thuchanhday17
USE QuanLySinhVien;

-- Thêm bản ghi vào bảng Class:
INSERT INTO Class(ClassName, StartDate, Status)
VALUES ('A1', '2008-12-20', 1);
INSERT INTO Class(ClassName, StartDate, Status)
VALUES ('A2', '2008-12-22', 1);
INSERT INTO Class(ClassName, StartDate, Status)
VALUES ('B3', current_date, 0);

-- THêm bản ghi bào bảng Student:
INSERT INTO Student(StudentName, Address, Phone, Status, ClassId)
VALUE('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

--  Thêm dữ liệu nhanh vào bảng Subject
INSERT INTO Subject(SubName, Credit, Status)
VALUES ('CF', 5, 1),
       ('C', 6, 1),
       ('HDJ', 5, 1),
       ('RDBMS', 10, 1);
       
-- Thêm dữ liệu vào trong bảng Mark
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (3, 3, 8, 1),
       (2, 4, 10, 2),
       (3, 5, 12, 1);
