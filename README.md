# Pet-Clinic API

A simple API using Java and Springboot made for [Flutter-Pet-Clinic](https://github.com/LiveLikeCounter/Flutter-Pet-Clinic)

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Endpoints](#endpoints)

## Description

Provide a brief overview of your project. Explain what it does, its purpose, and any relevant details.

## Prerequisites

Before running this project, ensure that you have the following prerequisites:

- Docker: [Installation Guide](https://docs.docker.com/engine/installation/)

## Installation

To get started, follow these steps:

1. Clone the repository:
```bash
git clone https://github.com/gluzds/pet-clinic.git
```
2. Navigate to the project folder
3. Run the project using docker compose
```bash
docker compose up
```
4. Access Swagger documentation on http://localhost:8085/swagger-ui/index.html

## Endpoints
### User
- GET /users: Get a list of all users.
- GET /users/{id}: Get a user by ID.
- POST /users: Create a new user.
- GET /users/{id}/pets: Get all pets of a given user.
### Pet
- GET /pets: Get a list of all pets.
- GET /pets/{id}: Get a pet by ID.
- POST /pets: Create a new pet.
### Notification
- GET /notifications: Get a list of all notifications.
- GET /notifications/{id}: Get a notification by ID.
- POST /notifications: Create a new notification.
### Medical Record
- GET /medical-records: Get a list of all medical records.
- GET /medical-records/{id}: Get a medical record by ID.
- POST /medical-records: Create a new medical record.
### Appoitment
- GET /appoitments: Get a list of all appoitments.
- GET /appoitments/{id}: Get a appoitment by ID.
- POST /appoitments: Create a new appoitment.
