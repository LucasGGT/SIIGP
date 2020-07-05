-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Jul-2020 às 16:33
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sgp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atendimento`
--

CREATE TABLE `atendimento` (
  `id` int(11) NOT NULL,
  `pericia_id` int(11) NOT NULL,
  `perito_id` int(11) NOT NULL,
  `data` date NOT NULL,
  `descricao` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pericia`
--

CREATE TABLE `pericia` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `conclusao` varchar(50) NOT NULL,
  `local` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pericia`
--

INSERT INTO `pericia` (`id`, `nome`, `descricao`, `conclusao`, `local`) VALUES
(21, 'a', 'a', 'Concluido', 'a');

-- --------------------------------------------------------

--
-- Estrutura da tabela `perito`
--

CREATE TABLE `perito` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `data_nascimento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `perito`
--

INSERT INTO `perito` (`id`, `usuario`, `senha`, `nome`, `descricao`, `data_nascimento`) VALUES
(7, 'b', 'b', 'b', 'b', '2020-07-21');

-- --------------------------------------------------------

--
-- Estrutura da tabela `relatorio`
--

CREATE TABLE `relatorio` (
  `id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `acao` varchar(50) NOT NULL,
  `informacao` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `relatorio`
--

INSERT INTO `relatorio` (`id`, `timestamp`, `acao`, `informacao`) VALUES
(42, '2020-07-05 03:14:53', 'Pericia Removida', 'ID: null | Nome: a'),
(43, '2020-07-05 03:14:53', 'Pericia Removida', 'ID: null | Nome: a'),
(44, '2020-07-05 03:14:54', 'Pericia Removida', 'ID: null | Nome: a'),
(45, '2020-07-05 03:14:54', 'Pericia Removida', 'ID: null | Nome: a'),
(46, '2020-07-05 03:14:54', 'Pericia Removida', 'ID: null | Nome: a'),
(47, '2020-07-05 03:17:11', 'Pericia Criada', 'ID: 6 | Nome: a'),
(48, '2020-07-05 03:17:15', 'Pericia Removida', 'ID: null | Nome: a'),
(49, '2020-07-05 03:18:03', 'Pericia Criada', 'ID: 6 | Nome: a'),
(50, '2020-07-05 03:18:16', 'Atendimento Criado', 'ID: 6 | Nome: a'),
(51, '2020-07-05 03:18:20', 'Atendimento Removido', 'ID: null | Nome: a'),
(52, '2020-07-05 03:18:22', 'Pericia Removida', 'ID: 19 | Nome: a'),
(53, '2020-07-05 03:26:54', 'Pericia Criada', 'ID: 6 | Nome: a'),
(54, '2020-07-05 03:27:08', 'Atendimento Criado', 'ID: 6 | Nome: a'),
(55, '2020-07-05 03:27:19', 'Atendimento Removido', 'ID: 6 | Nome: a'),
(56, '2020-07-05 03:27:27', 'Pericia Removida', 'ID: 6 | Nome: a'),
(57, '2020-07-05 03:32:54', 'Pericia Criada', 'ID: 6 | Nome: a');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `atendimento`
--
ALTER TABLE `atendimento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `atendimento_pericia` (`pericia_id`),
  ADD KEY `atendimento_perito` (`perito_id`);

--
-- Índices para tabela `pericia`
--
ALTER TABLE `pericia`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `perito`
--
ALTER TABLE `perito`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `relatorio`
--
ALTER TABLE `relatorio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `atendimento`
--
ALTER TABLE `atendimento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de tabela `pericia`
--
ALTER TABLE `pericia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de tabela `perito`
--
ALTER TABLE `perito`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `relatorio`
--
ALTER TABLE `relatorio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `atendimento`
--
ALTER TABLE `atendimento`
  ADD CONSTRAINT `atendimento_pericia` FOREIGN KEY (`pericia_id`) REFERENCES `pericia` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
