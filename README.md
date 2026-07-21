<div align="center">
  <div style="background: linear-gradient(135deg, #2b5876 0%, #4e4376 100%); padding: 50px 20px; border-radius: 15px; margin-bottom: 20px;">
    <h1 style="color: white; margin: 0; font-size: 4em; font-family: sans-serif; letter-spacing: 4px; text-shadow: 2px 2px 4px rgba(0,0,0,0.3);">Recrible</h1>
    <p style="color: rgba(255,255,255,0.9); margin-top: 10px; font-size: 1.4em; font-weight: 300;">Precision Recruitment & Talent Crucible Platform</p>
  </div>
  
  <p>
    <img src="https://img.shields.io/badge/Java-21%2B-orange?style=for-the-badge&logo=java" /> &nbsp;
    <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot" /> &nbsp;
    <img src="https://img.shields.io/badge/Go-Auth_Service-00ADD8?style=for-the-badge&logo=go" /> &nbsp;
    <img src="https://img.shields.io/badge/React-TypeScript-61DAFB?style=for-the-badge&logo=react" /> &nbsp;
    <img src="https://img.shields.io/badge/Docker-Orchestrated-2496ED?style=for-the-badge&logo=docker" /> &nbsp;
    <img src="https://img.shields.io/badge/PostgreSQL-18-4169E1?style=for-the-badge&logo=postgresql" />
  </p>
</div>

---

## 📖 Overview
**Recrible** (a blend of *Recruit*, *Cible* [Target], and *Crucible*) is a modern recruitment platform designed to sort, filter, and seamlessly connect top talent (grains) with recruiter opportunities. 

> **💡 Engineering Decision:** To optimize performance and minimize infrastructure costs, Recrible adopts an innovative **multilith architecture**. The core business logic relies on a modular Spring Boot monolith, while security (JWT token generation and validation) is offloaded to a **high-performance Go (Golang) microservice**, eliminating unnecessary CPU overhead on the main application.

📋 **Complete functional specifications and system analysis are available in the [`/analyse`](./analyse) directory of this repository.**

---

## 🎨 1. Design & Modeling (UML & MERISE)

### 🖋️ UI/UX Prototyping (Figma)
| Candidate & Recruiter Interface | Component & User Flow Architecture |
| :--- | :--- |
| *SOON* | *SOON* |

### 🛠️ Software Architecture (UML)
*Object-oriented modeling of application structure and interactions.*

| Use Case Diagram | Sequence Diagram | Class Diagram |
| :--- | :--- | :--- |
| *SOON* | *SOON* | *SOON* |

### 📊 Persistence Layer (MERISE)
*From conceptual data modeling (MCD) to the logical data model (MLD).*

| Conceptual Data Model (MCD) | Logical Data Model (MLD) |
| :--- | :--- |
| *SOON* | *SOON* |

---

## ⚙️ 2. Backend Architecture & API

The project enforces a strict **N-Tier Architecture** for clean separation of concerns:
1. **Controller Layer:** REST endpoint exposure and payload validation.
2. **Service Layer:** Business logic implementation, transaction management (`@Transactional`), and contract definition via interfaces.
3. **Repository Layer:** Data access via **Spring Data JPA / Hibernate** coupled with **PostgreSQL**.

### 🛠️ Tech Stack & Security
| Layer | Technologies & Patterns |
| :--- | :--- |
| **Core Backend** | **Spring Boot**, **Java 21+**, **DTO Pattern**, **MapStruct** |
| **Auth Service** | **Go (Golang)** - Independent microservice (JWT / HS256) |
| **Persistence** | **PostgreSQL**, **Hibernate ORM** |

---

## 🌐 3. Network & Deployment Architecture (Docker)

The entire ecosystem is fully containerized and orchestrated via **Docker Compose** to guarantee environment parity between development and production.

| Service | External Port | Internal Port | Role |
| :--- | :--- | :--- | :--- |
| **Frontend** | `5173` | `5173` | React + TypeScript UI (Vite) |
| **Core API** | `8080` | `8080` | Spring Boot (Offers, CVs, Applications) |
| **Auth Service** | `8082` | `8082` | Go Authentication Microservice |
| **Database** | `5432` | `5432` | PostgreSQL Server |

---

## 🚀 4. Installation & Launch

```bash
# Clone the repository
git clone https://github.com/MatthieuClaessens/Recrible.git

# Navigate to the project directory
cd recrible

# Spin up the entire stack via Docker Compose
docker-compose up --build
