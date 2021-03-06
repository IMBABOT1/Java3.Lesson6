import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class OneOreFourParameters {
        @Parameterized.Parameters
        public static Collection<Object> params(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,2,3,4,3,2,4,1,1}, false},
                    {new int[]{8,7,5,12,43,35,1,11,12,3}, false},
                    {new int[]{16,2,4,7,4,3,42,11,14,3}, false},
                    {new int[]{1,2,4,7,2,12,42,11,6,3}, false},
                    {new int[]{1,1,1,1,1,1,1,1,1,4}, true},
                    {new int[]{4}, false},

            });
        }


    public OneOreFourParameters(int[] in, boolean oneOrFour1) {
        this.in = in;
        this.oneOrFour1 = oneOrFour1;
    }

    private int[]in;
    private boolean oneOrFour1;
    private OneOrFour oneOrFour;

    @Before
    public void init(){
        oneOrFour = new OneOrFour();
    }

    @Test
    public void test(){
        Assert.assertEquals(oneOrFour1, oneOrFour.oneOreFour(in));
    }

}
