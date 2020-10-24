# Backend-React-ProfessionalFullStack

BackEnd service for the final exercise of the course "Desarrollo en React JS" at Centro de E-learning UTN BA.
This service use Springboot, Jwt for authentication, a Mysql database and Aspects for logging the petitions.

## EndPoints
- **GET** /cards -> Return all cards in the database with their information
- **POST** /users -> Create an user with the username and password specified
- **POST** /authenticate -> Return a Jwt Token if the credentials are valid.
