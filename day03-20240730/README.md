Use Spring Tool Suite 4 IDE
- Use `Spring Starter Project` option
OR
- Download and import a new project from https://start.spring.io/
    - Provide project name and select Java 17+
	- Select Gradle with groovy as build tool
	- Add `Spring Web`, `Spring JPA`, `Spring Devtools` as dependencies
	- Generate the project

Open the project in STS IDE
- Comment out `data-jpa` dependency in `build.gradle`
- Execute `Refresh Gradle Project` if not automatic.
- Run the project as `Spring Boot App`

