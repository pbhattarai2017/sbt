### Personalization

`http://192.168.90.88:8080/alice123xyz/newTodo`

Here, `alice123xyz` can be used as identifier.

@GetMapping("/{identifier}")
@PathVariable("identifier")

#### Axioms
  - Server does not remember previous connections
  - Client should provide identification at every request

#### Todo
  - int: id
  - String: title
  - String: description
  - Date: createdAt
  - String: userid (alphanumeric)
    
    - Todo(1, "ABC", "DESC", "2024-08-12", "alice123")
    - Todo(2, "ABC", "DESC", "2024-08-12", "bob789")
```
todoList.add(new Todo(title, description, userid));

GET /alice123/todo
 
List<Todo> li =  todoList.stream().filter(t -> t.getIdentifier().equals(userid)).toList();
```
