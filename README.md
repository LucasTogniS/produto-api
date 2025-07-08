# 📦 Produto API

Uma aplicação backend simples desenvolvida em **Java 21**, utilizando **MongoDB** para persistência de dados e **Docker Compose** para orquestração dos containers.

## 🔧 Tecnologias Utilizadas

- Java 21
- Spring Boot
- MongoDB
- Mongo Express
- Docker / Docker Compose
- Insomnia (para testes de API)

## 🧪 Funcionalidades

- ✅ Cadastro de produtos (POST `/produtos`)
- ✅ Listagem de produtos (GET `/produtos`)
- ✅ Banco de dados MongoDB isolado via container
- ✅ Interface Mongo Express para visualização do banco

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

### 2. Subir os containers com Docker Compose

```bash
docker-compose up -d
```

- MongoDB estará disponível na porta: **27017**
- Mongo Express acessível via navegador em: **http://localhost:8081**

### 3. Rodar a aplicação Java

- Você pode executar a aplicação pelo seu IDE

### 4. Endpoints da API

#### 📌 POST /produtos

Cadastra um novo produto.

**Exemplo de requisição:**

```json
{
  "nome": "Teclado Mecânico",
  "preco": 299.90,
  "quantidade": 10
}
```

#### 📌 GET /produtos

Retorna a lista de todos os produtos cadastrados.

## 📝 Observações

- Certifique-se de ter o Docker e Docker Compose instalados
- A aplicação Java deve estar configurada para conectar ao MongoDB na porta 27017
- Use o Mongo Express para visualizar os dados inseridos no banco

