# SsmDemoUser
This is sheng ze yu repository

# 这是一个SSM小demo

### 功能说明：

### 登录

查询所有用户

删除用户

增加用户

修改用户（具有回显）

### 打开方式

新建一个数据库how2java，运行sql文件

```sq
/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : how2java

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-08-15 14:40:53
*/

SET FOREIGN_KEY_CHECKS=0;

------

-- Table structure for tb_user

------

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_general_mysql500_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_general_mysql500_ci;

------

-- Records of tb_user

------

INSERT INTO `tb_user` VALUES ('1', 'szy', '123');
INSERT INTO `tb_user` VALUES ('2', 'admin2', '123456');
INSERT INTO `tb_user` VALUES ('5', '1', '1');
INSERT INTO `tb_user` VALUES ('9', '111', '1111146465');
```



