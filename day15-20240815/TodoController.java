import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TodoController {

	List<Todo> todoList = new ArrayList<>();

	Random random = new Random();

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

		List<Todo> filteredList = new ArrayList<>();
		for (Todo todo : todoList) {
			if (todo.getUserid().equals(userid)) {
				filteredList.add(todo);
			}
		}

		model.addAttribute("todos", filteredList);

		return "todo";
	}

	@GetMapping("/todo/add")
	public String addTodo(@RequestParam("title") String title, @RequestParam("desc") String desc, Model model,
			HttpServletRequest req, HttpServletResponse resp) {

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

		todoList.add(new Todo(title, userid));

		List<Todo> filteredList = new ArrayList<>();
		for (Todo todo : todoList) {
			if (todo.getUserid().equals(userid)) {
				filteredList.add(todo);
			}
		}

		model.addAttribute("todos", filteredList);

		return "todo";

	}

//	@GetMapping("/delete/{id}")
//	public String deleteTodo(@PathVariable("id") int id, Model model) {
//
//		todoList.removeIf(todo -> todo.getId() == id);
//
//		model.addAttribute("todos", todoList);
//		return "todo";
//	}

}
