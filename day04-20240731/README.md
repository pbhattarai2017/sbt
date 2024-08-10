### Spring Boot is a MVC framework

      Model
        |
    Controller
        |
      View
                
             -> requests(1)
    (Client) --------------------- (Server)
                    <- responds(2)
    
    Requests and Response are all data
    
    First client calls a controller
    Server generates a view (data) based on Model(data store)
    
    Create:
    /greet/=/5
    
    =====

```
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
```

- @RestController is used to annotate a Controller class
    
- @GetMapping is used to map a specific url pattern to a specific controller method 
    
    
    
    
    
    
    
    
    
    
    
    
    
