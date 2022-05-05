import org.junit.Assert;
import org.junit.Test;

public class TestCacl {
    @Test
    public void testMonthlyPayment(){
        Cacl cacl = new Cacl();
        int s = 10_000;
        double r = 0.5;
        int t = 24;
        int expected = 5000;
        int result = cacl.monthlyPayment(s,r,t);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testPayOut(){
        Cacl cacl = new Cacl();

        int monthlyPayment = 5000;
        int t = 24;
        int expected = 120_000;

        int result = cacl.payOut(monthlyPayment,t);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testOverpayment(){
        int payOut = 120_000;
        int s = 10_000;
        int expected = 110_000;

        int result = new Cacl().overpayment(payOut,s);
        Assert.assertEquals(expected,result);
    }
}
