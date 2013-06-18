-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.24-log
-- Versão do PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `spao2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bairro`
--

CREATE TABLE IF NOT EXISTS `bairro` (
  `codigo_bairro` smallint(5) unsigned NOT NULL,
  `bairro` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo_bairro`),
  UNIQUE KEY `bairro` (`bairro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eventos`
--

CREATE TABLE IF NOT EXISTS `eventos` (
  `tipo_evento` varchar(30) NOT NULL DEFAULT '',
  `data_hora_inicio` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `data_hora_termino` datetime NOT NULL,
  `bairro` smallint(5) unsigned NOT NULL,
  `logradouro` smallint(5) unsigned NOT NULL,
  `removido` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`tipo_evento`,`data_hora_inicio`),
  KEY `fk_bairro_eventos` (`bairro`),
  KEY `fk_logradouro_eventos` (`logradouro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `log`
--

CREATE TABLE IF NOT EXISTS `log` (
  `codigo_log` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `responsavel` int(10) unsigned NOT NULL,
  `data_hora` datetime NOT NULL,
  `local` varchar(20) NOT NULL,
  `operacao` enum('Alteracao','Exclusao') DEFAULT NULL,
  PRIMARY KEY (`codigo_log`),
  KEY `fk_responsavel_log` (`responsavel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `logradouro`
--

CREATE TABLE IF NOT EXISTS `logradouro` (
  `codigo_logradouro` smallint(5) unsigned NOT NULL,
  `logradouro` varchar(50) NOT NULL,
  `tipo` enum('Rua','Avenida','Praca','Estrada','Travessa','Rodovia','Beco','Viela') NOT NULL,
  PRIMARY KEY (`codigo_logradouro`),
  UNIQUE KEY `logradouro` (`logradouro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `metas`
--

CREATE TABLE IF NOT EXISTS `metas` (
  `cod_meta` varchar(30) NOT NULL,
  `natureza` varchar(7) NOT NULL,
  `qtd_incidencias_permitidas` smallint(5) unsigned NOT NULL,
  `nivel_alerta` smallint(5) unsigned NOT NULL,
  `data_hora_inicio` datetime NOT NULL,
  `data_hora_termino` datetime NOT NULL,
  `removido` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`cod_meta`),
  KEY `fk_natureza_metas` (`natureza`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `natureza`
--

CREATE TABLE IF NOT EXISTS `natureza` (
  `codigo_natureza` varchar(7) NOT NULL,
  `natureza` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo_natureza`),
  UNIQUE KEY `natureza` (`natureza`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ocorrencias`
--

CREATE TABLE IF NOT EXISTS `ocorrencias` (
  `numero_ocorrencia` int(10) unsigned NOT NULL,
  `data_hora_acionamento` datetime NOT NULL,
  `turno` smallint(5) unsigned NOT NULL,
  `numero_reds` varchar(18) NOT NULL,
  `natureza` varchar(7) NOT NULL,
  `nome_solicitante` varchar(30) DEFAULT NULL,
  `sintese_fato` varchar(30) NOT NULL,
  `bairro` smallint(5) unsigned NOT NULL,
  `logradouro` smallint(5) unsigned NOT NULL,
  `numero` smallint(5) unsigned NOT NULL,
  `ponto_referencia` varchar(30) DEFAULT NULL,
  `setor` enum('Centro','Norte','Sul') NOT NULL,
  `data_hora_chegada_local` datetime NOT NULL,
  `data_hora_encerramento` datetime NOT NULL,
  `numero_policial` int(10) unsigned NOT NULL,
  `presos_apreendidos` varchar(100) DEFAULT NULL,
  `radio_operador` int(10) unsigned NOT NULL,
  `removido` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero_ocorrencia`),
  UNIQUE KEY `numero_reds` (`numero_reds`),
  KEY `fk_turno_ocorrencia` (`turno`),
  KEY `fk_natureza_ocorrencia` (`natureza`),
  KEY `fk_bairro_ocorrencia` (`bairro`),
  KEY `fk_logradouro_ocorrencia` (`logradouro`),
  KEY `fk_policial_ocorrencia` (`numero_policial`),
  KEY `fk_radio_ocorrencia` (`radio_operador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `policial`
--

CREATE TABLE IF NOT EXISTS `policial` (
  `matricula` int(10) unsigned NOT NULL,
  `nome` varchar(50) NOT NULL,
  `posto_graduacao` varchar(20) NOT NULL,
  `tipo_permissao` enum('Radio Operador','Comandante','Administrador') NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `status` enum('Ativo','Inativo','Licenciado','Transferido') DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `senha` varchar(12) NOT NULL,
  `removida` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`matricula`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `telefone`
--

CREATE TABLE IF NOT EXISTS `telefone` (
  `matricula` int(10) unsigned NOT NULL DEFAULT '0',
  `telefone` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`matricula`,`telefone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `turno`
--

CREATE TABLE IF NOT EXISTS `turno` (
  `periodo` smallint(5) unsigned NOT NULL DEFAULT '0',
  `intervalo` varchar(15) NOT NULL,
  `turno` enum('1','2','3','4') NOT NULL,
  PRIMARY KEY (`periodo`),
  UNIQUE KEY `intervalo` (`intervalo`,`turno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `eventos`
--
ALTER TABLE `eventos`
  ADD CONSTRAINT `fk_bairro_eventos` FOREIGN KEY (`bairro`) REFERENCES `bairro` (`codigo_bairro`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_logradouro_eventos` FOREIGN KEY (`logradouro`) REFERENCES `logradouro` (`codigo_logradouro`) ON UPDATE CASCADE;

--
-- Restrições para a tabela `log`
--
ALTER TABLE `log`
  ADD CONSTRAINT `fk_responsavel_log` FOREIGN KEY (`responsavel`) REFERENCES `policial` (`matricula`) ON UPDATE CASCADE;

--
-- Restrições para a tabela `metas`
--
ALTER TABLE `metas`
  ADD CONSTRAINT `fk_natureza_metas` FOREIGN KEY (`natureza`) REFERENCES `natureza` (`codigo_natureza`) ON UPDATE CASCADE;

--
-- Restrições para a tabela `ocorrencias`
--
ALTER TABLE `ocorrencias`
  ADD CONSTRAINT `fk_bairro_ocorrencia` FOREIGN KEY (`bairro`) REFERENCES `bairro` (`codigo_bairro`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_logradouro_ocorrencia` FOREIGN KEY (`logradouro`) REFERENCES `logradouro` (`codigo_logradouro`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_natureza_ocorrencia` FOREIGN KEY (`natureza`) REFERENCES `natureza` (`codigo_natureza`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_policial_ocorrencia` FOREIGN KEY (`numero_policial`) REFERENCES `policial` (`matricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_radio_ocorrencia` FOREIGN KEY (`radio_operador`) REFERENCES `policial` (`matricula`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_turno_ocorrencia` FOREIGN KEY (`turno`) REFERENCES `turno` (`periodo`) ON UPDATE CASCADE;

--
-- Restrições para a tabela `telefone`
--
ALTER TABLE `telefone`
  ADD CONSTRAINT `fk_matricula_tel` FOREIGN KEY (`matricula`) REFERENCES `policial` (`matricula`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
