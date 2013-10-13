/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  @Test
  public void test_getUnits(){
     System.out.println("Test if getUnits returns correct units...");
     Temperature tmp = new Temperature(15, Temperature.Units.CELSIUS);
     assertTrue(tmp.getUnits() == Temperature.Units.CELSIUS);
  }

  @Test
  public void test_getValue(){
     System.out.println("Test if getValue returns correct value...");
     Temperature tmp = new Temperature(15.5, Temperature.Units.FAHRENHEIT);
     assertTrue(tmp.getValue() == 15.5);
  }


}
