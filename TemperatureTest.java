/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 *
 * Gabriel Petrella - 260376122
 * Assignment 3
 * ECSE 321 - Fall 2013
 * Tuesday, October 15, 2013
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.


  /***************** Tests for getUnit() ************************/
    @Test
    public void testGetUnitsCelsius(){
       System.out.println("Test if getUnits returns correct units for CELSIUS...");
       Temperature tmp = new Temperature(15, Temperature.Units.CELSIUS);
       assertTrue(tmp.getUnits() == Temperature.Units.CELSIUS);
    }

    @Test
    public void testGetUnitsKelvan(){
       System.out.println("Test if getUnits returns correct units for KELVIN...");
       Temperature tmp = new Temperature(15, Temperature.Units.KELVIN);
       assertTrue(tmp.getUnits() == Temperature.Units.KELVIN);
    }

    @Test
    public void testGetUnitsFahrenheit(){
       System.out.println("Test if getUnits returns correct units for FAHRENHEIT...");
       Temperature tmp = new Temperature(15, Temperature.Units.FAHRENHEIT);
       assertTrue(tmp.getUnits() == Temperature.Units.FAHRENHEIT);
    }

  /***************** Tests for getValue() ***********************/
  /* Picked different values to test range of potential values.
   * Most focus given to fahrenheit, since precision and rounding are 
   * more crucial in the calculation.
   */
    @Test
    public void testGetValueCelsius(){
       System.out.println("Test if getValue returns correct value in CELSIUS...");
       Temperature tmp = new Temperature(-30, Temperature.Units.CELSIUS);
       assertTrue(tmp.getValue() == -30);
    }

    @Test
    public void testGetValueKelvan(){
       System.out.println("Test if getValue returns correct value in KELVIN...");
       Temperature tmp = new Temperature(15.5, Temperature.Units.KELVIN);
       assertTrue(tmp.getValue() == 15.5);
    }

    @Test
    public void testGetValueFahrenheit(){
       System.out.println("Test if getValue returns correct value in FAHRENHEIT...");
       Temperature tmp = new Temperature(81.058347, Temperature.Units.FAHRENHEIT);
       assertTrue(tmp.getValue() == 81.058347);
    }

    @Test
    public void testGetValueFahrenheit2(){
       System.out.println("Test if getValue returns correct value in FAHRENHEIT (negative)...");
       Temperature tmp = new Temperature(-2.65, Temperature.Units.FAHRENHEIT);
       assertTrue(tmp.getValue() == -2.65);
    }

  /***************** Tests for changeUnits() **********************/
  //shows all 6 unit conversions
    @Test
    public void testChangeUnits(){
      Temperature tmp = new Temperature(15, Temperature.Units.CELSIUS);

      System.out.println("Test unit change from CELSIUS to KELVIN...");
      tmp.changeUnits(Temperature.Units.KELVIN);
      assertTrue(tmp.getUnits() == Temperature.Units.KELVIN);

      System.out.println("Test unit change from KELVIN to CELSIUS...");
      tmp.changeUnits(Temperature.Units.CELSIUS);
      assertTrue(tmp.getUnits() == Temperature.Units.CELSIUS);

      System.out.println("Test unit change from CELSIUS to FAHRENHEIT...");
      tmp.changeUnits(Temperature.Units.FAHRENHEIT);
      assertTrue(tmp.getUnits() == Temperature.Units.FAHRENHEIT);

      System.out.println("Test unit change from FAHRENHEIT to KELVIN...");
      tmp.changeUnits(Temperature.Units.KELVIN);
      assertTrue(tmp.getUnits() == Temperature.Units.KELVIN);

      System.out.println("Test unit change from KELVIN to FAHRENHEIT...");
      tmp.changeUnits(Temperature.Units.FAHRENHEIT);
      assertTrue(tmp.getUnits() == Temperature.Units.FAHRENHEIT);

      System.out.println("Test unit change from KELVIN to CELSIUS...");
      tmp.changeUnits(Temperature.Units.CELSIUS);
      assertTrue(tmp.getUnits() == Temperature.Units.CELSIUS);
    }

}
