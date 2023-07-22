package org.example.business;

import org.example.data.api.TodoService;
import org.example.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filterdTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filterdTodos.size());
        assertEquals("Learn Spring boot", filterdTodos.get(0));
        assertEquals("Spring MVC", filterdTodos.get(1));
//        assertEquals("Learn coding", filterdTodos.get(2));
    }
}
