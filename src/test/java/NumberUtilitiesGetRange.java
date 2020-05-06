import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestWatcher;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilitiesGetRange implements TestWatcher {

   /**
    * @input: 3
    * @salida: "012"
    */
   @Test
   public void getRangeSmallTest1() {
      // : Given
      int stop = 3;
      String expected = "012";
      testOneArgument(expected, stop);
   }

   /**
    * @input: 14
    * @salida: "012345678910111213"
    */
   @Test
   public void getRangeMediumTest2() {
      // : Given
      int stop = 14;
      String expected = "012345678910111213";
      testOneArgument(expected, stop);
   }

   /**
    * @input (start): 3
    * @input (stop): 14
    * @salida: "012345678910111213"
    */
   @Test
   public void getRangeStartAtThreeTest3() {
      // : Given
      int start = 3;
      int stop = 14;
      String expected = "345678910111213";
      testTwoArguments(expected, start, stop);
   }

   /**
    * @input (start): 100
    * @input (stop): 105
    * @salida: "100101102103104"
    */
   @Test
   public void getRangeStartAt100Test4() {
      // : Given
      int start = 100;
      int stop = 105;
      String expected = "100101102103104";
      testTwoArguments(expected, start, stop);
   }

   /**
    * @input (start): 0
    * @input (stop): 15
    * @input (step): 1
    * @salida: "01234567891011121314"
    */
   @Test
   public void getRangeWithStepOneTest5() {
      // : Given
      int start = 0;
      int stop = 15;
      int step = 1;
      String expected = "01234567891011121314";
      testThreeArguments(expected, start, stop, step);
   }

   /**
    * @input (start): 0
    * @input (stop): 15
    * @input (step): 2
    * @salida: "02468101214"
    */
   @Test
   public void getRangeWithStepTwoTest6() {
      // : Given
      int start = 0;
      int stop = 15;
      int step = 2;
      String expected = "02468101214";
      testThreeArguments(expected, start, stop, step);
   }

   /**
    * @input (start): 5
    * @input (stop): 15
    * @input (step): 5
    * @salida: "510"
    */
   @Test
   public void getRangeWithStepFiveTest7() {
      // : Given
      int start = 5;
      int stop = 15;
      int step = 5;
      String expected = "510";
      testThreeArguments(expected, start, stop, step);
   }

   /**
    * @input (start): 4
    * @input (stop): 20
    * @salida: "4681012141618"
    */
   @Test
   public void getEvenNumbersStartAndEndAtEvenTest8() {
      // : Given
      int start = 4;
      int stop = 20;
      String expected = "4681012141618";
      testEvenNumbers(expected, start, stop);
   }

   /**
    * @input (start): 4
    * @input (stop): 20
    * @salida: "468101214161820"
    */
   @Test
   public void getEvenNumbersStartAndEndAtOddTest9() {
      // : Given
      int start = 4;
      int stop = 21;
      String expected = "468101214161820";
      testEvenNumbers(expected, start, stop);
   }

   /**
    * @input (start): 5
    * @input (stop): 21
    * @salida: "5791113151719"
    */
   @Test
   public void getOddNumbersStartAndEndAtOddTest10() {
      // : Given
      int start = 5;
      int stop = 21;
      String expected = "5791113151719";
      testOddNumbers(expected, start, stop);
   }

   /**
    * @input (start): 4
    * @input (stop): 14
    * @salida: "5791113"
    */
   @Test
   public void getOddNumbersStartAndEndAtEvenTest11() {
      // : Given
      int start = 4;
      int stop = 14;
      String expected = "5791113";
      testOddNumbers(expected, start, stop);
   }

   /**
    * @input (start): 4
    * @input (stop): 14
    * @salida: "916253649"
    */
   @Test
   public void getExponentiationNumbersForSquareTest12() {
      // : Given
      int start = 3;
      int stop = 17;
      int exponent = 2;
      String expected = "916253649";
      testExponentiationNumbers(expected, start, stop, exponent);
   }

   /**
    * @input (start): 0
    * @input (stop): 4
    * @salida: "0182764"
    */
   @Test
   public void getExponentiationNumbersForCubeTest13() {
      // : Given
      int start = 0;
      int stop = 4;
      int exponent = 3;
      String expected = "0182764";
      testExponentiationNumbers(expected, start, stop, exponent);
   }


   private void testExponentiationNumbers(String expected, int start, int stop, int exponent) {
      // : When
      String actual = NumberUtilities.getExponentiations(start, stop, exponent);

      // : Then
      assertEquals(expected, actual);
   }


   private void testOneArgument(String expected, int stop) {
      // : When
      String actual = NumberUtilities.getRange(stop);

      // : Then
      assertEquals(expected, actual);
   }
   private void testTwoArguments(String expected, int start, int stop) {
      // : When
      String actual = NumberUtilities.getRange(start, stop);

      // : Then
      assertEquals(expected, actual);
   }

   private void testThreeArguments(String expected, int start, int stop, int step) {
      // : When
      String actual = NumberUtilities.getRange(start, stop, step);

      // : Then
      assertEquals(expected, actual);
   }

   private void testEvenNumbers(String expected, int start, int stop) {
      // : When
      String actual = NumberUtilities.getEvenNumbers(start, stop);

      // : Then
      assertEquals(expected, actual);
   }

   private void testOddNumbers(String expected, int start, int stop) {
      // : When
      String actual = NumberUtilities.getOddNumbers(start, stop);

      // : Then
      assertEquals(expected, actual);
   }


}
