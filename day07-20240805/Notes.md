### Use `Ctrl+Shift+O` as import shortcut


### Task 1:
-  Create a dice controller that gives predictable outcome in order
    ONE, TWO, THREE, ... FIVE, ONE, TWO, ... and so on.
    
-  Create "/random" to give random outcome
    FOUR, ONE, FIVE, ...
    
### Task 2:
-  Create a TODO list app with following features:
  -  list all todos
  -  add new todo
  -  make any todo 'DONE'


Iterating through a list using thymeleaf expression.
Here, 'todos' is model attribute
```
<ul th:each="t : ${todos}">
    <li th:text="${t}"></li>
</ul>
```
