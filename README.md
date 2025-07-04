# ☕ Coffee Order API

API para simular pedidos personalizados de café, usando Java 21, Spring Boot e padrões de projeto (Builder, Decorator, Singleton).

---

## 🚀 Tecnologias
- Java 21
- Spring Boot 3
- Maven
- Swagger (OpenAPI)
- JUnit 5 (Testes)
- Design Patterns (GoF)

---

## 📦 Como rodar

```bash
# Clone o repositório
git clone <url-do-seu-repo>
cd coffee-order-spring

# Compile e rode
mvn clean spring-boot:run

🧪 Endpoints
Criar pedido

POST /order

["milk", "whippedcream", "chocolate"]

🔁 Resposta:

✅ Pedido: Café simples, leite, chantilly, chocolate
💰 Total: R$ 11,00

Listar pedidos

GET /order/all

🔁 Resposta:

[
  "Descrição: Café simples, leite, chantilly, chocolate | Preço: R$ 11,00",
  "Descrição: Café simples, leite, chantilly, chocolate, caramelo | Preço: R$ 14,00"
]

🐞 Erros tratados

Se você enviar um ingrediente inválido:

["milk", "banana"]

🔁 Resposta:

{
  "timestamp": "...",
  "status": 400,
  "error": "Bad Request",
  "message": "Ingrediente inválido: banana"
}

📚 Swagger

Acesse: http://localhost:8080/swagger-ui.html
🏁 Conclusão

Projeto ideal para demonstrar domínio de:

    Spring Boot

    Padrões de Projeto

    Boas práticas REST

    Testes e documentação

