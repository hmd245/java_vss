-- Sử dụng câu lệnh Use QuanLySinhVien để sử dụng cơ sở dữ liệu
USE QuanLySinhVien;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
SELECT * FROM Student WHERE StudentName LIKE 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12 
SELECT * FROM Class WHERE StartDate LIKE '%-12-%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT * FROM Subject WHERE Credit BETWEEN 3 AND 7;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT S.StudentName, Sub.SubName, M.Mark
FROM Student S JOIN Mark M ON S.StudentId = M.StudentId JOIN Subject Sub ON Sub.SubId = M.SubId
-- WHERE
ORDER BY Mark DESC,studentName ASC;

SELECT * FROM Mark
ORDER BY Mark DESC;