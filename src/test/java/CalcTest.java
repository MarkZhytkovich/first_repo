import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void sumTest() {
        Assert.assertEquals(calc.sum(2, 5), 7);
    }

    @Test
    public void diffTest() {
        Assert.assertEquals(calc.diff(10,6), 4);
    }

    @Test
    public void multTest() {
        Assert.assertEquals(calc.mult(3,4), 12);
    }

    @Test
    public void divTest() {
        Assert.assertEquals(calc.div(20,4), 5);
    }

}
