import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class AfterLastFourTest {


    private int[]actuals = new int[]{1,2,4,4,2,3,4,1,7};
    private int[]arrExpecteds = new int[]{1,7};
    private int[]actuals1 = new int[]{1,2,8,5,2,3,2,1,7};
    private int[]arrExpecteds1 = new int[]{};
    private int[]actuals2 = new int[]{1,2,8,4,2,3,2,1,4};
    private int[]arrExpecteds2 = new int[]{};
    private int[]actuals3 = new int[]{1,2,4,4,2,3,4,1,7,4,3,9,18,17,6};
    private int[]arrExpecteds3 = new int[]{3,9,18,17,6};




    private AfterLastFour afterLastFour;
    @Before
    public void init(){
        afterLastFour = new AfterLastFour();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(arrExpecteds, afterLastFour.afterLastFour(actuals));
    }
    @Test
    public void test2(){
        try {
            Assert.assertArrayEquals(arrExpecteds1, afterLastFour.afterLastFour(actuals1));
        }catch (RuntimeException e){
            Assert.assertTrue(true);
        }

    }
    @Test
    public void test3(){
        Assert.assertArrayEquals(arrExpecteds2, afterLastFour.afterLastFour(actuals2));
    }
    @Test
    public void test4(){
        Assert.assertArrayEquals(arrExpecteds3, afterLastFour.afterLastFour(actuals3));
    }
}
