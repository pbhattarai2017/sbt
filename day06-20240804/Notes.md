## Serving View (html page) from Controller

Using `Add to Starter` option;
- add `thymeleaf` dependency to `build.gradle`

### Thymeleaf - html templating engine

```
@Controller     /* this type of controller serves templates */
public HomeController {
 
    @GetMappping("/home")
    public String index() {
        return "index";    /* serves index.html from `/src/main/resources/templates/`
    }
 
}
```

### Task 1
Enhance the TODO list app with templating
& add some css for visual 

