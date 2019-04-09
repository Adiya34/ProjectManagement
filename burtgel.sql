-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2019 at 10:20 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `burtgel`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `FirstName` varchar(50) COLLATE utf16_unicode_ci NOT NULL,
  `LastName` varchar(50) COLLATE utf16_unicode_ci NOT NULL,
  `Sex` varchar(6) COLLATE utf16_unicode_ci NOT NULL,
  `Age` char(11) COLLATE utf16_unicode_ci NOT NULL,
  `SisiID` varchar(12) COLLATE utf16_unicode_ci NOT NULL,
  `Profession` varchar(50) COLLATE utf16_unicode_ci NOT NULL,
  `Branch` varchar(50) COLLATE utf16_unicode_ci NOT NULL,
  `Phone` char(25) COLLATE utf16_unicode_ci NOT NULL,
  `Address` text COLLATE utf16_unicode_ci NOT NULL,
  `Register` varchar(10) COLLATE utf16_unicode_ci NOT NULL,
  `Allergyinfo` varchar(255) COLLATE utf16_unicode_ci NOT NULL,
  `Email` varchar(100) COLLATE utf16_unicode_ci NOT NULL,
  `EMD` varchar(9) COLLATE utf16_unicode_ci NOT NULL,
  `Job` varchar(25) COLLATE utf16_unicode_ci NOT NULL,
  `Education` varchar(25) COLLATE utf16_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `FirstName`, `LastName`, `Sex`, `Age`, `SisiID`, `Profession`, `Branch`, `Phone`, `Address`, `Register`, `Allergyinfo`, `Email`, `EMD`, `Job`, `Education`) VALUES
(1, 'Bat', 'Bold', 'Male', '20', '16b1seas0447', 'Program hangamj', 'HSHIUS', '89455612', 'Ulaanbaatar', 'UB99122345', 'baihgui', 'bold@gmail.com', '00000', 'oyutan', 'dund'),
(2, 'Tsogtsaihan', 'Tserensuren', 'Female', '21', '15b1seas0447', 'Program hangamj', 'HSHIUS', '86830106', 'Ulaanbaatar', 'IG98010607', 'Baihgui', 'ttseegii752@gmail.com', '000000', 'oyutan', 'dund'),
(4, '', '', 'Male', '', '', '', '', '', '', '', '', '', '', '', ''),
(5, 'vgw', 'bhenet', 'Male', 'beb', ' enn', 'be', 'bne', '16', 'be', 'bnet', 'b3wt', ' bn4e', 'b43', ' bne4t', 'b4t5');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) COLLATE utf16_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf16_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'emch', '12345'),
(3, 'suwilagch', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
