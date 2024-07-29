      
# Socket server basics
```
    server_socket = socket(IPV4, TCP)
    
    bind(server_socket, ( ip, port ))
    
    listen(server_socket, backlog(queue))
    
    while(true) {
        client_socket = accept()  (blocking call)
    
        recv(client_socket, buffer)
    
        // procesing of read data (request)
        // make response data ready for sending
        data = byte array
    
        did client say to shutdown? 
            send(client_socket, "OK! I am shutting down.")
            return 0;
    
        send(client_socket, data)
    
        // assume successful sending
        close(client_socket)
    
    }
```
    
    
    
## HTTP response message format
    HTTP/1.1 <StatusCode> <StatusMessage>**CRLF**
    HttpHeader1: value**CRLF**
    HttpHeader2: value**CRLF**
    **CRLF**
    Message body
