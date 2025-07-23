import com.linkedin.app.Calculator;


public class CalculatorTest {

  Calculator c= new Calculator();



  @Test
  public void addtest(){

    int result= c.add(1, 4);


    AssertEquals(5, result);
  }


}
