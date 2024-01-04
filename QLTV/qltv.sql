-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 21, 2023 at 06:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qltvf`
--

-- --------------------------------------------------------

--
-- Table structure for table `muonsach`
--

CREATE TABLE `muonsach` (
  `Mamuonsach` int(11) NOT NULL,
  `Masach` varchar(255) NOT NULL,
  `MaSV` varchar(255) NOT NULL,
  `Soluong` int(11) NOT NULL,
  `Ngaymuon` varchar(255) NOT NULL,
  `Ngayhentra` varchar(255) NOT NULL,
  `Ngaytra` varchar(255) DEFAULT NULL,
  `Tinhtrang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `muonsach`
--

INSERT INTO `muonsach` (`Mamuonsach`, `Masach`, `MaSV`, `Soluong`, `Ngaymuon`, `Ngayhentra`, `Ngaytra`, `Tinhtrang`) VALUES
(4, 'SA001', 'AT180132', 1, '21-12-2023', '31/1/2024', '12-22-2023', 1),
(5, 'SA002', 'AT180132', 1, '21-12-2023', '31/1/2024', NULL, 0),
(6, 'SA002', 'AT180101', 1, '21-12-2023', '31/1/2024', NULL, 0),
(7, 'SA003', 'AT180101', 1, '21-12-2023', '31/1/2024', '12-22-2023', 1),
(8, 'SA001', 'AT180102', 1, '21-12-2023', '31/1/2024', NULL, 0),
(9, 'SA004', 'AT180103', 1, '21-12-2023', '31/1/2024', NULL, 0),
(10, 'SA004', 'AT180104', 2, '21-12-2023', '31/1/2024', NULL, 0),
(11, 'SA005', 'AT180105', 2, '21-12-2023', '31/1/2024', '12-22-2023', 1),
(12, 'SA006', 'AT180105', 2, '21-12-2023', '31/1/2024', NULL, 0),
(13, 'SA007', 'AT180106', 2, '21-12-2023', '31/1/2024', NULL, 0),
(14, 'SA001', 'AT180106', 2, '21-12-2023', '31/1/2024', NULL, 0),
(16, 'SA008', 'AT180107', 1, '21-12-2023', '25/2/2024', NULL, 0),
(17, 'SA009', 'AT180104', 1, '21-12-2023', '25/2/2024', NULL, 0),
(18, 'SA010', 'AT180103', 1, '21-12-2023', '25/2/2024', NULL, 0),
(19, 'SA011', 'AT180130', 1, '21-12-2023', '30/3/2024', NULL, 0),
(20, 'SA012', 'AT180105', 1, '21-12-2023', '30/3/2024', NULL, 0),
(21, 'SA013', 'at180105', 1, '22-12-2023', '25/2/2024', NULL, 0),
(22, 'SA013', 'AT180130', 1, '22-12-2023', '25/2/2024', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `Masach` varchar(255) NOT NULL,
  `Tensach` varchar(255) NOT NULL,
  `Theloai` varchar(255) NOT NULL,
  `Soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sach`
--

INSERT INTO `sach` (`Masach`, `Tensach`, `Theloai`, `Soluong`) VALUES
('SA001', 'Triết học', 'Giáo Trình', 97),
('SA002', 'Toán Cao Cấp', 'Giáo Trình', 98),
('SA003', 'Vật lý đại cương', 'Giáo Trình', 100),
('SA004', 'Lập trình và Cuộc sống', 'Sách công nghệ_KHKT', 99),
('SA005', 'Thinking In Java', 'Sách công nghệ_KHKT', 100),
('SA006', 'Lập trình hướng đối tượng', 'Giáo Trình', 98),
('SA007', 'Sapiens: Lược Sử Loài Ngườ', 'Sách khoa học xã hội', 98),
('SA008', 'Nhà Giả Kim', 'Sách tham khảo', 99),
('SA009', 'Chạm tới giấc mơ', 'Truyện', 99),
('SA010', 'Tôi thấy hoa vàng trên cỏ xanH', 'Truyện', 99),
('SA011', 'búp sen xanh', 'Sách khoa học xã hội', 99),
('SA012', 'Ông già và biển cả', 'Sách khoa học xã hội', 99),
('SA013', 'The Growth Handbook', 'Sách tham khảo', 98);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `MaSV` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Hoten` varchar(255) NOT NULL,
  `Gioitinh` varchar(255) NOT NULL,
  `Lop` varchar(255) NOT NULL,
  `Khoa` varchar(255) NOT NULL,
  `Level` int(11) NOT NULL,
  `Ngaysinh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`MaSV`, `Password`, `Hoten`, `Gioitinh`, `Lop`, `Khoa`, `Level`, `Ngaysinh`) VALUES
('a', '0cc175b9c0f1b6a831c399e269772661', 'Âu Quang Đức', 'Nam', 'AT18B', 'An Toàn Thông Tin', 1, '28-05-2003'),
('AT180101', '0cc175b9c0f1b6a831c399e269772661', 'Nguyễn Minh Anh', 'Nữ', 'AT18C', 'An Toàn Thông Tin', 0, '1/1/2003'),
('AT180102', '0cc175b9c0f1b6a831c399e269772661', 'Trần Minh Đức', 'Nam', 'AT18D', 'Công Nghệ Thông Tin', 0, '1/2/2003'),
('AT180103', '0cc175b9c0f1b6a831c399e269772661', 'Hoàng Kim Lan', 'Nữ', 'AT18E', 'Điện Tử Viễn Thông', 0, '15/09/2003'),
('AT180104', '0cc175b9c0f1b6a831c399e269772661', 'Phạm Anh Quân', 'Nam', 'AT18D', 'Công Nghệ Thông Tin', 0, '3/10/2003'),
('AT180105', '0cc175b9c0f1b6a831c399e269772661', 'Phạm Thành Công', 'Nam', 'AT18A', 'Điện Tử Viễn Thông', 0, '3/8/2003'),
('AT180106', '202cb962ac59075b964b07152d234b70', 'Trần Phương Nga', 'Nữ', 'AT18C', 'Điện Tử Viễn Thông', 0, '31/8/2003'),
('AT180107', '0cc175b9c0f1b6a831c399e269772661', 'Trần Hồng Nhung', 'Nữ', 'AT18B', 'An Toàn Thông Tin', 0, '3/7/2003'),
('AT180130', '0cc175b9c0f1b6a831c399e269772661', 'Nguyễn Khánh Linh', 'Nữ', 'AT18B', 'An Toàn Thông Tin', 0, '1/1/2003'),
('AT180132', '0cc175b9c0f1b6a831c399e269772661', 'Nguyễn Phương Mai', 'Nữ', 'AT18A', 'An Toàn Thông Tin', 0, '12-07-2003');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `muonsach`
--
ALTER TABLE `muonsach`
  ADD PRIMARY KEY (`Mamuonsach`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`Masach`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`MaSV`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `muonsach`
--
ALTER TABLE `muonsach`
  MODIFY `Mamuonsach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
