-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2015 at 05:51 PM
-- Server version: 5.6.25
-- PHP Version: 5.5.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectx`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `Category_ID` int(2) NOT NULL,
  `Category_Name` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `code`
--

CREATE TABLE IF NOT EXISTS `code` (
  `code_ID` int(4) NOT NULL,
  `deal_ID` int(4) NOT NULL,
  `user_ID` int(4) NOT NULL,
  `code_Code` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code_Use` tinyint(1) NOT NULL,
  `code_Date` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `code`
--

INSERT INTO `code` (`code_ID`, `deal_ID`, `user_ID`, `code_Code`, `code_Use`, `code_Date`) VALUES
(1, 1, 1, 'j6TWPkMZswe33Y75NOB1LxU/MPeFahv1', 1, '2015-05-31'),
(13, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(14, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(15, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(16, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(17, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(18, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(19, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(20, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(21, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(22, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(23, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(24, 1, 1, 'TxGkvEQ5Ie3vPKCrzYnCBRU/MPeFahv1', 1, '2015-06-03'),
(25, 1, 1, 'uDS+IAR/7vjDIuu857uMaA==', 1, '2015-06-03'),
(26, 1, 1, 'uDS+IAR/7vjDIuu857uMaA==', 1, '2015-06-03'),
(27, 2, 1, 'uDS+IAR/7viaURNH9DBhLQ==', 1, '2015-06-03'),
(28, 1, 2, 'VEucT+ubNR/DIuu857uMaA==', 0, '2015-06-03'),
(29, 1, 3, '/SAPjchYooLDIuu857uMaA==', 1, '2015-06-03');

-- --------------------------------------------------------

--
-- Table structure for table `deal`
--

CREATE TABLE IF NOT EXISTS `deal` (
  `deal_ID` int(4) NOT NULL,
  `deal_Name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `category_ID` int(2) NOT NULL,
  `shop_ID` int(4) NOT NULL,
  `deal_Detail` text COLLATE utf8_unicode_ci NOT NULL,
  `deal_Img` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `deal_Count` int(4) NOT NULL,
  `deal_Expdate` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `deal`
--

INSERT INTO `deal` (`deal_ID`, `deal_Name`, `category_ID`, `shop_ID`, `deal_Detail`, `deal_Img`, `deal_Count`, `deal_Expdate`) VALUES
(1, 'คุ๊กกี้ พี่แจน', 3, 1, 'อร่อยมากนะจ๊ะ ซืิ้อ3 ฟรี4 สำหรับน้องๆ SIT เท่านั้น', 'desert01.jpg', 3, '2015-06-03'),
(2, 'พายบลูเบอร์รี่ ซื้อ 1 แถม 1', 3, 12, 'ซื้อพายบลูเบอร์รี่ ซื้อ 1 แถม 1ตั้งแต่ วันนี้ - วันที่ 23 มิ.ย. 58', 'desert04.jpg', 20, '2015-06-03'),
(3, 'น้ำปั่น ICeZYY', 2, 1, 'ซ้ื้อกินวันนี้อร่อยยันวันหน้า ลด 80% ', 'drink01.jpg', 30, '2015-06-30'),
(4, 'Strawyyy อภิมหาสตอเบอรี่ ', 3, 1, 'ขายถูกๆ แจ้ อร่อยมากนะจ๊ะ', 'desert03.jpg', 5, '2015-06-29'),
(7, 'SOMTAM Aroii', 1, 12, 'ส้มตำ บุฟเฟ่พี่ไผ่ มา4จ่าย1 ด่วน มีจำนวนจำกัด', 'food03.jpg', 10, '2015-06-20'),
(8, 'Streakkkkk Pa SAo', 1, 1, 'ขายสเต็กจ้าาา อยากให้ น้องๆSIT ลองมากิน ลดให้เป็นพิเศษ 50% จ้าาา', 'food04.jpg', 15, '2015-07-16'),
(12, 'P&P คอนเฟลกคาราเมล', 2, 14, 'คอนเฟลกคาราเมล อบ หอม กรุ่น อร่อย\r\nซื้อ 2 แถม 1', 'drink03.jpg', 50, '2015-08-13'),
(13, 'AINOMOTO SUSHI', 1, 14, 'เชิญชวนให้มาชิมครับ เพิ่งเปิดร้านใหม่ รับรองรสชาติครับ จั่นเจาหล่อมากครับ', 'food06.jpg', 25, '2015-07-07');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE IF NOT EXISTS `history` (
  `history_ID` int(11) NOT NULL,
  `history_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_ID` int(4) NOT NULL,
  `deal_ID` int(4) NOT NULL,
  `action` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`history_ID`, `history_date`, `user_ID`, `deal_ID`, `action`) VALUES
(4, '2015-06-01 09:10:58', 1, 1, 0),
(5, '2015-06-01 09:10:58', 1, 1, 1),
(6, '2015-06-01 16:15:55', 1, 1, 0),
(7, '2015-06-01 16:15:57', 1, 1, 1),
(8, '2015-06-01 16:16:49', 1, 1, 0),
(9, '2015-06-01 16:16:51', 1, 1, 1),
(10, '2015-06-01 16:29:49', 1, 1, 0),
(11, '2015-06-01 16:29:50', 1, 1, 1),
(12, '2015-06-01 16:30:22', 1, 1, 1),
(13, '2015-06-01 16:31:09', 1, 1, 1),
(14, '2015-06-01 16:32:19', 1, 1, 0),
(15, '2015-06-01 16:32:19', 1, 1, 1),
(16, '2015-06-01 16:34:02', 1, 2, 0),
(17, '2015-06-01 16:34:02', 1, 1, 1),
(18, '2015-06-01 16:34:14', 1, 1, 1),
(19, '2015-06-01 16:34:42', 1, 1, 1),
(20, '2015-06-01 16:53:25', 1, 1, 1),
(21, '2015-06-01 17:08:52', 1, 1, 1),
(22, '2015-06-01 17:10:00', 1, 1, 1),
(23, '2015-06-01 17:10:59', 1, 1, 1),
(24, '2015-06-01 17:11:03', 1, 1, 1),
(25, '2015-06-01 17:13:16', 1, 1, 1),
(26, '2015-06-01 17:13:21', 1, 1, 1),
(27, '2015-06-01 17:14:47', 1, 1, 1),
(28, '2015-06-01 17:14:49', 1, 1, 1),
(29, '2015-06-01 17:16:07', 1, 1, 1),
(30, '2015-06-01 17:16:10', 1, 1, 1),
(31, '2015-06-01 17:16:31', 1, 1, 1),
(32, '2015-06-01 17:42:55', 1, 1, 1),
(33, '2015-06-01 17:43:12', 1, 1, 1),
(34, '2015-06-01 17:43:30', 1, 1, 1),
(35, '2015-06-01 17:45:42', 1, 1, 1),
(36, '2015-06-01 17:46:48', 1, 2, 1),
(37, '2015-06-01 17:47:22', 1, 2, 1),
(38, '2015-06-01 17:47:50', 1, 2, 1),
(39, '2015-06-01 17:47:58', 1, 2, 1),
(40, '2015-06-01 17:48:53', 2, 1, 0),
(41, '2015-06-01 17:48:55', 1, 1, 1),
(42, '2015-06-01 17:50:45', 3, 1, 0),
(43, '2015-06-01 17:50:46', 1, 1, 1),
(44, '2015-06-01 17:51:22', 1, 2, 1),
(45, '2015-06-01 17:51:47', 3, 1, 1),
(46, '2015-06-01 17:58:17', 1, 1, 1),
(47, '2015-06-01 17:58:17', 1, 1, 1),
(48, '2015-06-01 17:58:29', 3, 1, 1),
(49, '2015-06-01 17:59:34', 3, 1, 1),
(50, '2015-06-01 18:00:02', 3, 1, 1),
(51, '2015-06-01 18:01:11', 3, 1, 1),
(52, '2015-06-01 18:01:42', 3, 1, 1),
(53, '2015-06-01 18:01:51', 3, 1, 1),
(54, '2015-06-01 18:02:08', 3, 1, 1),
(55, '2015-06-01 18:02:16', 3, 1, 1),
(56, '2015-06-01 18:02:27', 3, 1, 1),
(57, '2015-06-01 18:02:40', 3, 1, 1),
(58, '2015-06-01 18:02:56', 3, 1, 1),
(59, '2015-06-01 18:03:10', 3, 1, 1),
(60, '2015-06-01 18:03:30', 3, 1, 1),
(61, '2015-06-01 18:03:53', 3, 1, 1),
(62, '2015-06-01 18:04:42', 3, 1, 1),
(63, '2015-06-01 18:04:50', 3, 1, 1),
(64, '2015-06-01 18:05:26', 3, 1, 1),
(65, '2015-06-01 18:06:14', 1, 1, 1),
(66, '2015-06-01 18:06:43', 3, 1, 1),
(67, '2015-06-01 18:10:50', 1, 1, 1),
(68, '2015-06-01 18:14:32', 1, 1, 1),
(69, '2015-06-01 18:14:35', 1, 1, 1),
(70, '2015-06-01 18:14:37', 1, 1, 1),
(71, '2015-06-01 18:14:43', 3, 1, 1),
(72, '2015-06-01 18:16:47', 3, 1, 1),
(73, '2015-06-01 18:17:24', 3, 1, 1),
(74, '2015-06-01 18:17:56', 3, 1, 1),
(75, '2015-06-01 18:18:07', 3, 1, 1),
(76, '2015-06-01 18:18:22', 3, 1, 1),
(77, '2015-06-01 18:19:10', 0, 0, 1),
(78, '2015-06-01 18:19:10', 0, 0, 1),
(79, '2015-06-01 18:20:16', 3, 1, 1),
(80, '2015-06-01 18:20:26', 3, 1, 1),
(81, '2015-06-01 18:20:41', 3, 1, 1),
(82, '2015-06-01 18:20:50', 3, 1, 1),
(83, '2015-06-02 02:49:32', 1, 1, 1),
(84, '2015-06-02 04:19:18', 1, 1, 1),
(85, '2015-06-02 04:19:29', 1, 1, 1),
(86, '2015-06-02 04:32:02', 1, 1, 1),
(87, '2015-06-02 04:32:13', 1, 1, 1),
(88, '2015-06-02 04:32:14', 1, 1, 1),
(89, '2015-06-02 04:32:15', 1, 1, 1),
(90, '2015-06-02 04:32:16', 1, 1, 1),
(91, '2015-06-02 04:32:33', 1, 1, 1),
(92, '2015-06-02 04:33:59', 1, 1, 1),
(93, '2015-06-02 04:34:03', 1, 1, 1),
(94, '2015-06-02 04:35:25', 1, 1, 1),
(95, '2015-06-02 04:40:24', 1, 1, 1),
(96, '2015-06-02 04:40:36', 1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `shop`
--

CREATE TABLE IF NOT EXISTS `shop` (
  `shop_ID` int(4) NOT NULL,
  `user_ID` int(4) NOT NULL,
  `shop_Name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `shop_Email` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `shop_Tel` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `shop_Address` text COLLATE utf8_unicode_ci NOT NULL,
  `shop_Img` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `shop_Key` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `shop`
--

INSERT INTO `shop` (`shop_ID`, `user_ID`, `shop_Name`, `shop_Email`, `shop_Tel`, `shop_Address`, `shop_Img`, `shop_Key`) VALUES
(1, 2, 'ขนมปังแม่หมี', 'BigMumBear@hotmail.co.th', '0888888888', '12/1', 'bread.jpg', '+OYIf2fEttw='),
(3, 2, 'ไก้ย่างลุงสามารถ', 'Samarth@yahoo.com', '0877777777', '56/2', 'chicken.jpg', 'Gd8csPIEJZ4='),
(4, 2, 'ส้มตำป้าแตน', 'taen_somtum@hotmail.com', '0899999999', '66/123', 'somtum.jpg', '31GdTM2PiVs='),
(5, 1, 'JJ SHOP', 'a@a.com', '0820505728', 'dsfafsdafsadfdasfsdfsdf ADDRESS', '123456.jpg', 'WC+krUrjPVc=');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_ID` int(4) NOT NULL,
  `student_ID` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `user_Name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `user_Lname` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `user_Email` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `user_Password` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `user_Address` text COLLATE utf8_unicode_ci NOT NULL,
  `user_Tel` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `user_Status` int(1) NOT NULL,
  `user_Img` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_ID`, `student_ID`, `user_Name`, `user_Lname`, `user_Email`, `user_Password`, `user_Address`, `user_Tel`, `user_Status`, `user_Img`) VALUES
(1, '57130500080', 'Samuch', 'Juntanukoon', 'Samuchza@hotmail.com', '1111', '5 Kleng Rayong', '0814368119', 1, '57130500080.jpg'),
(2, '57130500053', 'Reawpai', 'Chunsoi', 'Phaiza2537@hotmail.com', '1234', '99/9', '0822222222', 2, '57130500053.jpg'),
(3, '57130500028', 'ทรงฤทธิ์', 'เกิดผล', 'Songrit.k@mail.kmutt.ac.th', '1234', '33/3 ประชาอุทิศทุ่งครุ', '0820505728', 3, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Category_ID`);

--
-- Indexes for table `code`
--
ALTER TABLE `code`
  ADD PRIMARY KEY (`code_ID`);

--
-- Indexes for table `deal`
--
ALTER TABLE `deal`
  ADD PRIMARY KEY (`deal_ID`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`history_ID`);

--
-- Indexes for table `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`shop_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `code`
--
ALTER TABLE `code`
  MODIFY `code_ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `deal`
--
ALTER TABLE `deal`
  MODIFY `deal_ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `history_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=97;
--
-- AUTO_INCREMENT for table `shop`
--
ALTER TABLE `shop`
  MODIFY `shop_ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_ID` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
