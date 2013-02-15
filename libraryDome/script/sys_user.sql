/*
Navicat MySQL Data Transfer

Source Server         : MY
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2012-12-15 16:43:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userID` varchar(64) NOT NULL DEFAULT '',
  `name` varchar(200) DEFAULT NULL,
  `password` varchar(100) DEFAULT '密码',
  `createdatec` varchar(20) DEFAULT '创建时间',
  `isDeletec` varchar(4) DEFAULT '删除标志',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


