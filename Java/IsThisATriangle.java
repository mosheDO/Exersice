class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    if(isTwoSidesGreaterThenThired(a, b, c) &&
    isTwoSidesGreaterThenThired(a, c, b) &&
    isTwoSidesGreaterThenThired(b, c, a))
        return true;
    return false;
    
  }

  private static boolean isTwoSidesGreaterThenThired(int firstSide, int secondSide, int thirdSide) {
      int sumOfTwoSides = firstSide + secondSide;
      if(sumOfTwoSides > thirdSide)
        return true;

    return false;
  }
}

import static org.junit.Assert.*;
import org.junit.Test;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(true, TriangleTester.isTriangle(1,2,2));
        assertEquals(false, TriangleTester.isTriangle(7,2,2));
    }
}
