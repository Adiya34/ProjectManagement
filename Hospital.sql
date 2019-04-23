/*
SQLyog Professional v12.4.3 (64 bit)
MySQL - 10.1.38-MariaDB : Database - hospital
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hospital` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hospital`;

/*Table structure for table `nursing` */

DROP TABLE IF EXISTS `nursing`;

CREATE TABLE `nursing` (
  `ID` int(11) NOT NULL,
  `Register` char(10) CHARACTER SET utf8 NOT NULL,
  `Date` datetime NOT NULL,
  `Treatment` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Repetition` tinyint(4) DEFAULT NULL,
  `Note` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Register` (`Register`),
  CONSTRAINT `nursing_ibfk_1` FOREIGN KEY (`Register`) REFERENCES `patient` (`Register`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nursing` */

insert  into `nursing`(`ID`,`Register`,`Date`,`Treatment`,`Repetition`,`Note`) values 
(1,'ЭЖ99072311','2019-04-03 11:59:03','Шарлага',3,'ааааааа ааа аа');

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `Register` char(10) CHARACTER SET utf8 NOT NULL,
  `FirstName` varchar(25) CHARACTER SET utf8 NOT NULL,
  `LastName` varchar(25) CHARACTER SET utf8 NOT NULL,
  `Age` int(11) DEFAULT NULL,
  `Address` varchar(255) CHARACTER SET utf8 NOT NULL,
  `AllergyInfo` varchar(255) CHARACTER SET utf8 NOT NULL,
  `Phone` int(11) DEFAULT NULL,
  `Email` varchar(100) CHARACTER SET utf8 NOT NULL,
  `SisiID` varchar(12) CHARACTER SET utf8 DEFAULT NULL,
  `Branch` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Class` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Sex` char(2) CHARACTER SET utf8 NOT NULL,
  `Job` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `Education` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `EMD` char(9) DEFAULT NULL,
  PRIMARY KEY (`Register`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patient` */

insert  into `patient`(`Register`,`FirstName`,`LastName`,`Age`,`Address`,`AllergyInfo`,`Phone`,`Email`,`SisiID`,`Branch`,`Class`,`Sex`,`Job`,`Education`,`EMD`) values 
('??99062410','??????','???????',19,'?? 4-? ????? 32-41','???',96064343,'Ulusnet_power@yahoo.com','16b1seas0475','?????','??????? ???????','??','??????','????????','991239912'),
('uh99062410','tugsuu','erdenee',123,'gahai	','asdaskdjkl',96464312,'ulusnet_Power@yahoo.com','16b1seas0475','?????','ph','??','????','????????','129381920'),
('ЭЖ99072311','Эрдэнээ','Төгсөө',19,'ЧД 16-гийн 28-ийн 10','Сумнаас бас уснаас',96064343,'ulusnet_power@yahoo.com','16b1seas0475','ХШУИС','Програм хангамж','Эр','Оюутан','Бүрэн дунд','99112233');

/*Table structure for table `patienttreatment` */

DROP TABLE IF EXISTS `patienttreatment`;

CREATE TABLE `patienttreatment` (
  `ID` int(11) NOT NULL,
  `Register` char(10) CHARACTER SET utf8 NOT NULL,
  `Diagnosis` varchar(255) CHARACTER SET utf8 NOT NULL,
  `SicknessRate` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `InspectionType` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `Treatment` varchar(255) CHARACTER SET utf8 NOT NULL,
  `Repetition` tinyint(4) DEFAULT NULL,
  `Note` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Cause` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Register` (`Register`),
  CONSTRAINT `patienttreatment_ibfk_1` FOREIGN KEY (`Register`) REFERENCES `patient` (`Register`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patienttreatment` */

insert  into `patienttreatment`(`ID`,`Register`,`Diagnosis`,`SicknessRate`,`InspectionType`,`Treatment`,`Repetition`,`Note`,`Cause`) values 
(1,'ЭЖ99072311','Өвчин','Хүнд','Уушиг чагнах','Блабла аскорутин этр уу!',13,'Өөр юмгүйдээ','Даарцан бншд чвс');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`username`,`password`) values 
('emch','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
