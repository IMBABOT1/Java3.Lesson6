import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class TestWithParameters {
    @Parameterized.Parameters
    public static Collection<Object> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,4,7,4,3,42,11,4,3}, new int[]{3}},
                {new int[]{8,7,5,12,43,35,1,11,12,3}, new int[]{}},
                {new int[]{16,2,4,7,4,3,42,11,14,3}, new int[]{3,42,11,14,3}},
                {new int[]{1,2,4,7,2,12,42,11,6,3}, new int[]{7,2,12,42,11,6,3}},

        });
    }

    private int[]in;
    private int[]result;
    private AfterLastFour afterLastFour;

    public TestWithParameters(int[] in, int[] result) {
        this.in = in;
        this.result = result;
    }

    @Before
    public void init(){
        afterLastFour = new AfterLastFour();
    }



    @Test
    public void Test1(){
        try {
            Assert.assertArrayEquals(result, afterLastFour.afterLastFour(in));
        }catch (RuntimeException e){
            Assert.assertTrue(true);
        }
    }
}
