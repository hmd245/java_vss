CREATE DATABASE QuanLySinhVien;

USE QuanLySinhVien;

CREATE TABLE Class(
	ClassID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME NOT NULL,
    Status BIT
);

CREATE TABLE Studentclass(
	StudentId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    StudentName VARCHAR(30) NOT NULL,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    Status BIT,
    ClassId INT NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);

CREATE TABLE Subject(
	SubID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SubName VARCHAR(30) NOT NULL,
    Credit TINYINT NOT NULL DEFAULT 1 CHECK(Credit >= 1),
    Status BIT DEFAULT 1
);

CREATE TABLE Mark(
	MarkId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SubId INT NOT NULL,
    StudentId INT NOT NULL,
    Mark FLOAT Default 0 CHECK (Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE(SubId, StudentId),
    FOREIGN KEY(SubId) REFERENCES Subject(SubId),
    FOREIGN KEY(StudentId) REFERENCES Student(StudentId)
);
