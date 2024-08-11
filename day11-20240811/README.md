### Using FORM UI to make GET requests

-  Allows us to make GET requests (URL requests) without manually typing
    URL routes
-  Form UI can be used to send many data fields in the same requests


```
<form action="/todo/add" method="GET">
    
    <label for="title">Title: </label>
    <input id="title" type="text" name="title">
    
    <label for="desc">Description: </label>
    <input id="desc" type="text" name="desc">
    
    <input type="submit" value="SUBMIT">
</form>
```

### Controller: 

```
/todo/add/Go to market     @GetMapping("/todo/add/{title}") 
                            String addTodo(@PathVariable("title") String title,
                                            Model model)

                                
/todo/add?title=Nepathya&desc=ITCollege        @GetMapping("/todo/add")
                            @GetMapping(@RequestParam("title") String title,
                                        @RequestParam("desc") String description

? in url begins query parameter sequence (key=value pairs delimited by '&')
```

### Form: 
Title: [  Nepathya              ] [SUBMIT]
