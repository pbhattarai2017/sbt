
### Cookies
 - To transmit sensitive & private user data (e.g. user ID)
 

We can send a new cookie to a user in the controller method as follows:

```
@GetMapping("/todo")
public String showTodos(Model model, HttpServletRequest req, HttpServletResponse resp) {
    resp.setHeader("Set-Cookie", "id=" + userid);
    return "todo";
}
```

After sending a new cookie, the browser will include that cookie in every subsequent HTTP requests. And
we can get that cookie as follows:

```
@GetMapping("/todo")
public String showTodos(Model model, HttpServletRequest req, HttpServletResponse resp) {

	Cookie[] cookies = req.getCookies();
	
	String userid = null;
	if (cookies != null) {
	for (Cookie cookie : cookies) {
			if (cookie.getName().equals("id")) {
				userid = cookie.getValue();
				break;
			}
		}
	}

	if (userid == null) {
		userid = UserIdGenerator.generateId();
		resp.setHeader("Set-Cookie", "id=" + userid);
	}

	//The above code can be refactored into a method for reusability

	//Here, we finally get the user ID in `userid` variable

	List<Todo> filteredList = new ArrayList<>();
	for (Todo todo : todoList) {
		if (todo.getUserid().equals(userid)) {
			filteredList.add(todo);
		}
	}

	model.addAttribute("todos", filteredList);

	return "todo";
}
```

In the above code, we set the value of <span style="color: red">userid</span> from cookie provided the HTTP request. And that <span style="color: red">userid</span> can be used for user specific tasks in the controller. For example, it is being used in the above code for filtering user (identified by <span style="color: red">userid</span>) specific `Todo`s from the `todoList` array. The list of filtered `Todo`s, i.e. `filteredList` is finally sent to template for generating the view.

#### Note:
Please refer [Todo.java]("./Todo.java") & [TodoController.java]("./TodoController.java") for clarity.
