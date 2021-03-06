CREATE DATABASE QLKHO
GO
USE QLKHO
GO
----------------------------------
CREATE TABLE ADMIN
(
	ID INT IDENTITY PRIMARY KEY,
	Name NVARCHAR(200),
	Account NVARCHAR(100),
	PasswordAdmin NVARCHAR(100),
	Email NVARCHAR(100),
	Tel VARCHAR(20),
)
GO
----------------------------------
CREATE TABLE CONTACT
(
	ID INT PRIMARY KEY,
	NameGroup NVARCHAR(100),
	Tel VARCHAR(20),
	Email NVARCHAR(50),
	AddressGroup NVARCHAR(100)
)
GO
----------------------------------

CREATE TABLE CATEGORY
(
	ID INT IDENTITY PRIMARY KEY,
	Name NVARCHAR(200)
)
GO

----------------------------------
CREATE TABLE BRANCH
(
	ID INT IDENTITY PRIMARY KEY,
	Name NVARCHAR(200),
	Tel VARCHAR(20),
	AddressBranch NVARCHAR(100)
)
GO
----------------------------------
CREATE TABLE PRODUCT
(
	ID INT IDENTITY PRIMARY KEY,
	Name NVARCHAR(300),
	IDCate INT,
	IDBranch INT,
	Quantity INT,
	DescriptionProduct NVARCHAR(500),
	FOREIGN KEY (IDCate) REFERENCES dbo.CATEGORY (ID),
	FOREIGN KEY (IDBranch) REFERENCES dbo.BRANCH (ID),
)
GO
----------------------------------
CREATE TABLE STAFF 
(
	ID INT IDENTITY PRIMARY KEY,
	Name NVARCHAR (100),
	Tel VARCHAR(20),
	AddressStaff NVARCHAR(100),
	Email VARCHAR(100)
)
GO
----------------------------------
INSERT INTO ADMIN ( Name, Account, PasswordAdmin, Email,Tel) VALUES (N'ADMIN',N'admin',N'admin',N'admin@gmail.com','0912345678')


INSERT INTO CONTACT (ID,NameGroup, Tel, Email, AddressGroup) VALUES (1,N'US','0912345678',N'us@gmail.com',N'Somewhere in SG')

INSERT INTO CATEGORY (Name) VALUES (N'Thực Phẩm')
INSERT INTO CATEGORY (Name) VALUES (N'Nước Giải Khát')
INSERT INTO CATEGORY (Name) VALUES (N'Trái Cây')
INSERT INTO CATEGORY (Name) VALUES (N'Bia Rượu')

INSERT INTO BRANCH (Name,Tel,AddressBranch) VALUES (N'Bách Hóa Xanh','012345678',N'Somewhere in Mercury')
INSERT INTO BRANCH (Name,Tel,AddressBranch) VALUES (N'Bách Hóa Đỏ','012345678',N'Somewhere in Mars')
INSERT INTO BRANCH (Name,Tel,AddressBranch) VALUES (N'Bách Hóa Vàng','012345678',N'Somewhere in Jupiter')
INSERT INTO BRANCH (Name,Tel,AddressBranch) VALUES (N'Bách Hóa Nâu','012345678',N'Somewhere in Saturn')
INSERT INTO BRANCH (Name,Tel,AddressBranch) VALUES (N'Bách Hóa Cam','012345678',N'Somewhere in Venus')

INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Bánh Gạo',1,1,100,N'Bánh Gạo Tê Tê')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Mì Ý',1,1,50,N'Mì Ý Thơm Thơm')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Bò Hầm',1,2,20,N'Bò Hầm Chầm Dầm')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Coca Cola',2,2,150,N'Coca Cola lalala')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Pepsi',2,2,100,N'Pepsi iiii')

INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Chuối Indo',3,3,100,N'Ăn Vào Người Đô Đô')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Lê Lào',3,1,70,N'Cùng Mua Lê Nào')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Táo Tàu',3,4,50,N'Cùng Nhau Làm Giàu')

INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Heineken',4,5,100,N'Xem C1')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Tiger',4,5,70,N'Thú Dữ Rừng Xanh')
INSERT INTO PRODUCT(Name,IDCate,IDBranch,Quantity,DescriptionProduct) VALUES (N'Budweiser',4,5,50,N'Beer Số 1 Của Mỹ')

INSERT INTO STAFF (Name,Tel,AddressStaff,Email) VALUES (N'Nguyễn Phú Doan','012345678',N'30 Tiều Phu Đốn Củi','staffdoan@gmail.com')
INSERT INTO STAFF (Name,Tel,AddressStaff,Email) VALUES (N'Nguyễn Minh Dũng','012345678',N'45 Trần Bình Nguyên','staffdung@gmail.com')
INSERT INTO STAFF (Name,Tel,AddressStaff,Email) VALUES (N'Nguyễn Tấn Trọng','012345678',N'66 Điện Biên Phủ','stafftrong@gmail.com')
INSERT INTO STAFF (Name,Tel,AddressStaff,Email) VALUES (N'Nguyễn Thị Triết','012345678',N'12 Nguyễn Thị Minh Khai','stafftriet@gmail.com')


