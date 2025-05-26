# 🧩 Microservices with Orchestration & Choreography (Spring Boot)

This repository demonstrates two microservices communication patterns using Spring Boot:

- 🎼 **Orchestration Pattern** — Centralized control using REST calls
- 💃 **Choreography Pattern** — Decentralized, event-driven using Apache Kafka

---

## 🏗️ Project Structure

![orchestration-project-structure](https://github.com/user-attachments/assets/5077c86a-7d38-4b9c-93ad-602093c138b8)


---

## 🔧 Tech Stack

| Feature            | Technology                |
|--------------------|----------------------------|
| Language           | Java 17                   |
| Framework          | Spring Boot 3.x           |
| Messaging (Choreo) | Apache Kafka              |
| REST Clients       | Spring Cloud OpenFeign    |
| Build Tool         | Maven                     |
| Architecture       | Microservices             |

---

## 🎼 Orchestration Pattern

In this approach, the `order-service` controls the flow:

1. Client → `order-service`
2. `order-service` → calls `inventory`, `payment`, and `shipping` via REST
3. Centralized decision-making and error handling

### ▶️ Run Services

```bash
cd order-orchestration/
# Run each service individually:
cd order-service && mvn spring-boot:run
cd inventory-service && mvn spring-boot:run
cd payment-service && mvn spring-boot:run
cd shipping-service && mvn spring-boot:run
