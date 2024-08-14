
## Task 1

- Generation of unique and un-guessable ID for user identification
- Transmission of the ID in a secure manner
            
```           
              request
    Client --------------------------> Server
                                        (Generates ID)
            
    How do server communicate ID to client?
     - Server send the ID using an Http Header to client in response message
            
                           response
    Client <-------------------------- Server
                    
```

- Browser is the client
- Every HTTP requests should include the ID (provided in a http header).
    
- Cookies
  - a set of key=value pairs
  - when server sets a cookie (key=value); that "key=value" is automatically included in every subsequent HTTP requests by the browser
  - `id=l82hadfKHDIJD` is an example of a cookie
    

```
            Request(data = (method, url, Http Headers))
    Client -----------------------> Server
    
              Response(status, http headers, body (response))
    Client <----------------------- Server
    
    GET /todo HTTP/1.1
    Connection: keep-alive
    Host: http://localhost:8080
    Cookie: id=ka2398sdfnakHDL
    
```
    
    
HTTP request
--------------------
```
GET /todo HTTP/1.1
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8,ne;q=0.7
Cache-Control: max-age=0
Connection: keep-alive
Host: localhost:8080
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36
sec-ch-ua: "Not/A)Brand";v="8", "Chromium";v="126", "Google Chrome";v="126"
sec-ch-ua-mobile: ?0
```

HTTP response
---------------------
```
HTTP/1.1 200
Content-Type: text/html;charset=UTF-8
Content-Language: en-GB
Content-Length: 150
Transfer-Encoding: chunked
Date: Wed, 14 Aug 2024 07:09:58 GMT
Keep-Alive: timeout=60
Connection: keep-alive

<!DOCTYPE html>
<html>
<html>
	<head>
		<title>Dice</title>
		<link rel="stylesheet" type="text/css" href="/css/styles.css">
	</head>
	<body>
		<h1>Todo List</h1>
		<div>
			
		</div>
	</body>	
</html>
```

### Code
The server could set a **cookie** as following:

```
@GetMapping("/todo")
public String showTodos(Model model, HttpServletRequest req, HttpServletResponse resp) {
	model.addAttribute("todos", todoList);
	resp.setHeader("Set-Cookie", "id=ka2398sdfnakHDL");
	return "todo";
}
```
