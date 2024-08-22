### Task 1

Create a User table/object
    - id (int; auto-increment)
    - username (String)
    - password (String) store hashed password if possible)
    - fullname (optional)
    - cookie  (String, session id)
    - etc.
    
Todo
 - id (int; auto-increment)
 - title
 - description
 - date
 - userid (type: int, userid -> User.id)

 
 At first, user should login to get a session id (as cookie)
    - send username, password
    - check if username does not exist
        - create new User with given username, password
    - else
        - check if password matches, if not return to login page with error msg
    - generate a new cookie 
    - save the cookie to that User object
    - send login successful page with cookie


 
 
 
