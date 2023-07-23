package org.example.business;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {



    //Mocking List with 1 return
    @Test
    public void letsMockListSize() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }

    //Mocking List with multiple return values
    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }


    @Test
    public void letsMockListGet() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(0)).thenReturn("Kritika");
        assertEquals("Kritika", list.get(0));
        assertNull(list.get(1));
    }

    //Argument Matchers
    @Test
    public void letsMockListGetWithAny() {
        List<String> list = mock(List.class);
        when(list.get(anyInt())).thenReturn("Kritika");
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        assertEquals("Kritika", list.get(0));
        assertEquals("Kritika", list.get(1));
    }

    //Argument Matchers with exceptions
    @Test(expected = RuntimeException.class)
    public void letsMockListGetWithAny_ReturnException() {
        List<String> list = mock(List.class);
        when(list.get(anyInt())).thenThrow(new RuntimeException("Error"));
        list.get(0);
    }

}
