package powerpackage;

public class FindThePowerOfANumber {
    public static int calculatePower(int baseValue, int exponentValue) {
        int result = 1;
        for (int i = 0; i<exponentValue; i++) {
            result *= baseValue;
        }
        return result;
    }
}
