package be.ses;

public class Doubler {

  public float doubleCalculator(Calculator calculator, String operation, float x, float y) {
    if (operation == "divide") {
      return calculator.divide(x, y) * 2;
    } 
    else if (operation == "product") {
        return calculator.product(x, y) * 2;
      } else {
        throw new UnsupportedOperationException("Wrong calculator operation selected");
      }
    } 
} 

