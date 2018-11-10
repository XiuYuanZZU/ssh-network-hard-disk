/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-11-09 13:35:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '1');
INSERT INTO `user` VALUES ('2', '2222', '2');
INSERT INTO `user` VALUES ('3', 'test', 'jimi');
INSERT INTO `user` VALUES ('4', 'lisi', 'lisi');
INSERT INTO `user` VALUES ('5', 'jimisun', 'jimisun');
