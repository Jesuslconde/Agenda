CREATE TABLE `empleados` (
  `idempleados` int(11) NOT NULL AUTO_INCREMENT,
  `codEmpleado` varchar(45) NOT NULL,
  `salario` varchar(45) DEFAULT NULL,
  `fechaAlta` timestamp NULL DEFAULT NULL,
  `idDepartamento` int(11) DEFAULT NULL,
  `idCategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idempleados`),
  KEY `FK_emp_dep` (`idDepartamento`),
  KEY `FK_emp_cat` (`idCategoria`),
  CONSTRAINT `FK_emp_cat` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idcategorias`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_emp_dep` FOREIGN KEY (`idDepartamento`) REFERENCES `departamentos` (`iddepartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;