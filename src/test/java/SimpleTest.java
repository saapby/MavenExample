
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Admin on 14.10.2015.
 */
public class SimpleTest {



    @Test (dataProvider = "primalNumber", dataProviderClass = DataProviders.class, groups = "DDT")
    public void simpleTest(int number, boolean expectedResult) {
        PrimalNumberChecker cheker = new PrimalNumberChecker();
        boolean result = cheker.isNumberPrimal(number);
        Assert.assertEquals(result, expectedResult);
        //System.out.println(number + " " + expectedResult + " " + result);
    }

    @Test (groups = "sanity")
    public void fiftinTest() {
        PrimalNumberChecker cheker = new PrimalNumberChecker();
        boolean result = cheker.isNumberPrimal(15);
        Assert.assertEquals(result, false);
        //System.out.println(15 + " " + false + " " + result);
    }

    @Test (groups = "sanity")
    public void twentyThreeTest() {
        PrimalNumberChecker cheker = new PrimalNumberChecker();
        boolean result = cheker.isNumberPrimal(23);
        Assert.assertEquals(result, true);
        //System.out.println(23 + " " + true + " " + result);
    }
}
