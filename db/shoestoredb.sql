-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2021 at 10:16 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shoestoredb`
--

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `shoe_id` int(11) NOT NULL,
  `price` double NOT NULL,
  `qty` int(11) NOT NULL,
  `created` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `shoe`
--

CREATE TABLE `shoe` (
  `id` bigint(20) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` text DEFAULT 'Nice and Wonderful shoes. Pair of shoes for all ages',
  `active` bit(1) NOT NULL DEFAULT b'1',
  `category` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT 'black',
  `in_stock_number` int(11) NOT NULL DEFAULT 1000,
  `list_price` double NOT NULL DEFAULT 500,
  `our_price` double NOT NULL DEFAULT 139,
  `size` int(11) NOT NULL DEFAULT 45,
  `sku` int(11) NOT NULL DEFAULT 1234432,
  `shipping_weight` double NOT NULL DEFAULT 1
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shoe`
--

INSERT INTO `shoe` (`id`, `title`, `description`, `active`, `category`, `color`, `in_stock_number`, `list_price`, `our_price`, `size`, `sku`, `shipping_weight`) VALUES
(1, 'Women\'s Boots Shoes Maca', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'Brown', 35, 1000, 139, 40, 1111111111, 1),
(2, 'Women\'s Minam Meaghan', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'black', 23, 1000, 139, 33, 23, 23),
(3, 'Men\'s Taja Commissioner', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Men', 'black', 24, 1000, 139, 24, 24, 24),
(4, 'Russ Men\'s Sneakers', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Men', 'black', 44, 1000, 139, 44, 44, 44),
(5, 'Women\'s Boots Shoes Maca', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'black', 44, 1000, 139, 44, 44, 44),
(6, 'Women\'s Boots Shoes Maca', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'black', 44, 1000, 139, 4, 344, 3),
(7, 'Women\'s Boots Shoes Maca', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'black', 1000, 500, 139, 45, 234, 1),
(8, 'Women\'s Boots Shoes Maca', '\'Nice and Wonderful shoes. Pair of shoes for all ages\'', b'1', 'Women', 'black', 1000, 500, 139, 45, 224, 1),
(9, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 123443, 1),
(10, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 123443200, 1),
(11, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1),
(12, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1),
(13, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1),
(14, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1),
(15, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1),
(16, 'Women\'s Boots Shoes Maca', 'Nice and Wonderful shoes. Pair of shoes for all ages', b'1', 'Women', 'black', 1000, 500, 139, 45, 1234432, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `address`, `email`, `enabled`, `firstname`, `lastname`, `password`, `phone`, `username`) VALUES
(1, 'somewhere in lagos', 'demo@gmail.com', b'1', 'Demo', 'Dev', '$2a$10$sZLjvQREAAWKk4YaMoh3Uud4QiygmpDITBO5e.FrwCP3p7dnlC1Ni', NULL, 'demoUser'),
(2, 'somewhere in lagos', 'admin@gmail.com', b'1', 'Joseph', 'Bello', '$2a$10$FZIIFVOzerlkK3f1mtcbU.1QaC.kwOqWvRJl3un7AjRy.nq1ygS6.', NULL, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `user_role_id` bigint(20) NOT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`user_role_id`, `role_id`, `user_id`) VALUES
(1, 1, 1),
(2, 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `user_roles`
--

CREATE TABLE `user_roles` (
  `users_id` bigint(20) NOT NULL,
  `roles_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shoe`
--
ALTER TABLE `shoe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_role_id`),
  ADD KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  ADD KEY `FK859n2jvi8ivhui0rl0esws6o` (`user_id`);

--
-- Indexes for table `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`users_id`,`roles_id`),
  ADD KEY `FKj9553ass9uctjrmh0gkqsmv0d` (`roles_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `shoe`
--
ALTER TABLE `shoe`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user_role`
--
ALTER TABLE `user_role`
  MODIFY `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
