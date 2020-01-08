/*
 Navicat Premium Data Transfer

 Source Server         : demo-wekids
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : 101.37.152.203:3306
 Source Schema         : wekids

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 06/01/2020 15:50:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(11) NOT NULL,
  `nick` varchar(30) DEFAULT NULL,
  `gender` enum('girl','boy') DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `avatar` text,
  `score` int(11) DEFAULT NULL,
  `childrenIds` varchar(100) DEFAULT NULL,
  `wechatAccount` varchar(32) DEFAULT NULL,
  `last_sign_in_at` datetime DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uid` (`uid`),
  UNIQUE KEY `user_phone` (`phone`),
  KEY `user_children_ids` (`childrenIds`)
) ENGINE=InnoDB AUTO_INCREMENT=10537 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
