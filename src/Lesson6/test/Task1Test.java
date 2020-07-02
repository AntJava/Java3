import Lesson6.Task1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 7, 1, 1, 3, 3, 7, 4, 2, 3, 3}, new int[]{2, 3, 3}},
                {new int[]{4, 7, 1, 4, 3, 4, 7, 2, 4, 3, 3}, new int[]{3, 3}}
        });
    }

    private int[] in;
    private int[] out;

    public Task1Test(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    private Task1 task1;

    @Before
    public void startTest() {
        task1 = new Task1();
    }

    @Test
    public void testAfterLast4() {
        Assert.assertArrayEquals(out, Task1.ArrayAfterLast4(in));
    }

//    @Test(expected = RuntimeException.class)
//    public void testAfterLast4Ex() {
//        Task1.ArrayAfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
//    }
}
