package be.ses;
import static java.lang.Math.sqrt;
//import javax.naming.OperationNotSupportedException;

public class Calculator {
    public float divide(float teller, float noemer) {
        if (noemer == 0) {
          throw new ArithmeticException("/ by zero");
        }
        return teller / noemer;
      }
      public float product(float getal1, float getal2) {
        return getal1 * getal2;
      }
      public float vierkantswortel(float getal) {
        if (getal <0) {
          throw new ArithmeticException("geen wortel van neg getal!!!!!!!!! dombo");
        }
        return (float) sqrt(getal);
    }
}
