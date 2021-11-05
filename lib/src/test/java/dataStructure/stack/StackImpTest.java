package dataStructure.stack;

import dataStructure.URL;
import lombok.extern.java.Log;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

@Log
public class StackImpTest {

    @Test
    public void stackHistoryWeb(){
        Stack stack = new StackImp();

        log.info("Stack is Empty: "+stack.isEmpty());

        stack.push(new URL("www.google.com.co"));
        stack.push(new URL("www.facebook.com.co"));
        stack.push(new URL("www.Instagram.com.co"));
        stack.push(new URL("www.outlook.com.co"));

        log.info(stack.toString());
        stack.pop();
        log.info(stack.toString());
        log.info("Top Element: "+stack.peek());
        log.info(stack.toString());

        assertFalse("Stack is not Empty", stack.isEmpty());

    }
}
