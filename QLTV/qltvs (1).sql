-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 14, 2023 lúc 05:46 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qltvs`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `muonsach`
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
-- Đang đổ dữ liệu cho bảng `muonsach`
--

INSERT INTO `muonsach` (`Mamuonsach`, `Masach`, `MaSV`, `Soluong`, `Ngaymuon`, `Ngayhentra`, `Ngaytra`, `Tinhtrang`) VALUES
(1, 'KMA01', 'AT180132', 10, '14-12-2023', '29-12-2023', NULL, 0),
(2, 'KMA02', 'AT180132', 10, '14-12-2023', '29-12-2023', NULL, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sach`
--

CREATE TABLE `sach` (
  `Masach` varchar(255) NOT NULL,
  `Tensach` varchar(255) NOT NULL,
  `Theloai` varchar(255) NOT NULL,
  `Soluong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sach`
--

INSERT INTO `sach` (`Masach`, `Tensach`, `Theloai`, `Soluong`) VALUES
('KMA01', 'Triết', 'Đại cương', 90),
('KMA02', 'Toán cao cấp', 'Đại cương', 90);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
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
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`MaSV`, `Password`, `Hoten`, `Gioitinh`, `Lop`, `Khoa`, `Level`, `Ngaysinh`) VALUES
('a', '0cc175b9c0f1b6a831c399e269772661', '', '', '', '', 1, ''),
('AT180132', '0cc175b9c0f1b6a831c399e269772661', 'Nguyễn Phương Mai', 'Nữ', 'AT18A', 'An Toàn Thông Tin', 0, '12-07-2003');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `muonsach`
--
ALTER TABLE `muonsach`
  ADD PRIMARY KEY (`Mamuonsach`);

--
-- Chỉ mục cho bảng `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`Masach`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`MaSV`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `muonsach`
--
ALTER TABLE `muonsach`
  MODIFY `Mamuonsach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
