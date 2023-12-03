-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: renfe
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `audios`
--

DROP TABLE IF EXISTS `audios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `audios` (
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  `audio` varchar(100) NOT NULL,
  PRIMARY KEY (`idtren`,`idestacion`,`audio`),
  CONSTRAINT `audios_ibfk_1` FOREIGN KEY (`idtren`, `idestacion`) REFERENCES `trenes` (`idtren`, `idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audios`
--

LOCK TABLES `audios` WRITE;
/*!40000 ALTER TABLE `audios` DISABLE KEYS */;
/*!40000 ALTER TABLE `audios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conduce`
--

DROP TABLE IF EXISTS `conduce`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conduce` (
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  `idtrabajador` int NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idtren`,`idestacion`,`idtrabajador`,`fecha`),
  KEY `idtrabajador` (`idtrabajador`),
  CONSTRAINT `conduce_ibfk_1` FOREIGN KEY (`idtren`, `idestacion`) REFERENCES `trenes` (`idtren`, `idestacion`),
  CONSTRAINT `conduce_ibfk_2` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajadores` (`idtrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conduce`
--

LOCK TABLES `conduce` WRITE;
/*!40000 ALTER TABLE `conduce` DISABLE KEYS */;
/*!40000 ALTER TABLE `conduce` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `idcurso` int NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `fechaImp` date DEFAULT NULL,
  PRIMARY KEY (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estaciones`
--

DROP TABLE IF EXISTS `estaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estaciones` (
  `idestacion` int NOT NULL,
  `provincia` varchar(20) DEFAULT NULL,
  `ciudad` varchar(20) DEFAULT NULL,
  `idtrabajador` int DEFAULT NULL,
  PRIMARY KEY (`idestacion`),
  KEY `idtrabajador` (`idtrabajador`),
  CONSTRAINT `estaciones_ibfk_1` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajadores` (`idtrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estaciones`
--

LOCK TABLES `estaciones` WRITE;
/*!40000 ALTER TABLE `estaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `estaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mantiene`
--

DROP TABLE IF EXISTS `mantiene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mantiene` (
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  `idtrabajador` int NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idtren`,`idestacion`,`idtrabajador`,`fecha`),
  KEY `idtrabajador` (`idtrabajador`),
  CONSTRAINT `mantiene_ibfk_1` FOREIGN KEY (`idtren`, `idestacion`) REFERENCES `trenes` (`idtren`, `idestacion`),
  CONSTRAINT `mantiene_ibfk_2` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajadores` (`idtrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mantiene`
--

LOCK TABLES `mantiene` WRITE;
/*!40000 ALTER TABLE `mantiene` DISABLE KEYS */;
/*!40000 ALTER TABLE `mantiene` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mensajes`
--

DROP TABLE IF EXISTS `mensajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mensajes` (
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  `mensaje` varchar(100) NOT NULL,
  PRIMARY KEY (`idtren`,`idestacion`,`mensaje`),
  CONSTRAINT `mensajes_ibfk_1` FOREIGN KEY (`idtren`, `idestacion`) REFERENCES `trenes` (`idtren`, `idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mensajes`
--

LOCK TABLES `mensajes` WRITE;
/*!40000 ALTER TABLE `mensajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `mensajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puntos`
--

DROP TABLE IF EXISTS `puntos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puntos` (
  `idpunto` int NOT NULL,
  `pGanadosReserva` int DEFAULT NULL,
  `pGanadosKm` int DEFAULT NULL,
  `pGastadosViaje` int DEFAULT NULL,
  `pGastadosPromo` int DEFAULT NULL,
  `fechaGanados` date DEFAULT NULL,
  `fechaGastados` date DEFAULT NULL,
  `idusuario` int DEFAULT NULL,
  PRIMARY KEY (`idpunto`),
  KEY `idusuario` (`idusuario`),
  CONSTRAINT `puntos_ibfk_1` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puntos`
--

LOCK TABLES `puntos` WRITE;
/*!40000 ALTER TABLE `puntos` DISABLE KEYS */;
/*!40000 ALTER TABLE `puntos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajadorcurso`
--

DROP TABLE IF EXISTS `trabajadorcurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajadorcurso` (
  `idtrabajador` int NOT NULL,
  `idcurso` int NOT NULL,
  `situacion` enum('Aprobrado','No superado','Pendiente') NOT NULL,
  PRIMARY KEY (`idtrabajador`,`idcurso`,`situacion`),
  KEY `idcurso` (`idcurso`),
  CONSTRAINT `trabajadorcurso_ibfk_1` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajadores` (`idtrabajador`),
  CONSTRAINT `trabajadorcurso_ibfk_2` FOREIGN KEY (`idcurso`) REFERENCES `cursos` (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajadorcurso`
--

LOCK TABLES `trabajadorcurso` WRITE;
/*!40000 ALTER TABLE `trabajadorcurso` DISABLE KEYS */;
/*!40000 ALTER TABLE `trabajadorcurso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajadores`
--

DROP TABLE IF EXISTS `trabajadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajadores` (
  `idtrabajador` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido1` varchar(20) DEFAULT NULL,
  `apellido2` varchar(20) DEFAULT NULL,
  `fnac` date DEFAULT NULL,
  `foto` tinyint(1) DEFAULT NULL,
  `localizacion` enum('Movil','Estacion ferroviaria','Casco urbano') DEFAULT NULL,
  `puesto` enum('Mantenimiento','Logistica','Conductor','Responsable de estacion') DEFAULT NULL,
  `descripcion` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`idtrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajadores`
--

LOCK TABLES `trabajadores` WRITE;
/*!40000 ALTER TABLE `trabajadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `trabajadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trenes`
--

DROP TABLE IF EXISTS `trenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trenes` (
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  `matricula` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idtren`,`idestacion`),
  KEY `idestacion` (`idestacion`),
  CONSTRAINT `trenes_ibfk_1` FOREIGN KEY (`idestacion`) REFERENCES `estaciones` (`idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trenes`
--

LOCK TABLES `trenes` WRITE;
/*!40000 ALTER TABLE `trenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `trenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuario` int NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido1` varchar(20) DEFAULT NULL,
  `apellido2` varchar(20) DEFAULT NULL,
  `fnac` date DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarioviaje`
--

DROP TABLE IF EXISTS `usuarioviaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarioviaje` (
  `idusuario` int NOT NULL,
  `idviaje` int NOT NULL,
  `valoracion` varchar(50) NOT NULL,
  PRIMARY KEY (`idusuario`,`idviaje`,`valoracion`),
  KEY `idviaje` (`idviaje`),
  CONSTRAINT `usuarioviaje_ibfk_1` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`),
  CONSTRAINT `usuarioviaje_ibfk_2` FOREIGN KEY (`idviaje`) REFERENCES `viajes` (`idviaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarioviaje`
--

LOCK TABLES `usuarioviaje` WRITE;
/*!40000 ALTER TABLE `usuarioviaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarioviaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viajes`
--

DROP TABLE IF EXISTS `viajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viajes` (
  `idviaje` int NOT NULL,
  `tEstimado` varchar(20) DEFAULT NULL,
  `ocupacion` varchar(20) DEFAULT NULL,
  `idtrabajador` int DEFAULT NULL,
  PRIMARY KEY (`idviaje`),
  KEY `idtrabajador` (`idtrabajador`),
  CONSTRAINT `viajes_ibfk_1` FOREIGN KEY (`idtrabajador`) REFERENCES `trabajadores` (`idtrabajador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viajes`
--

LOCK TABLES `viajes` WRITE;
/*!40000 ALTER TABLE `viajes` DISABLE KEYS */;
/*!40000 ALTER TABLE `viajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viajetren`
--

DROP TABLE IF EXISTS `viajetren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `viajetren` (
  `idviaje` int NOT NULL,
  `idtren` int NOT NULL,
  `idestacion` int NOT NULL,
  PRIMARY KEY (`idviaje`,`idtren`,`idestacion`),
  KEY `idtren` (`idtren`,`idestacion`),
  CONSTRAINT `viajetren_ibfk_1` FOREIGN KEY (`idviaje`) REFERENCES `viajes` (`idviaje`),
  CONSTRAINT `viajetren_ibfk_2` FOREIGN KEY (`idtren`, `idestacion`) REFERENCES `trenes` (`idtren`, `idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viajetren`
--

LOCK TABLES `viajetren` WRITE;
/*!40000 ALTER TABLE `viajetren` DISABLE KEYS */;
/*!40000 ALTER TABLE `viajetren` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-03 18:57:47
