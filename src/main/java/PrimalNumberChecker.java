/**
 * Created by Admin on 14.10.2015.
 */
public class PrimalNumberChecker {
    public boolean isNumberPrimal(int number) {
        for (int i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
