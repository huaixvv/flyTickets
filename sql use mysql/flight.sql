/*
Navicat MySQL Data Transfer

Source Server         : MyConn
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : saletickets

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-04-22 21:51:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for flight
-- ----------------------------
DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight` (
  `fid` varchar(11) COLLATE utf8_bin NOT NULL,
  `fBegin` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `fEnd` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `sTime` datetime DEFAULT NULL,
  `eTime` datetime DEFAULT NULL,
  `price` double DEFAULT NULL,
  `seatsum` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of flight
-- ----------------------------
INSERT INTO `flight` VALUES ('c001', '北京', '长沙', '2019-05-08 09:57:00', '2019-05-08 11:50:00', '1001.2', '0');
INSERT INTO `flight` VALUES ('c002', '北京', '上海', '2019-09-02 10:56:00', '2019-09-02 13:20:00', '982', '100');
INSERT INTO `flight` VALUES ('c003', '上海', '西安', '2019-06-29 17:50:00', '2019-06-29 19:50:00', '125', '100');
INSERT INTO `flight` VALUES ('c004', '上海', '北京', '2019-04-17 05:10:00', '2019-04-17 08:09:00', '651', '100');
INSERT INTO `flight` VALUES ('c005', '北京', '济南', '2019-04-26 14:12:00', '2019-04-26 16:19:00', '654.2', '100');
INSERT INTO `flight` VALUES ('c006', '云南', '武汉', '2019-04-16 08:06:00', '2019-04-16 10:54:00', '782', '100');
INSERT INTO `flight` VALUES ('c007', '云南', '西安', '2019-06-23 10:00:00', '2019-06-23 12:00:00', '124', '99');
INSERT INTO `flight` VALUES ('c008', '西安', '云南', '2019-05-22 03:05:00', '2019-05-22 05:35:00', '254', '100');
INSERT INTO `flight` VALUES ('c009', '长沙', '长春', '2019-06-12 19:54:00', '2019-06-12 21:14:00', '365', '100');
INSERT INTO `flight` VALUES ('c010', '成都', '郑州', '2019-05-16 16:26:00', '2019-05-16 18:29:00', '456.2', '100');
INSERT INTO `flight` VALUES ('c011', '西安', '沈阳', '2019-08-13 08:09:00', '2019-08-13 10:20:00', '154.8', '99');
INSERT INTO `flight` VALUES ('c012', '四川', '青岛', '2019-04-06 21:45:00', '2019-04-06 23:12:00', '458', '100');
INSERT INTO `flight` VALUES ('c013', '张家界', '南昌', '2019-04-20 17:57:00', '2019-04-20 19:00:00', '1542', '100');
INSERT INTO `flight` VALUES ('c014', '太原', '无锡', '2019-05-05 18:18:00', '2019-05-05 20:20:00', '564', '100');
INSERT INTO `flight` VALUES ('c015', '深圳', '西安', '2019-05-15 17:00:00', '2019-05-15 19:00:00', '987', '100');
INSERT INTO `flight` VALUES ('c016', '北京', '长沙', '2019-05-08 10:57:00', '2019-05-08 13:50:00', '1201.2', '97');
INSERT INTO `flight` VALUES ('c017', '北京', '上海', '2019-09-02 20:56:00', '2019-09-02 23:20:00', '962', '56');
INSERT INTO `flight` VALUES ('c018', '上海', '西安', '2019-06-29 06:50:00', '2019-06-29 11:50:00', '565', '100');
INSERT INTO `flight` VALUES ('c019', '上海', '北京', '2019-04-17 12:10:00', '2019-04-17 17:09:00', '951', '100');
INSERT INTO `flight` VALUES ('c020', '北京', '济南', '2019-04-26 09:12:00', '2019-04-26 13:19:00', '564.2', '100');
INSERT INTO `flight` VALUES ('c021', '云南', '武汉', '2019-04-16 19:06:00', '2019-04-16 21:54:00', '232', '100');
INSERT INTO `flight` VALUES ('c022', '云南', '西安', '2019-06-23 05:00:00', '2019-06-23 08:00:00', '894', '100');
INSERT INTO `flight` VALUES ('c023', '西安', '云南', '2019-05-22 06:05:00', '2019-05-22 10:35:00', '234', '100');
INSERT INTO `flight` VALUES ('c024', '长沙', '长春', '2019-06-12 12:54:00', '2019-06-12 16:14:00', '255', '100');
INSERT INTO `flight` VALUES ('c025', '成都', '郑州', '2019-05-16 14:26:00', '2019-05-16 17:29:00', '366.2', '100');
INSERT INTO `flight` VALUES ('c026', '西安', '沈阳', '2019-08-13 18:09:00', '2019-08-13 21:20:00', '125.8', '100');
INSERT INTO `flight` VALUES ('c027', '四川', '青岛', '2019-04-06 23:45:00', '2019-04-07 02:12:00', '569', '100');
INSERT INTO `flight` VALUES ('c028', '张家界', '南昌', '2019-04-20 03:57:00', '2019-04-20 06:00:00', '1232', '100');
INSERT INTO `flight` VALUES ('c029', '太原', '无锡', '2019-05-05 11:18:00', '2019-05-05 15:20:00', '545', '100');
INSERT INTO `flight` VALUES ('c030', '深圳', '西安', '2019-05-15 16:00:00', '2019-05-15 22:00:00', '567', '100');
