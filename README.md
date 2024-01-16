Mockito BDD Style

Mockito supports the Behavior Driven Development (BDD) style of writing tests. BDD is a testing approach that encourages collaboration between developers, QA, and non-technical stakeholders to define the behavior of the system through examples in natural language. Mockito provides BDD-style methods to make tests more expressive and readable.

Key BDD Methods in Mockito:
given(...).willReturn(...):

This is used to set up the expected behavior. It specifies what the mock should return when a certain method is called with specific arguments.
Example: given(todoBusiness.retrieveTodosRelatedToSpring("Dummy")).willReturn(todos);
given(...).willThrow(...):

Similar to willReturn, it's used to specify that a certain exception should be thrown when a method is called.
Example: given(list.get(anyInt())).willThrow(new RuntimeException("Unexpected"));
given(...).willAnswer(...):

Allows you to define custom behavior using an Answer callback.
Example: given(list.get(anyInt())).willAnswer(invocation -> "Kritika");
then(...):

Used to express the verification step. It verifies that certain interactions have occurred.
Example: then(todoServiceMock).should().retrieveTodosRelatedToSpring("Dummy");

Given: The initial setup where we create a mock and define its behavior.
When: The action or method call that triggers the behavior we set up.
Then: The assertion to verify the expected outcome.
This BDD-style code makes the test more readable and aligns with the natural language flow of Given-When-Then.

Remember, BDD focuses on the behavior of the system rather than the implementation details, leading to more expressive and maintainable tests.
