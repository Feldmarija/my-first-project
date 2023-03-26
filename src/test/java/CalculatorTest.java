import classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator casio = new Calculator();
    @Test
    public void testSum () {

     //   System.out.println(casio.sum(5,5));
     // int sumNumber = casio.sum(5,5);
     //   System.out.println(sumNumber);
        Assert.assertEquals(casio.sum(10,50), 60);
    }

    @Test
    public void testDivide () {
        Assert.assertEquals(casio.divide(50,10),5);
    }

    @Test
    public void testMultiply () {
        Assert.assertEquals(casio.multiply(50,10), 500);
    }

    @Test
    public void testSubtract () {
        Assert.assertEquals(casio.subtracts(50,10), 40);
    }

}
