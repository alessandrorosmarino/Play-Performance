CREATE DATABASE  IF NOT EXISTS `gamification` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gamification`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: gamification
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `badge`
--

DROP TABLE IF EXISTS `badge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `badge` (
  `ID_BADGE` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_DOMINIO` int unsigned NOT NULL,
  `NOME` varchar(45) NOT NULL,
  `VALORE_PUNTEGGIO` int unsigned NOT NULL,
  `CUMULABILE` tinyint NOT NULL,
  `INIZIO_VALIDITA` date DEFAULT NULL,
  `FINE_VALIDITA` date DEFAULT NULL,
  PRIMARY KEY (`ID_BADGE`),
  UNIQUE KEY `ID_BADGE_UNIQUE` (`ID_BADGE`),
  KEY `FK_BADGE_ID_DOMINIO_idx` (`ID_DOMINIO`),
  CONSTRAINT `FK_BADGE_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Badge ottenuti dai giocatori';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `badge`
--

LOCK TABLES `badge` WRITE;
/*!40000 ALTER TABLE `badge` DISABLE KEYS */;
/*!40000 ALTER TABLE `badge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `domini_utente`
--

DROP TABLE IF EXISTS `domini_utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domini_utente` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ID_UTENTE` int unsigned NOT NULL,
  `ID_DOMINIO` int unsigned NOT NULL,
  `USERNAME` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `LOCKED` int NOT NULL DEFAULT '0',
  `CREDENTIAL_EXPIRED` int NOT NULL DEFAULT '0',
  `LAST_MODIFIED` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNIQUE` (`ID_UTENTE`,`ID_DOMINIO`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `ID_UTENTE_FK_idx` (`ID_UTENTE`),
  KEY `ID_DOMINIO_FK_idx` (`ID_DOMINIO`) /*!80000 INVISIBLE */,
  CONSTRAINT `FK_DOMINI_UTENTE_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`),
  CONSTRAINT `FK_DOMINI_UTENTE_ID_UTENTE` FOREIGN KEY (`ID_UTENTE`) REFERENCES `utente` (`ID_UTENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Domini abiliati per ogni utente';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domini_utente`
--

LOCK TABLES `domini_utente` WRITE;
/*!40000 ALTER TABLE `domini_utente` DISABLE KEYS */;
INSERT INTO `domini_utente` VALUES (1,1,1,'admin','$2a$11$ABqUH40UjWhGWk.ODUuCpeoyET.FVJmf3VtXKlM2YO7FLXrOeX9r6',0,0,'2020-11-25 15:05:46'),(2,7,1,'a','$2a$11$6AHLoLyKTUQaGKNfGNMDWOQlloY29oasISVS2V5mYCcd4XrzreBUe',0,0,'2020-12-14 18:28:10'),(3,7,2,'a','$2a$11$u9g/EOim1l2Zt/WBaIxe3uozELrqFfd38uAdDUzeZyeMEpECxCz/u',0,0,'2020-12-14 18:04:22');
/*!40000 ALTER TABLE `domini_utente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dominio`
--

DROP TABLE IF EXISTS `dominio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dominio` (
  `ID_DOMINIO` int unsigned NOT NULL AUTO_INCREMENT,
  `NOME_DOMINIO` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_DOMINIO`),
  UNIQUE KEY `ID_DOMINIO_UNIQUE` (`ID_DOMINIO`),
  UNIQUE KEY `NOME_DOMINIO_UNIQUE` (`NOME_DOMINIO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Domini per i clienti';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dominio`
--

LOCK TABLES `dominio` WRITE;
/*!40000 ALTER TABLE `dominio` DISABLE KEYS */;
INSERT INTO `dominio` VALUES (2,'DOM'),(1,'GLOBAL');
/*!40000 ALTER TABLE `dominio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entita_gestibile`
--

DROP TABLE IF EXISTS `entita_gestibile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entita_gestibile` (
  `NOME` varchar(20) NOT NULL,
  UNIQUE KEY `NOME_ENTITA_UNIQUE` (`NOME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Lista di Entità';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entita_gestibile`
--

LOCK TABLES `entita_gestibile` WRITE;
/*!40000 ALTER TABLE `entita_gestibile` DISABLE KEYS */;
INSERT INTO `entita_gestibile` VALUES ('Badge'),('Domain'),('Leaderboard'),('LeaderboardType'),('Mission'),('Rule'),('RuleInstance'),('User');
/*!40000 ALTER TABLE `entita_gestibile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entita_gestibile_ruolo`
--

DROP TABLE IF EXISTS `entita_gestibile_ruolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entita_gestibile_ruolo` (
  `ID_RUOLO` int unsigned NOT NULL AUTO_INCREMENT,
  `ENTITA_GESTIBILE` varchar(45) NOT NULL,
  `POTERE` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_RUOLO`),
  UNIQUE KEY `ID_RUOLO_UNIQUE` (`ID_RUOLO`),
  KEY `FK_ENTITA_GESTIBILE_RUOLO_ENTITA_GESTIBILE_idx` (`ENTITA_GESTIBILE`),
  KEY `FK_ENTITA_GESTIBILE_RUOLO_POTERE_idx` (`POTERE`),
  KEY `ENTITA_GESTIBILE_RUOLO_UNIVOCITA` (`ENTITA_GESTIBILE`,`POTERE`),
  CONSTRAINT `FK_ENTITA_GESTIBILE_RUOLO_ENTITA_GESTIBILE` FOREIGN KEY (`ENTITA_GESTIBILE`) REFERENCES `entita_gestibile` (`NOME`),
  CONSTRAINT `FK_ENTITA_GESTIBILE_RUOLO_POTERE` FOREIGN KEY (`POTERE`) REFERENCES `poteri_ruolo` (`NOME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Lista di entità gestibili da un determinato ruolo con il permesso associato';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entita_gestibile_ruolo`
--

LOCK TABLES `entita_gestibile_ruolo` WRITE;
/*!40000 ALTER TABLE `entita_gestibile_ruolo` DISABLE KEYS */;
/*!40000 ALTER TABLE `entita_gestibile_ruolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leaderboard`
--

DROP TABLE IF EXISTS `leaderboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `leaderboard` (
  `ID_LEADERBOARD` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_DOMINIO` int unsigned NOT NULL,
  `ID_TIPO_LEADERBOARD` int unsigned NOT NULL,
  `OPZIONALE` varchar(20) DEFAULT NULL,
  `NOME` varchar(45) NOT NULL,
  `VISIBILE` tinyint NOT NULL,
  `DATA_INIZIO_CONTEGGIO` date DEFAULT NULL,
  `DATA_FINE_CONTEGGIO` date DEFAULT NULL,
  `NUMERO_RESET` int unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID_LEADERBOARD`),
  KEY `FK_LEADERBOARD_ID_TIPO_LEADERBOARD_idx` (`ID_TIPO_LEADERBOARD`),
  KEY `FK_LEADERBOARD_ID_DOMINIO_idx` (`ID_DOMINIO`),
  CONSTRAINT `FK_LEADERBOARD_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`),
  CONSTRAINT `FK_LEADERBOARD_ID_TIPO_LEADERBOARD` FOREIGN KEY (`ID_TIPO_LEADERBOARD`) REFERENCES `tipo_leaderboard` (`ID_TIPO_LEADERBOARD`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='Dati strutturali delle leaderboard';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leaderboard`
--

LOCK TABLES `leaderboard` WRITE;
/*!40000 ALTER TABLE `leaderboard` DISABLE KEYS */;
INSERT INTO `leaderboard` VALUES (1,1,1,NULL,'Leaderboard 1',1,NULL,NULL,0);
/*!40000 ALTER TABLE `leaderboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missione`
--

DROP TABLE IF EXISTS `missione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `missione` (
  `ID_MISSIONE` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_DOMINIO` int unsigned NOT NULL,
  `NOME` varchar(45) NOT NULL,
  `DESCRIZIONE` varchar(45) DEFAULT NULL,
  `VALORE_PUNTEGGIO` int NOT NULL,
  `INIZIO_VALIDITA` date DEFAULT NULL,
  `FINE_VALIDITA` date DEFAULT NULL,
  PRIMARY KEY (`ID_MISSIONE`),
  UNIQUE KEY `ID_MISSIONE_UNIQUE` (`ID_MISSIONE`),
  KEY `FK_MISSIONE_ID_DOMINIO_idx` (`ID_DOMINIO`),
  CONSTRAINT `FK_MISSIONE_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Le missioni sono obbiettivi raggiungibili dell''utente alla quale sono associati dei premi';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missione`
--

LOCK TABLES `missione` WRITE;
/*!40000 ALTER TABLE `missione` DISABLE KEYS */;
/*!40000 ALTER TABLE `missione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `poteri_ruolo`
--

DROP TABLE IF EXISTS `poteri_ruolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `poteri_ruolo` (
  `NOME` varchar(10) NOT NULL,
  UNIQUE KEY `NOME_UNIQUE` (`NOME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='I poteri che un ruolo può avere su un determinato oggetto';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `poteri_ruolo`
--

LOCK TABLES `poteri_ruolo` WRITE;
/*!40000 ALTER TABLE `poteri_ruolo` DISABLE KEYS */;
INSERT INTO `poteri_ruolo` VALUES ('ADD'),('DELETE'),('EDIT'),('UPDATE');
/*!40000 ALTER TABLE `poteri_ruolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `punti`
--

DROP TABLE IF EXISTS `punti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `punti` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_UTENTE` int unsigned NOT NULL,
  `ID_DOMINIO` int unsigned NOT NULL,
  `ID_TIPO_PUNTI` int unsigned NOT NULL,
  `PUNTI` int unsigned NOT NULL,
  `DATA_ASSEGNAZIONE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CLASSE_ORIGINE_PUNTI` varchar(45) DEFAULT NULL,
  `ID_ORIGINE_PUNTI` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `FK_PUNTI_ID_TIPO_PUNTI_idx` (`ID_TIPO_PUNTI`) /*!80000 INVISIBLE */,
  KEY `FK_PUNTI_ID_UTENTE_idx` (`ID_UTENTE`) /*!80000 INVISIBLE */,
  KEY `FK_PUNTI_ID_DOMINIO_idx` (`ID_DOMINIO`) /*!80000 INVISIBLE */,
  CONSTRAINT `FK_PUNTI_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`),
  CONSTRAINT `FK_PUNTI_ID_TIPO_PUNTI` FOREIGN KEY (`ID_TIPO_PUNTI`) REFERENCES `tipo_punti` (`ID_TIPO_PUNTI`),
  CONSTRAINT `FK_PUNTI_ID_UTENTE` FOREIGN KEY (`ID_UTENTE`) REFERENCES `utente` (`ID_UTENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Punteggi degli Utenti';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `punti`
--

LOCK TABLES `punti` WRITE;
/*!40000 ALTER TABLE `punti` DISABLE KEYS */;
INSERT INTO `punti` VALUES (1,1,1,1,100,'2020-12-16 16:45:03',NULL,0),(2,1,1,1,200,'2020-12-16 16:45:12',NULL,0),(3,1,1,1,200,'2020-12-18 12:13:38',NULL,0);
/*!40000 ALTER TABLE `punti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regola`
--

DROP TABLE IF EXISTS `regola`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regola` (
  `ID_REGOLA` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_DOMINIO` int unsigned NOT NULL,
  `NOME` varchar(25) NOT NULL,
  `DESCRIZIONE` varchar(200) DEFAULT NULL,
  `IMPLEMENTAZIONE` blob NOT NULL,
  PRIMARY KEY (`ID_REGOLA`),
  UNIQUE KEY `ID_REGOLA_UNIQUE` (`ID_REGOLA`),
  KEY `FK_REGOLA_ID_DOMINIO_idx` (`ID_DOMINIO`),
  CONSTRAINT `FK_REGOLA_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Struttura regola generica per oggetti';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regola`
--

LOCK TABLES `regola` WRITE;
/*!40000 ALTER TABLE `regola` DISABLE KEYS */;
/*!40000 ALTER TABLE `regola` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regola_entita`
--

DROP TABLE IF EXISTS `regola_entita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `regola_entita` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `ID_REGOLA` int unsigned NOT NULL,
  `ID_ENTITA` int unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_REGOLA_UNIQUE` (`ID_REGOLA`),
  UNIQUE KEY `ID_ENTITA_UNIQUE` (`ID_ENTITA`),
  UNIQUE KEY `id_UNIQUE` (`ID`),
  CONSTRAINT `FK_REGOLA_ENTITA_ID_REGOLA` FOREIGN KEY (`ID_REGOLA`) REFERENCES `regola` (`ID_REGOLA`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Le regole associate alle entità';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regola_entita`
--

LOCK TABLES `regola_entita` WRITE;
/*!40000 ALTER TABLE `regola_entita` DISABLE KEYS */;
/*!40000 ALTER TABLE `regola_entita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruolo`
--

DROP TABLE IF EXISTS `ruolo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ruolo` (
  `ID_RUOLO` int unsigned NOT NULL AUTO_INCREMENT,
  `NOME` varchar(20) NOT NULL,
  `DESCRIZIONE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_RUOLO`),
  UNIQUE KEY `ID_RUOLO_UNIQUE` (`ID_RUOLO`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='Lista di ruoli con potere di accesso che gli utenti possono avere';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruolo`
--

LOCK TABLES `ruolo` WRITE;
/*!40000 ALTER TABLE `ruolo` DISABLE KEYS */;
INSERT INTO `ruolo` VALUES (1,'Administrator','Amministratore del sistema');
/*!40000 ALTER TABLE `ruolo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruolo_utente`
--

DROP TABLE IF EXISTS `ruolo_utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ruolo_utente` (
  `ID_UTENTE` int unsigned NOT NULL,
  `ID_DOMINIO` int unsigned NOT NULL,
  `ID_RUOLO` int unsigned NOT NULL,
  UNIQUE KEY `RUOLO_UTENTE_UNIVOCITA` (`ID_UTENTE`,`ID_DOMINIO`,`ID_RUOLO`),
  KEY `FK_RUOLO_UTENTE_ID_RUOLO_idx` (`ID_RUOLO`),
  KEY `FK_RUOLO_UTENTE_ID_DOMINIO_idx` (`ID_DOMINIO`) /*!80000 INVISIBLE */,
  KEY `FK_RUOLO_UTENTE_ID_UTENTE_idx` (`ID_UTENTE`),
  CONSTRAINT `FK_RUOLO_UTENTE_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`),
  CONSTRAINT `FK_RUOLO_UTENTE_ID_RUOLO` FOREIGN KEY (`ID_RUOLO`) REFERENCES `ruolo` (`ID_RUOLO`),
  CONSTRAINT `FK_RUOLO_UTENTE_ID_UTENTE` FOREIGN KEY (`ID_UTENTE`) REFERENCES `utente` (`ID_UTENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Lista di ruoli che l''utente ha';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruolo_utente`
--

LOCK TABLES `ruolo_utente` WRITE;
/*!40000 ALTER TABLE `ruolo_utente` DISABLE KEYS */;
/*!40000 ALTER TABLE `ruolo_utente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipi_punti_dominio`
--

DROP TABLE IF EXISTS `tipi_punti_dominio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipi_punti_dominio` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ID_DOMINIO` int unsigned NOT NULL,
  `ID_TIPO_PUNTI` int unsigned NOT NULL,
  `PRINCIPALE` tinyint NOT NULL DEFAULT '1',
  `MOLTIPLICATORE_BASE` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `FK_TIPI_PUNTI_DOMINIO_ID_TIPO_PUNTI` (`ID_TIPO_PUNTI`),
  KEY `FK_TIPI_PUNTI_DOMINIO_ID_DOMINIO` (`ID_DOMINIO`),
  CONSTRAINT `FK_TIPI_PUNTI_DOMINIO_ID_DOMINIO` FOREIGN KEY (`ID_DOMINIO`) REFERENCES `dominio` (`ID_DOMINIO`),
  CONSTRAINT `FK_TIPI_PUNTI_DOMINIO_ID_TIPO_PUNTI` FOREIGN KEY (`ID_TIPO_PUNTI`) REFERENCES `tipo_punti` (`ID_TIPO_PUNTI`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='Tipi di punti abilitati per dominio';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipi_punti_dominio`
--

LOCK TABLES `tipi_punti_dominio` WRITE;
/*!40000 ALTER TABLE `tipi_punti_dominio` DISABLE KEYS */;
INSERT INTO `tipi_punti_dominio` VALUES (1,1,1,1,1);
/*!40000 ALTER TABLE `tipi_punti_dominio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_leaderboard`
--

DROP TABLE IF EXISTS `tipo_leaderboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_leaderboard` (
  `ID_TIPO_LEADERBOARD` int unsigned NOT NULL AUTO_INCREMENT,
  `NOME_TIPO` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_TIPO_LEADERBOARD`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_leaderboard`
--

LOCK TABLES `tipo_leaderboard` WRITE;
/*!40000 ALTER TABLE `tipo_leaderboard` DISABLE KEYS */;
INSERT INTO `tipo_leaderboard` VALUES (1,'punti');
/*!40000 ALTER TABLE `tipo_leaderboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_punti`
--

DROP TABLE IF EXISTS `tipo_punti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_punti` (
  `ID_TIPO_PUNTI` int unsigned NOT NULL AUTO_INCREMENT,
  `NOME_PUNTI` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_TIPO_PUNTI`),
  UNIQUE KEY `ID_TIPO_PUNTI_UNIQUE` (`ID_TIPO_PUNTI`),
  UNIQUE KEY `NOME_PUNTI_UNIQUE` (`NOME_PUNTI`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='Tipo di punti';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_punti`
--

LOCK TABLES `tipo_punti` WRITE;
/*!40000 ALTER TABLE `tipo_punti` DISABLE KEYS */;
INSERT INTO `tipo_punti` VALUES (1,'Global Point');
/*!40000 ALTER TABLE `tipo_punti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utente` (
  `ID_UTENTE` int unsigned NOT NULL AUTO_INCREMENT,
  `NOME` varchar(25) NOT NULL,
  `COGNOME` varchar(25) NOT NULL,
  `CODICE_FISCALE` varchar(20) NOT NULL,
  `DATA_NASCITA` date NOT NULL,
  `LUOGO_NASCITA` varchar(45) NOT NULL,
  `SESSO` varchar(1) NOT NULL,
  `INDIRIZZO_RESIDENZA` varchar(45) NOT NULL,
  `PROVINCIA_RESIDENZA` varchar(2) NOT NULL,
  `CIVICO_RESIDENZA` int NOT NULL,
  `INDIRIZZO_DOMICILIO` varchar(45) DEFAULT NULL,
  `PROVINCIA_DOMICILIO` varchar(2) DEFAULT NULL,
  `CIVICO_DOMICILIO` int DEFAULT NULL,
  PRIMARY KEY (`CODICE_FISCALE`),
  UNIQUE KEY `ID_UTENTE_UNIQUE` (`ID_UTENTE`),
  UNIQUE KEY `CODICE_FISCALE_UNIQUE` (`CODICE_FISCALE`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='Dati dell''utente';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES (7,'a','a','a','2020-12-14','Torino','a','Via delle vie','TO',0,NULL,NULL,0),(17,'AAAA','AAAAA','AAAA','0001-01-01','NH','F','BYT','ET',2,'BGH','GB',4),(1,'Admin','Admin','Admin','0001-01-01','Admin','M','Admin','AD',1,'Admin','AD',1),(2,'GHE','TYRH','HYNJ','0001-01-01','NH','F','BYT','ET',2,'BGH','GB',4);
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gamification'
--

--
-- Dumping routines for database 'gamification'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-04 21:55:42
