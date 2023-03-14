package mockito.examples;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
public class MockitoExamples {

    @Test
    public void testLinkedListGetElement(){
        final var list= Mockito.mock(java.util.LinkedList.class);
        Mockito.when(list.size()).thenReturn(10);

        assertEquals(10,list.size());
    }

    @Test
    public void testLinkedListGetElement_ThrowException(){
        final var list=Mockito.mock(java.util.LinkedList.class);
        Mockito.when(list.add(Mockito.anyString())).thenThrow(new RuntimeException("You cannot insert"));
        assertThrows(RuntimeException.class,()->list.add("John"));
    }

    @Test
    public void testLinkedListGetElement_ThrowException_Test(){
        final var list=Mockito.mock(java.util.LinkedList.class);
        Mockito.when(list.add("john")).thenThrow(new RuntimeException("You cannot insert data in this list"));

        assertThrows(RuntimeException.class,()->list.add("john"));
    }
}
