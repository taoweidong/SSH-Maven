/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-12-25 22:07:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pms_user
-- ----------------------------
DROP TABLE IF EXISTS `pms_user`;
CREATE TABLE `pms_user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of pms_user
-- ----------------------------
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b07c81000a', '李三', 'F', '23');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b09447000b', 'test_0', 'M', '10');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b0945d000c', 'test_1', 'M', '11');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b09474000d', 'test_2', 'M', '12');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b09498000e', 'test_3', 'M', '13');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b094b7000f', 'test_4', 'M', '14');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b094d50010', 'test_5', 'M', '15');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b094f70011', 'test_6', 'M', '16');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b095100012', 'test_7', 'M', '17');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b095540013', 'test_8', 'M', '18');
INSERT INTO `pms_user` VALUES ('4028668167e5afe00167e5b0956c0014', 'test_9', 'M', '19');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一ID',
  `age` int(11) NOT NULL COMMENT '年齡',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '32', '李修改');
INSERT INTO `user` VALUES ('4', '233', '诸葛连弩');
INSERT INTO `user` VALUES ('5', '25', '李测试');
