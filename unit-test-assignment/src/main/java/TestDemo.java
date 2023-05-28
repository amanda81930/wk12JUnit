import java.util.Random;


/**
 * @author Amanda
 *
 */
public class TestDemo {

  
  /**
   * This method adds two integers together.
   * @param a
   * @param b
   * @return sum
   */
  public int addPositive(int a, int b) {
    if(a > 0 && b > 0 ) {
      int sum = a + b;
      System.out.println(sum);
      return sum;
    } else {
      throw new IllegalArgumentException("Both parameters must be positive!");
    }
  } //end of addPositive METHOD
  
  
  /**
   * This method grabs a random integer between 1 and 10.
   * @return random
   */
  int getRandomInt() {
    Random random = new Random();
    return random.nextInt(10) + 1;
  } //end of getRandomInt METHOD
 
  
  /**
   * This method squares the random integer from getRandomInt Method above
   * @return randomNumberSquared
   */
  public int randomNumberSquared() {
    int randomNumber = getRandomInt();
    int randomNumberSquared = randomNumber * randomNumber;
    
    return randomNumberSquared;
  } //end of randomNumberSquared METHOD

} //end TestDemo CLASS
