
CREATE TABLE `EstoqueItem` (
  `idEstoqueItem` int(11) NOT NULL AUTO_INCREMENT,
  `idProduto` int(11) NOT NULL,
  `qtdProduto` int(11) NOT NULL,
  PRIMARY KEY (`idEstoqueItem`),
  CONSTRAINT `idProduto` FOREIGN KEY (`idProduto`) 
    REFERENCES `Produto` (`idProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB;

CREATE TABLE `Usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `nomeUsuario` varchar(10) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `servicos` varchar(1) DEFAULT 'S',
  `suprimentos` varchar(1) DEFAULT 'S',
  `vendas` varchar(1) DEFAULT 'S',
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB;