import org.testng.annotations.DataProvider;

/**
 * Created by Admin on 14.10.2015.
 */
public class DataProviders {

    @DataProvider(name = "primalNumber")
    public static Object[][] getTestNumbers() {
        return new Object[][] {
                {3, true},
                {25, false},
                {71, true},
                {13, true},
                {16, false},
                {17, false},
                {19, true},
                {117, true},
        };
    }
}
