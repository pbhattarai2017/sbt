### Spring Installation for Windows
- Install JDK from Oracle Java SE 22 JDK [Download JDK] (https://download.oracle.com/java/22/archive/jdk-22_windows-x64_bin.exe)
- Open Spring Tool Suite
  - Go to File > New > Spring Starter Project
    - Provide `Name` for the project
    - Type: Gradle - Groovy
    - Packaging: Jar
    - Java Version: 22
    - Language: Java
  - Press `Next` and then select the following options:
    - Spring Boot Version: 3.4.0 (SNAPSHOT)
	- For dependencies, search and select the following:
	  - Spring Web
	  - Spring Boot DevTools
  - Press `Finish` and wait for the project to fetch and build.
  - To test-run the project
    - Right click on the project name from `Project Explorer`
	- Go to `Run As` > `Spring Boot App` to start the project.
  - If any issue, refer in the training session.


### Task 1:
Create a route **/dice**

that randomly displays one of
		
		ONE, TWO, THREE, FOUR, FIVE, SIX

    
### Task 2:
Create a **TODO** list:

- `/todo/training`      : add new todo `training`
- `/todo/snack`         : add another todo `snack`
- `/todo/done/training` : remove `training` from todo

- `/todo`       : show all todo

TODO:
- training
- snack 
