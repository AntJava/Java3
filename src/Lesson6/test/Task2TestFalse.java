import Lesson6.Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task2TestFalse {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 1}},
                {new int[]{4, 4, 4, 4}},
                {new int[]{4, 1, 2, 3}}
        });
    }
    private int[] in;

    public Task2TestFalse(int[] in) {
        this.in = in;
    }

    private Task2 task2;

    @Before
    public void startTest() {
        task2 = new Task2();
    }

    @Test
    public void test1() {
        Assert.assertFalse(Task2.Array1And4(in));
    }

//    @Test
//    public void test2() {
//        Assert.assertTrue(Task2.Array1And4(new int[]{4, 1, 1, 4}));
//    }

}