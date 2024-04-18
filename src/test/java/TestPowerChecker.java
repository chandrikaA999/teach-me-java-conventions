import org.junit.Test;
import powerpackage.FindThePowerOfANumber;

public class TestPowerChecker {

    @Test
    public void oneRaisedToOneIsOne() {
        assert FindThePowerOfANumber.calculatePower(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert FindThePowerOfANumber.calculatePower(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert FindThePowerOfANumber.calculatePower(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert FindThePowerOfANumber.calculatePower(3, 2) == 3*3;
    }


}
