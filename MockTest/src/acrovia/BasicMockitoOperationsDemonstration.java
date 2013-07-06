package acrovia;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.mockito.InOrder;
 
public class BasicMockitoOperationsDemonstration {
    @Test
    public void simpleExampleOnHowToMakeMockObjectReturnWhatWeWant() throws Exception {
        // create a mock object, that will pretend to be an ArrayList
        @SuppressWarnings("unchecked")
		ArrayList<String> arrayList = mock(ArrayList.class);
 
        // program the mock object to return "hello world" when get(0) is called
        given(arrayList.get(0)).willReturn("hello world");
 
        // this will output "hello world", since that was what the mock object was told to return
        System.out.println(arrayList.get(0));
    }
 
    @Test
    public void simpleExampleOnHowToVerifyThatMockObjectWasCalled() throws Exception {
        // create a mock object, that will pretend to be a Date
        Date date = mock(Date.class);
 
        // call a method on the mock object
        date.setTime(123L);
 
        // verify that the method was called with 123L
        verify(date).setTime(123L);
        // verify that the method was not called with 124L
        verify(date, never()).setTime(124L);
    }
 
    @Test(expected = RuntimeException.class)
    public void simpleExampleOnHowToMakeMockObjectThrowExceptionWhenMethodIsCalled() throws Exception {
        // create a mock object, that will pretend to be a Runnable
        Runnable runnable = mock(Runnable.class);
 
        // program the mock object to throw an exception when run() is called
        doThrow(new RuntimeException()).when(runnable).run();
 
        // this line will throw a RuntimeException since the mock object was programmed to do so
        runnable.run();
    }
 
    @Test
    public void simpleExampleOnHowToValidateTheOrderOfMethodCalls() throws Exception {
        // create two mock objects
        Runnable runnable = mock(Runnable.class);
        Date date = mock(Date.class);
 
        // call the mocks
        runnable.run();
        date.getTime();
 
        // verify that methods were call in expected order
        InOrder order = inOrder(runnable, date);
        order.verify(runnable).run();
        order.verify(date).getTime();
    }
}