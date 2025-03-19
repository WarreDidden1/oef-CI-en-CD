package be.ses;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DoublerTest {
  @Test
  public void gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4() {
    //arrange
    Calculator calculatorMock = mock(Calculator.class);
    when(calculatorMock.divide(2f, 1f)).thenReturn(2.0f);

    Doubler doubler = new Doubler();

    //act
    float result = doubler.doubleCalculator(calculatorMock, "divide", 2, 1);


    //assert
    assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
    verify(calculatorMock).divide(2f, 1f);
  }

  @Test
  public void gegevenOperationProductX2is5Y1is3_wanneerDoubleCalculator_danResultIs30() {
    //arrange
    Calculator calculatorMock = mock(Calculator.class);
    when(calculatorMock.product(5f, 3f)).thenReturn(15.0f);

    Doubler doubler = new Doubler();

    //act
    float result = doubler.doubleCalculator(calculatorMock, "product", 5, 3);


    //assert
    assertThat(result).isEqualTo(30f).withFailMessage("result was " + result + " but expected 30");
    verify(calculatorMock).product(5f, 3f);
  }
}