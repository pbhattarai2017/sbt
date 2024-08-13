
### Questions:

  - Can user identifier be
    - "bob/123"
      - Why not? Because "/" is used as url route delimiter
    - "bob?123"
      - Why not? Because "?" is used as delimiter for query params
    
    - & is also not allowed as it is used to delimit *key=value* pairs in query params
  
*Note*: delimiter is a separator symbol <br>
For example: Firstname Lastname <br>
Here, space '&nbsp;' is used as **delimiter** to separate Firstname & Lastname

### Problems with current implementation:
  - User has to type their identifier in the url itself.
    - Solution: ?
  
  - User identifier could be duplicated. Another user might provide existing identifier as id
    - Solution: Rather than user decide their identifer, the server should provide identifier to user.
  
  - User identifier could be guessed and that user's data
    could be exposed to another user.
    - Solution: The server should generate unique & unguessable identifier for each user.

  - User identifier could be leaked outside the client application.
    - Solution: ?
  

### Task 1:
Create a method to perform the following:

  - ***(1)*** Server generates a random id (alphanumeric characters including some special characters)
  - ***(2)*** Server checks against exising user ids that it has distributed already
    - Server should store all distributed user ids
    - Storage data structure?
  - If not unique go through ***(1)*** & ***(2)***
  - Finally, returns the id

How should we generate id?

  - Should contain alphanumeric sequence in randomized way, for e.g. `OorscXSTK3FxX2lHC0CR`
  - Should be sufficiently long
  - Should have no inherent meaning 
  - Use `java.util.Random` API for now

*Note*: Please refer to [`UserIdGenerator.java`](./UserIdGenerator.java) for hints regarding this Task
    
### Task 2
Having successfully generated a unique ID (userid) by the server,
how do the server communicate that ID securely to that client?

- ID should not be accessible by other system besides
the ID holder (user)
    
    
    
    
    
    
    
  
  
  
  
  
  

  
  
