import Lesson6.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2TestTrue {

    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }

    @Test
    public void test1() {
        Assert.assertTrue(Task2.Array1And4(new int[]{4, 1, 1, 4}));
    }

}