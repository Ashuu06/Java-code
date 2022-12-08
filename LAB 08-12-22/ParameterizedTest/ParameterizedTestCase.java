package testcases;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testclasses.PrimeLogic;


@RunWith(Parameterized.class)
class ParameterizedTestCase {
	private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeLogic logic;

    @BeforeEach
    public void initialize() {
       logic = new PrimeLogic();
    }

    public ParameterizedTestCase(Integer inputNumber,Boolean expectedResult) {
      System.out.println("TestJunit-> inputNumber:"+inputNumber+" expectedResult:"+expectedResult);
       this.inputNumber = inputNumber;
       this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
      System.out.println("primeNumbers() is called");
       return Arrays.asList(new Object[][] {
          { 2, true },{ 6, false },{ 19, true },{ 22, false },{ 23, true }
       });
    }

    @Test
    public void testPrimeNumberChecker() {
       System.out.println("Parameterized Number is : " + inputNumber);
       assertEquals(expectedResult, logic.validate(inputNumber));
    }
}
