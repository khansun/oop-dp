package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleStackTest {
    @Test
    void simpleStackDemo(){
        SimpleStack<String> stack = new SimpleStack<>(10);
        stack.push("IUT");
        String item = stack.pop();
        // Now, compiler knows that String was pushed

        Assertions.assertEquals("iut", item.toLowerCase());
    }
}
