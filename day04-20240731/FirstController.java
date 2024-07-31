@RestController
public class FirstController {

	@GetMapping("/")
	public String hello() {
		return "Welcome to my website";
	}

	@GetMapping("/time")
	public String time() {
		return "Current time is ";
	}

	@GetMapping("/{x}")
	public String calculate(@PathVariable("x") int x) {
		return "You entered " + x;
	}

	@GetMapping("/greet/{name}/{times}")
	public String greet(@PathVariable("name") String name, @PathVariable("times") int times) {

		String res = "";
		for (int i = 1; i <= times; i++) {
			res = res + name;
		}

		return res;

	}
}
