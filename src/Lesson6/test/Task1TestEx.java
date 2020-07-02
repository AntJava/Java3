import Lesson6.Task1;
import org.junit.Before;
import org.junit.Test;

public class Task1TestEx {

    private Task1 task1;

    @Before
    public void startTest() {
        task1 = new Task1();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task1.ArrayAfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}