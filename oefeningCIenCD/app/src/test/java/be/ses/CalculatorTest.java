package be.ses;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void gegevenTeller2Noemer1_wanneerDivide_danResult2() {
      // 1. Arrange
      Calculator calculator = new Calculator();
  
      // 2. Act
      Float result = calculator.divide(2, 1);
      System.out.println(result);
  
      // 3. Assert
      assertThat(result).isEqualTo(2);
    }
  
    @Test
    public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
      // 1. Arrange
      Calculator calculator = new Calculator();
  
      // 2. Act
      Float result = calculator.divide(2, 4);
      System.out.println(result);
  
      // 3. Assert
      assertThat(result).isEqualTo(0.5f);
    }
  
    @Test
    public void gegevenTellerXNoemer0_wanneerDivide_danDivideByZeroException() {
      // when
      Throwable thrown = catchThrowable(() -> {
        // 1. Arrange
        Calculator calculator = new Calculator();
  
        // 2. Act
        Float result = calculator.divide(2, 0);
      });
  
      // 3. Assert
      assertThat(thrown)
          .isInstanceOf(ArithmeticException.class)
          .hasMessageContaining("/ by zero");
    }

    @Test
    public void gegevenGetal1Is4EnGetal2Is5_danMoet20() {
      // 1. Arrange
      Calculator calculator = new Calculator();
  
      // 2. Act
      Float result = calculator.product(4, 5);
      System.out.println(result);
  
      // 3. Assert
      assertThat(result).isEqualTo(20);
    }
    @Test
    public void wortelVan25_Verwacht5() {
      // 1. Arrange
      Calculator calculator = new Calculator();
  
      // 2. Act
      Float result = calculator.vierkantswortel(25);
      System.out.println(result);
  
      // 3. Assert
      assertThat(result).isEqualTo(5);
    }
    @Test
    public void wortelVanmin25_verwachtEXCEPTION() {
      // when
      Throwable thrown = catchThrowable(() -> {
        // 1. Arrange
        Calculator calculator = new Calculator();
  
        // 2. Act
        Float result = calculator.vierkantswortel(-25);
      });
  
      // 3. Assert
      assertThat(thrown)
          .isInstanceOf(ArithmeticException.class)
          .hasMessageContaining("geen wortel van neg getal!!!!!!!!! dombo");
    }
  }
  