# Ticket System – Service Queue REST API

#### English and Portuguese versions below
## About the Project

**Ticket System** is a REST API developed with Spring Boot to manage a service queue based on **priority** and **creation order**.

The system implements real business rules, such as ticket state control and valid state transitions throughout its lifecycle. The goal of this project is to demonstrate backend best practices, including domain modeling, separation of concerns, and consistent validations.

This project was built with a strong focus on code quality and can be used as a study project or portfolio piece.

---

## Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- Spring Data JPA
- H2 Database
- Maven

---

## How to Run the Project Locally

### Prerequisites

- Java 21 installed
- Maven installed

### Running the Application

From the project root directory, run:

```bash
mvn spring-boot:run

```

## The application will be available at:
```bash
http://localhost:8080
```

## Database (H2)

The project uses an in-memory H2 database, ideal for local development and testing.

The database is automatically initialized when the application starts.

- API Overview
- The API exposes REST endpoints for:
- Ticket creation
- Ticket listing
- Serving the next ticket in the queue
- Ticket completion

Priority and state rules are enforced at the domain level to ensure business consistency.

## Project Status

In development.


---

# Ticket System – API REST de Fila de Atendimento

## Sobre o projeto

O **Ticket System** é uma API REST desenvolvida em Spring Boot para gerenciar uma fila de atendimento baseada em **prioridade** e **ordem de criação**.

O sistema implementa regras reais de negócio, como controle de estados do ticket e transições válidas ao longo do seu ciclo de vida. O objetivo do projeto é demonstrar boas práticas de backend, incluindo modelagem de domínio, separação de responsabilidades e validações consistentes.

Este projeto foi desenvolvido com foco em qualidade de código e pode ser utilizado como projeto de estudo ou portfólio.

---

## Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- Spring Data JPA
- H2 Database
- Maven

---

## Como rodar o projeto localmente

### Pré-requisitos

- Java 21 instalado
- Maven instalado

### Executando a aplicação

Na raiz do projeto, execute:

```bash
mvn spring-boot:run
```

---

## Banco de dados (H2)

O projeto utiliza banco de dados H2 em memória, ideal para desenvolvimento e testes locais.

O banco é inicializado automaticamente ao subir a aplicação.

---

## Estrutura da API

A API expõe endpoints REST para:

- Criação de tickets
- Listagem de tickets
- Atendimento do próximo ticket da fila
- Finalização de tickets

As regras de prioridade e estado são aplicadas no domínio, garantindo consistência do negócio.

---

## Status do projeto

Em desenvolvimento.