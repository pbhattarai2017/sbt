@Controller
public class TodoController {

	List<Todo> todoList = new ArrayList<>();

	@GetMapping("/")
	public String showTodos(Model model) {
		model.addAttribute("todos", todoList);
		return "todo";
	}

	@GetMapping("/add/{title}")
	public String addTodo(@PathVariable("title") String title, Model model) {

		todoList.add(new Todo(title));

		model.addAttribute("todos", todoList);
		return "todo";
	}

	@GetMapping("/delete/{id}")
	public String deleteTodo(@PathVariable("id") int id, Model model) {

		// remove by using lambda expression;
		// lambda is an anonymous function that can be passed as argument
		// here, the lambda `todo -> todo.getId() == id` returns a boolean value
		// the lambda accepts a value (type Todo in this case)
		// if lambda returns `true` for an element; that element will be deleted from the list
		todoList.removeIf(todo -> todo.getId() == id);

		return showTodos(model);
	}

}
