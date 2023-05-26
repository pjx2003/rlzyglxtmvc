/*
 Navicat MySQL Data Transfer

 Source Server         : Databases
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : pmanage

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 26/05/2023 13:09:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for logon
-- ----------------------------
DROP TABLE IF EXISTS `logon`;
CREATE TABLE `logon`  (
  `username` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of logon
-- ----------------------------
INSERT INTO `logon` VALUES ('等风', '1111');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(7) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性名',
  `password` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `gender` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `department` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门',
  `phone` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (1, '我找你呀', '123456', '男', 20, NULL, '18173862609');
INSERT INTO `person` VALUES (2, '想你', '123456', '男', 21, '培训管理部', '18173862609');
INSERT INTO `person` VALUES (3, '等风', '12345', '男', 20, '财务部', '1234567890');
INSERT INTO `person` VALUES (4, '你找我', '123456', '男', 21, '研发部', '12345678');
INSERT INTO `person` VALUES (23, '张三', '12345', '男', 20, '人事部', '12345678');
INSERT INTO `person` VALUES (24, '张三', '12345', '男', 20, '人事部', '12345678');
INSERT INTO `person` VALUES (25, '李四', '123456', '男', 20, '培训管理部', '12345678');
INSERT INTO `person` VALUES (26, '王五', '123456', '男', 22, '财务部', '12345678');
INSERT INTO `person` VALUES (27, '牛马', '12345', '男', 19, '研发部', '12345678');
INSERT INTO `person` VALUES (28, '牛马', '23456', '女', 21, '研发部', '123456');
INSERT INTO `person` VALUES (29, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (30, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (31, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (32, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (33, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (34, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (35, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (36, '牛马', '123456', '男', 19, '人事部', '1234567');
INSERT INTO `person` VALUES (37, '牛马', '123456', '男', 19, '人事部', '1234567');

-- ----------------------------
-- Table structure for training
-- ----------------------------
DROP TABLE IF EXISTS `training`;
CREATE TABLE `training`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `trainname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `trainpeople` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `traintime` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of training
-- ----------------------------
INSERT INTO `training` VALUES (1, '普通话培训', '等你', 2);
INSERT INTO `training` VALUES (2, '服务态度培训', '等我', 2);
INSERT INTO `training` VALUES (3, '框架培训', '等风', 3);

SET FOREIGN_KEY_CHECKS = 1;
