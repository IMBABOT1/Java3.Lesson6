import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OneOreFour {



    private int[]actuals = new int[]{1,1,4,4,1,1,1,1,1};
    private int[]actuals1 = new int[]{1,1};
    private int[]actuals2 = new int[]{1,2,4,1,1,3,1,1,4};
    private int[]actuals3 = new int[]{1,1,4,4,1,1,1,1,4};
    private int[]actuals4 = new int[]{1,2,4,4,2,3,4,1,7,4,3,9,18,17,6};

    private OneOrFour oneOreFou;
    @Before
    public void init(){
      oneOreFou = new OneOrFour();

    }

    @Test
    public void test(){
        Assert.assertTrue(oneOreFou.oneOreFour(actuals));
    }

    @Test
    public void test1(){
        Assert.assertTrue(oneOreFou.oneOreFour(actuals1));
    }

    @Test
    public void test2(){
        Assert.assertTrue(!oneOreFou.oneOreFour(actuals2));
    }

    @Test
    public void test4(){
        Assert.assertTrue(!oneOreFou.oneOreFour(actuals4));
    }

    @Test
    public void test3(){
        Assert.assertTrue(oneOreFou.oneOreFour(actuals3));
    }

}
