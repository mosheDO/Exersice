public class Solution {

  public int solution(int number) {
    
    int sum = 0;
    if (number <= 0) {
      return sum;
    }

    for (int i = 0; i < number; i++) {
       if (isMultipleOfFive(i) || isMultipleOfThree(i)) {
         sum += i;
       }   
    }

    return sum;
  } 

  private boolean isMultipleOfThree(int number) {
    if (number % 3 == 0) {
      return true;
    }
    return false;
  }

  private boolean isMultipleOfFive(int number) {
    if (number % 5 == 0) {
      return true;
    }
    return false;
  }
}



import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
      assertEquals(0, new Solution().solution(-2));
      assertEquals(0, new Solution().solution(2));
      assertEquals(23, new Solution().solution(10));
      assertEquals(33, new Solution().solution(11));
      assertEquals(33, new Solution().solution(12));
      assertEquals(45, new Solution().solution(13));
      assertEquals(60, new Solution().solution(16));
    }
    
}
