## 🏷️ Price Tag Product CRUD CLI

Este é um projeto de uma aplicação **CLI (Command Line Interface)** robusta, desenvolvida em **Java Puro**, que implementa operações completas de **CRUD (Create, Read, Update, Delete)** para gerenciar diferentes tipos de produtos. Os dados são persistidos utilizando um banco de dados **MySQL**.

---

## ✨ Funcionalidades

O CLI oferece uma interface de linha de comando para manipular totalmente o cadastro de produtos, diferenciando-os com base em suas características:

* **Operações CRUD Completas:** O usuário é capaz de realizar todas as quatro operações fundamentais:
    * **C**reate (Criar/Cadastrar novo produto)
    * **R**ead (Consultar/Listar produtos existentes)
    * **U**pdate (Atualizar dados de um produto)
    * **D**elete (Excluir um produto do sistema)

* **Persistência de Dados:** Todos os registros são armazenados e gerenciados em um banco de dados **MySQL**, garantindo a durabilidade e integridade dos dados.

---

## 📦 Tipos de Produtos e Regras de Negócio

O sistema suporta e trata de maneira específica três categorias de produtos, aplicando regras de negócio distintas para cada uma:

| Tipo de Produto | Dados Requeridos | Diferenciais/Regras de Negócio |
| :--- | :--- | :--- |
| **Comum** | Nome, Preço | Apenas exibe o Nome e Preço. |
| **Usado** | Nome, Preço, Data de Fabricação | Requer a **Data de Fabricação** (ou compra) para fins de depreciação. |
| **Importado** | Nome, Preço Original, Taxa de Alfândega | Requer uma **Taxa de Alfândega** (fornecida pelo usuário) para calcular o preço final de venda. |

---

## 🛠️ Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando o ecossistema padrão da linguagem:

* **Java** (versão 8 ou superior)
* **JDBC** (Java Database Connectivity) para conexão e manipulação do MySQL.
* **MySQL** (Banco de Dados Relacional)

---

## 🤝 Contribuições

Sinta-se à vontade para enviar *pull requests* ou abrir *issues* para melhorias e correções de bugs.
