/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1@test
Source Server Version : 50722
Source Host           : 127.0.0.1:3306
Source Database       : springboot_baseline

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-01-24 18:16:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hospital_id` int(11) NOT NULL DEFAULT '2109' COMMENT '医院id,用于区分多院区用户',
  `hospital_user_id` int(11) DEFAULT NULL COMMENT '用户在对应医院下的id',
  `login_name` varchar(32) NOT NULL COMMENT '登陆名',
  `login_password` varchar(256) DEFAULT NULL COMMENT '登陆密码',
  `real_name` varchar(16) DEFAULT NULL COMMENT '真实姓名，必填',
  `id_card` varchar(32) DEFAULT NULL COMMENT '身份证号码',
  `treatment_card_number` varchar(255) DEFAULT NULL COMMENT '就诊卡号',
  `sex` char(1) DEFAULT NULL COMMENT '性别 1男 2女',
  `phone` varchar(16) DEFAULT NULL COMMENT '手机号码',
  `province` varchar(16) DEFAULT NULL COMMENT '所在省（市）',
  `city` varchar(16) DEFAULT NULL COMMENT '所在城市',
  `security_key` varchar(128) DEFAULT NULL COMMENT '钥密',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `birthday` varchar(16) DEFAULT NULL COMMENT '生日',
  `login_times` int(11) DEFAULT '0' COMMENT '登陆次数',
  `photo` varchar(64) DEFAULT NULL COMMENT '头像',
  `address` varchar(64) DEFAULT NULL COMMENT '地址',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `medicare_type` char(2) DEFAULT NULL COMMENT '0:医保卡 1：普通就诊卡 2：无',
  `black_list` char(1) DEFAULT '1' COMMENT '是否为黑名单，0是，1否',
  `is_delete` char(1) DEFAULT '1' COMMENT ' 0：删除 1：未删除',
  `wechat` varchar(128) DEFAULT NULL COMMENT '微信号',
  `equipment_id` char(1) DEFAULT NULL COMMENT '注册设备。"1"APP,“2"微信',
  `ali_user_id` varchar(128) DEFAULT NULL COMMENT '支付宝用户id',
  `extend_params` varchar(256) DEFAULT NULL COMMENT '扩展字段',
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginName` (`login_name`) USING HASH,
  UNIQUE KEY `primaryKey` (`id`) USING BTREE,
  UNIQUE KEY `openid` (`wechat`) USING BTREE,
  UNIQUE KEY `aliuserid` (`ali_user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
