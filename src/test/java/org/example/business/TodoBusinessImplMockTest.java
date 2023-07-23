package org.example.business;

import org.example.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMockito() {

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring boot", "Spring MVC", "Learn coding");

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        when(todoBusiness.retrieveTodosRelatedToSpring("Dummy")).thenReturn(todos);
        List<String> filterdTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filterdTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMockito_EmptyList() {

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList();

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        when(todoBusiness.retrieveTodosRelatedToSpring("Dummy")).thenReturn(todos);
        List<String> filterdTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0,filterdTodos.size());
    }
}
