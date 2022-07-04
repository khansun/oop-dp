package globalcontext;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequestTest {

    @Test
    public void testId(){
        Assertions.assertEquals(0, Request.getLastId());
        Request r1 = new Request();

        Assertions.assertEquals(1, r1.getId());
        Assertions.assertEquals(1, Request.getLastId());

        Request r2 = new Request();

        Assertions.assertEquals(2, r2.getId());
        Assertions.assertEquals(2, Request.getLastId());

        // r1 still got the old value (1), although lastId has changed.
        Assertions.assertEquals(1, r1.getId());
    }

    @Test
    public void testId2(){
        Assertions.assertEquals(0, Request.getLastId());
    }
}
