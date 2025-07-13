# Blog Backend System

A simple blog backend built with Spring Boot, secured using JWT authentication.

## Features

- User authentication with JWT
- Create and retrieve blogs
- Add comments to blogs
- RESTful API endpoints

## Technologies

- Java
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken)
- Maven

## API Endpoints

- `POST /authenticate` — Authenticate user and get JWT token
- `POST /blogs` — Create a new blog (JWT required)
- `GET /blogs` — Get all blogs (JWT required)
- `POST /blogs/{blogId}/comments` — Add comment to a blog (JWT required)

## Getting Started

1. **Clone the repository**
2. **Build the project**
