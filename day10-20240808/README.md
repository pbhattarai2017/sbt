### Hyperlinks in Thymeleaf

In thymeleaf, hyperlink has a special syntax `@{}` that can be used to generate dynamic links.

`<a th:href="@{route}">Click Here</a>` *will be rendered as* <br>
`<a th:href="route">Click Here</a>`

We can also use variables inside `@{}` expression like: <br>
`<a th:href="@{/delete/{id}(id=${x})}">Delete</a>`

Here, `id` is used like `/delete/{id}` and its value is assigned using `(id=${x})`. Here `x` is another variable.
For example if the value of `x` is `123`. Then the rendered anchor tag will be: <br>
`<a th:href="/delete/123">Delete</a>` <br>

Try it out for Todo List:<br>
`<a th:href="@{/delete/{id}(id=${e.id})}">Delete</a>`

Here `e` is a Todo object received through `Model`. The value of `id` is received from `(id=${e.id})`. `e.id` will be evaluated implicitly by thymeleaf by calling the getter of `id` (i.e. by calling `e.getId()` )

