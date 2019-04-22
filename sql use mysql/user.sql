/*
Navicat MySQL Data Transfer

Source Server         : MyConn
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : saletickets

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-22 21:51:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(11) COLLATE utf8_bin NOT NULL,
  `uname` varchar(31) COLLATE utf8_bin NOT NULL,
  `psd` varchar(31) COLLATE utf8_bin NOT NULL,
  `sex` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `adress` varchar(31) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('use-AzAJ', '小明', '123456', '男', '25', '南京');
INSERT INTO `user` VALUES ('use-M7ZV', '小青', 'ccc', '女', '19', '西安');
INSERT INTO `user` VALUES ('use-stjn', '赵子龙', 'abc123', '男', '19', '北京');
INSERT INTO `user` VALUES ('usernDkb', 'xxxx', 'ccc', '男', '19', '南京');
