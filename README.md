# Security-Spring-inMemory
Spring Security - Authentication and Authorization in memory 

## Requisitos
- Java 8 
- Maven 3.0
- Eclipse 
- Spring Boot


## Dependencias del proyecto SpringBoot
- Spring Security
- Spring Web
- Thymeleaf
- Spring Boot DevTools


##  Rol
-  ADMIN 
- MANAGER   
- EMPLOYEE

##  User and Password
-  user: adm -> password: adm
-  user: man -> password: man    
-  user: emp -> password: emp

##  Path
|   | ADMIN  |  MANAGER   | EMPLOYEE |
| ------------ | ------------ | ------------ | ------------ |
|  http://localhost:8080/login | SI | SI | SI |
| http://localhost:8080/home  | SI | SI | SI |
|  http://localhost:8080/welcome | SI | SI  | SI  |
|  http://localhost:8080/admin | SI | N0 |NO |
| http://localhost:8080/mgr |NO| SI |NO|
|  http://localhost:8080/common|NO| SI | SI |
|  http://localhost:8080/emp| NO | NO | SI  |


## Screenshot

![Screenshot 2021-06-25 at 13-35-28 Please sign in](https://user-images.githubusercontent.com/54692898/123458481-7b599080-d5bb-11eb-8127-5c03a3b53797.png)
![Screenshot 2021-06-25 at 13-35-54 Spring Security - Gustavo Ortiz](https://user-images.githubusercontent.com/54692898/123458492-7e548100-d5bb-11eb-8acd-299f82be9f86.png)
![Screenshot 2021-06-25 at 13-36-44 Spring Security](https://user-images.githubusercontent.com/54692898/123458499-80b6db00-d5bb-11eb-91fa-77e2279216df.png)
