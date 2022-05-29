package Lesson8;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    private Calculator calculator;
    @Before
    public  void InitClass()
    {
        calculator =new Calculator();
    }

    @Test
    public void ShouldTestMultiplyPositive() {
        int actual=calculator.multiply(3,4);

        assertEquals("תוצאה לא זהה של כפל", 12,actual);

    }

    @Test
    public void ShouldTestMultiplyNegativeVariables() {
        int actual=calculator.multiply(-3,-4);

        assertEquals("תוצאה לא זהה של כפל", 12,actual);

    }


}
