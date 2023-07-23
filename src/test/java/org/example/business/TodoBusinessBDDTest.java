package org.example.business;

import org.example.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;

//Behavior Driven Data
public class TodoBusinessBDDTest {


    @Test
    public void usingMockito() {
        TodoService todoService = mock(TodoService.class);
        List<String> allTodos = Arrays.asList("Learn Spring MVC",
                "Learn Spring", "Learn to Dance");
        when(todoService.retrieveTodos("Krit")).thenReturn(allTodos);
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Krit");
        assertEquals(2, todos.size());
    }


    @Test
    public void usingMockito_UsingBDD() {

        //Given
        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring boot", "Spring MVC", "Learn coding");

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

        //When
        given(todoBusiness.retrieveTodosRelatedToSpring("Dummy")).willReturn(todos);

        List<String> filterdTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

        //Then
        assertThat(filterdTodos.size(), is(2));
    }




  // More readable and easy to understand
}
