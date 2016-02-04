/*
Navicat MySQL Data Transfer

Source Server         : xz
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : echarge

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2016-01-25 16:30:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `A_ID` varchar(20) NOT NULL,
  `A_Password` varchar(30) default NULL,
  `A_Memo` varchar(200) default NULL,
  PRIMARY KEY  (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('a01', '123', null);
INSERT INTO `t_admin` VALUES ('admin', 'admin', null);

-- ----------------------------
-- Table structure for t_booking
-- ----------------------------
DROP TABLE IF EXISTS `t_booking`;
CREATE TABLE `t_booking` (
  `B_ID` varchar(20) NOT NULL,
  `U_ID` varchar(30) NOT NULL,
  `CP_ID` varchar(20) NOT NULL,
  `B_Time` datetime default NULL,
  `B_ValidPeriod` float default NULL,
  `B_Deposit` float(8,2) NOT NULL,
  `B_EndTime` datetime NOT NULL,
  `B_EndType` tinyint(4) NOT NULL,
  `B_Spend` float(8,2) default NULL,
  `B_Return` float(8,2) default NULL,
  `B_ReturnTime` datetime default NULL,
  `B_Memo` varchar(400) default NULL,
  `O_ID` varchar(20) default NULL,
  PRIMARY KEY  (`B_ID`),
  KEY `FK_Reference_28` (`O_ID`),
  KEY `FK_预约充电` (`U_ID`),
  KEY `FK_预约充电1` (`CP_ID`),
  CONSTRAINT `FK_预约充电` FOREIGN KEY (`U_ID`) REFERENCES `t_user` (`U_ID`),
  CONSTRAINT `FK_预约充电1` FOREIGN KEY (`CP_ID`) REFERENCES `t_chgpile` (`CP_ID`),
  CONSTRAINT `FK_Reference_28` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_booking
-- ----------------------------

-- ----------------------------
-- Table structure for t_chglog
-- ----------------------------
DROP TABLE IF EXISTS `t_chglog`;
CREATE TABLE `t_chglog` (
  `CL_ID` varchar(20) NOT NULL,
  `U_ID` varchar(30) NOT NULL,
  `CP_ID` varchar(20) NOT NULL,
  `CL_Port` int(11) default NULL,
  `CL_ChgType` int(11) default NULL,
  `CL_Start` datetime NOT NULL,
  `CL_End` datetime NOT NULL,
  `CL_TotlePower` float default NULL,
  `CL_ChgPower` float default NULL,
  `CL_PowerAfter` float default NULL,
  `CL_Spend` float(8,2) NOT NULL,
  `CL_Account` float(8,2) default NULL,
  `CL_Memo` varchar(400) default NULL,
  PRIMARY KEY  (`CL_ID`),
  KEY `FK_充电` (`U_ID`),
  KEY `FK_充电1` (`CP_ID`),
  CONSTRAINT `FK_充电` FOREIGN KEY (`U_ID`) REFERENCES `t_user` (`U_ID`),
  CONSTRAINT `FK_充电1` FOREIGN KEY (`CP_ID`) REFERENCES `t_chgpile` (`CP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_chglog
-- ----------------------------

-- ----------------------------
-- Table structure for t_chgpile
-- ----------------------------
DROP TABLE IF EXISTS `t_chgpile`;
CREATE TABLE `t_chgpile` (
  `CP_ID` varchar(20) NOT NULL,
  `CP_SerialNumber` varchar(20) default NULL,
  `CP_Longitude` decimal(9,6) default NULL,
  `CP_Latitude` decimal(9,6) default NULL,
  `CP_State` int(11) NOT NULL,
  `CP_Time` datetime default NULL,
  `FS_ID` int(11) NOT NULL,
  `CPT_ID` varchar(20) NOT NULL,
  `S_ID` varchar(20) NOT NULL,
  `O_ID` varchar(20) default NULL,
  PRIMARY KEY  (`CP_ID`),
  KEY `FK_Reference_22` (`O_ID`),
  KEY `FK_apply` (`FS_ID`),
  KEY `FK_belong11` (`S_ID`),
  KEY `FK_属于` (`CPT_ID`),
  CONSTRAINT `FK_apply` FOREIGN KEY (`FS_ID`) REFERENCES `t_pricestd` (`FS_ID`),
  CONSTRAINT `FK_belong11` FOREIGN KEY (`S_ID`) REFERENCES `t_station` (`S_ID`),
  CONSTRAINT `FK_Reference_22` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`),
  CONSTRAINT `FK_属于` FOREIGN KEY (`CPT_ID`) REFERENCES `t_chgpiletype` (`CPT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_chgpile
-- ----------------------------
INSERT INTO `t_chgpile` VALUES ('122112d', '322565', '111.000000', '111.000000', '1', '2016-01-16 20:57:47', '1', '1113', '1', 'a01');
INSERT INTO `t_chgpile` VALUES ('12331c', '12311', '111.300000', '133.300000', '1', '2016-01-14 11:16:59', '1', '1113', '1', 'a01');

-- ----------------------------
-- Table structure for t_chgpiletype
-- ----------------------------
DROP TABLE IF EXISTS `t_chgpiletype`;
CREATE TABLE `t_chgpiletype` (
  `CPT_ID` varchar(20) NOT NULL,
  `CPT_CurrentType` tinyint(1) default NULL,
  `CPT_ChgGun` int(11) default NULL,
  `CPT_PortType` int(11) default NULL,
  `CPT_Memo` tinyint(4) default NULL,
  `CPT_Time` datetime default NULL,
  `O_ID` varchar(20) default NULL,
  PRIMARY KEY  (`CPT_ID`),
  KEY `FK_Reference_29` (`O_ID`),
  CONSTRAINT `FK_Reference_29` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_chgpiletype
-- ----------------------------
INSERT INTO `t_chgpiletype` VALUES ('1113', '1', '1', '2', null, '2016-01-14 11:14:28', 'a01');

-- ----------------------------
-- Table structure for t_deposit
-- ----------------------------
DROP TABLE IF EXISTS `t_deposit`;
CREATE TABLE `t_deposit` (
  `D_ID` varchar(20) NOT NULL,
  `D_Money` float(8,2) NOT NULL,
  `D_Time` datetime NOT NULL,
  `D_Type` varchar(10) NOT NULL,
  `U_ID` varchar(30) NOT NULL,
  PRIMARY KEY  (`D_ID`),
  KEY `FK_充值` (`U_ID`),
  CONSTRAINT `FK_充值` FOREIGN KEY (`U_ID`) REFERENCES `t_user` (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_deposit
-- ----------------------------

-- ----------------------------
-- Table structure for t_errorlog
-- ----------------------------
DROP TABLE IF EXISTS `t_errorlog`;
CREATE TABLE `t_errorlog` (
  `EL_ID` int(11) NOT NULL,
  `EL_Type` varchar(20) NOT NULL,
  `EL_Memo` varchar(200) NOT NULL,
  `EL_Time` datetime NOT NULL,
  `EL_Del` tinyint(1) NOT NULL default '0',
  `A_ID` varchar(20) default NULL,
  PRIMARY KEY  (`EL_ID`),
  KEY `FK_Reference_21` (`A_ID`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`A_ID`) REFERENCES `t_admin` (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_errorlog
-- ----------------------------

-- ----------------------------
-- Table structure for t_module
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `M_ID` int(11) NOT NULL,
  `M_Name` varchar(40) NOT NULL,
  `M_Path` varchar(100) NOT NULL,
  `M_Desc` varchar(400) default NULL,
  `A_ID` varchar(20) NOT NULL,
  `M_Time` datetime NOT NULL,
  PRIMARY KEY  (`M_ID`),
  KEY `FK_模块管理` (`A_ID`),
  CONSTRAINT `FK_模块管理` FOREIGN KEY (`A_ID`) REFERENCES `t_admin` (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_module
-- ----------------------------

-- ----------------------------
-- Table structure for t_operator
-- ----------------------------
DROP TABLE IF EXISTS `t_operator`;
CREATE TABLE `t_operator` (
  `O_ID` varchar(20) NOT NULL,
  `O_Password` varchar(30) default NULL,
  `O_Name` varchar(20) NOT NULL,
  `O_IDCard` varchar(30) NOT NULL,
  `O_Department` varchar(30) default NULL,
  `O_Adress` varchar(40) default NULL,
  `O_Tel` varchar(16) default NULL,
  `O_Memo` varchar(200) default NULL,
  `R_ID` varchar(20) NOT NULL,
  `A_ID` varchar(20) NOT NULL,
  `O_Time` datetime NOT NULL,
  PRIMARY KEY  (`O_ID`),
  KEY `FK_客服管理` (`A_ID`),
  CONSTRAINT `FK_客服管理` FOREIGN KEY (`A_ID`) REFERENCES `t_admin` (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operator
-- ----------------------------
INSERT INTO `t_operator` VALUES ('a01', '123', '哈哈', '11111111111111111111', '答案啊', '错错错', '11111111111111', null, '电脑', 'admin', '2016-01-14 11:12:33');

-- ----------------------------
-- Table structure for t_parameter
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter`;
CREATE TABLE `t_parameter` (
  `P_ID` int(11) NOT NULL,
  `O_ID` varchar(20) NOT NULL,
  `P_Name` varchar(30) default NULL,
  `P_Value` varchar(30) default NULL,
  `P_Time` datetime default NULL,
  `P_Memo` varchar(400) default NULL,
  PRIMARY KEY  (`P_ID`),
  KEY `FK_设置` (`O_ID`),
  CONSTRAINT `FK_设置` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter
-- ----------------------------

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `P_ID` int(11) NOT NULL,
  `P_Insert` tinyint(1) default '0',
  `P_Update` tinyint(1) default '0',
  `P_Select` tinyint(1) default '0',
  `P_Delete` tinyint(1) default '0',
  `P_Import` tinyint(1) default '0',
  `P_Time` datetime NOT NULL,
  `A_ID` varchar(20) NOT NULL,
  `M_ID` int(11) NOT NULL,
  `R_ID` int(11) NOT NULL,
  PRIMARY KEY  (`P_ID`),
  KEY `FK_授权` (`R_ID`),
  KEY `FK_授权1` (`M_ID`),
  KEY `FK_授权2` (`A_ID`),
  CONSTRAINT `FK_授权` FOREIGN KEY (`R_ID`) REFERENCES `t_role` (`R_ID`),
  CONSTRAINT `FK_授权1` FOREIGN KEY (`M_ID`) REFERENCES `t_module` (`M_ID`),
  CONSTRAINT `FK_授权2` FOREIGN KEY (`A_ID`) REFERENCES `t_admin` (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_permission
-- ----------------------------

-- ----------------------------
-- Table structure for t_pricestd
-- ----------------------------
DROP TABLE IF EXISTS `t_pricestd`;
CREATE TABLE `t_pricestd` (
  `FS_ID` int(11) NOT NULL,
  `FS_Std` float(8,2) NOT NULL,
  `FS_Date` datetime default NULL,
  `O_ID` varchar(20) default NULL,
  PRIMARY KEY  (`FS_ID`),
  KEY `FK_Reference_27` (`O_ID`),
  CONSTRAINT `FK_Reference_27` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_pricestd
-- ----------------------------
INSERT INTO `t_pricestd` VALUES ('1', '0.20', '2016-01-19 11:16:18', 'a01');

-- ----------------------------
-- Table structure for t_repairlog
-- ----------------------------
DROP TABLE IF EXISTS `t_repairlog`;
CREATE TABLE `t_repairlog` (
  `RL_ID` varchar(20) NOT NULL,
  `CP_ID` varchar(20) NOT NULL,
  `RL_FaultTime` datetime NOT NULL,
  `RL_Desc` varchar(1000) NOT NULL,
  `O_ID` varchar(20) NOT NULL,
  `RL_RepairTime` datetime default NULL,
  `RL_Analysis` varchar(1000) default NULL,
  `RL_Solution` varchar(1000) default NULL,
  `RL_Result` tinyint(1) default '0',
  `RL_Time` datetime default NULL,
  PRIMARY KEY  (`RL_ID`),
  KEY `FK_录入` (`O_ID`),
  KEY `FK_故障维修` (`CP_ID`),
  CONSTRAINT `FK_录入` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`),
  CONSTRAINT `FK_故障维修` FOREIGN KEY (`CP_ID`) REFERENCES `t_chgpile` (`CP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repairlog
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `R_ID` int(11) NOT NULL,
  `R_Name` varchar(20) NOT NULL,
  `R_Desc` varchar(200) default NULL,
  `R_Time` datetime NOT NULL,
  `A_ID` varchar(20) NOT NULL,
  PRIMARY KEY  (`R_ID`),
  KEY `FK_角色管理` (`A_ID`),
  CONSTRAINT `FK_角色管理` FOREIGN KEY (`A_ID`) REFERENCES `t_admin` (`A_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_station
-- ----------------------------
DROP TABLE IF EXISTS `t_station`;
CREATE TABLE `t_station` (
  `S_ID` varchar(20) NOT NULL,
  `S_Name` varchar(20) default NULL,
  `S_Longitude` decimal(9,6) default NULL,
  `S_Latitude` decimal(9,6) default NULL,
  `S_Adress` varchar(40) default NULL,
  `S_Memo` varchar(400) default NULL,
  `S_Date` datetime default NULL,
  `O_ID` varchar(20) default NULL,
  PRIMARY KEY  (`S_ID`),
  KEY `FK_Reference_23` (`O_ID`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`O_ID`) REFERENCES `t_operator` (`O_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_station
-- ----------------------------
INSERT INTO `t_station` VALUES ('1', '天津工业大学', '117.116000', '39.077200', '天津市西青区天津工业大学', '天津工业大学计算机科学与软件学院', '2016-01-14 14:47:57', 'a01');
INSERT INTO `t_station` VALUES ('2', '天津工业大学', '116.116000', '38.077200', '天津市西青区天津工业大学', '圣纳科技充电站', '2016-01-16 20:54:37', 'a01');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `U_ID` varchar(30) NOT NULL,
  `U_Password` varchar(30) default NULL,
  `U_Tel` varchar(60) default NULL,
  `U_Name` varchar(30) default NULL,
  `U_CrdlType` varchar(10) NOT NULL,
  `U_CrdlNum` varchar(30) NOT NULL,
  `U_Email` varchar(20) default NULL,
  `U_Time` datetime NOT NULL,
  `R_Account` float(8,2) default '0.00',
  `R_ID` varchar(20) NOT NULL,
  PRIMARY KEY  (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
