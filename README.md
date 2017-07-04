# spring-boot-demo
sample spring boot application to integrate spring-boot-starter - web, rest and data-jpa

### Building the project
$ gradle build

### Running the project

In your IDE, right-click on SpringBootDemoApplication.java file -> run as Java Application

1. To get a list of all the teams 
http://localhost:8080/teams

2. To get a team details by the ID
http://localhost:8080/teams/1

### Before running this as a Web App, look at how the below end-points were configured in SpringBootDemoController. Observe the new methods added in the DAO layer (TeamDao.java)

1. To get a list of all the teams
http://localhost:8080/services/teams/MI

2. To get a team details by the name
http://localhost:8080/services/teams/MI

### Include Web Templete using Thymeleaf. See how this request is fulfilled by the web app.

http://localhost:8080/services/welcome/Curry

Also, observe the changes in build.gradle to create a deployable war file instead of jar.