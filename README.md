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
-  adm -> adm
-  man -> man    
-  emp -> emp

##  Path
|   | ADMIN  |  MANAGER   | EMPLOYEE |
| ------------ | ------------ | ------------ | ------------ |
|  http://localhost:8080/login |  SI |  SI | SI |
| http://localhost:8080/home  |  SI | SI | SI |
|  http://localhost:8080/welcome |  SI | SI  | SI  |
|  http://localhost:8080/admin | SI  | N0 |NO |
| http://localhost:8080/mgr |NO| SI  |NO|
|  http://localhost:8080/common|NO| SI  | SI  |
|  http://localhost:8080/emp| NO | NO | SI  |
