import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TwoNumbersTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbersTest.csv")
    public void comparingTwoNumbersAB(int expected, int numA, int numB) {
        TwoNumbers twoNumbers = new TwoNumbers();
        int actual = twoNumbers.comparing(5, 3);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbersTest.csv")
    public void comparingTwoNumbersBA(int expected, int numA, int numB) {
        TwoNumbers twoNumbers = new TwoNumbers();
        int actual = twoNumbers.comparing(3, 5);
        Assertions.assertEquals(expected, actual);
    }

}
