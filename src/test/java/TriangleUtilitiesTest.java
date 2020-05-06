import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleUtilitiesTest {

   @Test
   public void testGetRow_ForSmallWidth() {
      //Given
      String expected = "*";
      int width = 1;

      //When
      String actual = TriangleUtilities.getRow(width);

      //Then
      assertEquals(expected, actual);
   }

   @Test
   public void testGetRow_ForBigWidth() {
      //Given
      String expected = "********************";
      int width = 20;

      //When
      String actual = TriangleUtilities.getRow(width);

      //Then
      assertEquals(expected, actual);
   }

   @Test
   public void testGetTriangle_ForOneRow() {
      // Given
      String expected = "*\n";

      // When
      String actual = TriangleUtilities.getTriangle(1);

      // Then
      assertEquals(expected, actual);
   }

   @Test
   public void testGetTriangle_ForSmallTriangle() {
      // Given
      String expected =
            "*\n" +
            "**\n" +
            "***\n";

      // When
      String actual = TriangleUtilities.getTriangle(3);

      // Then
      assertEquals(expected, actual);
   }

   @Test
   public void testGetTriangle_ForBigTriangle() {
      String expected =
            "*\n" +
            "**\n" +
            "***\n" +
            "****\n" +
            "*****\n" +
            "******\n" +
            "*******\n" +
            "********\n" +
            "*********\n" +
            "**********\n";
      String actual = TriangleUtilities.getTriangle(10);
      assertEquals(expected, actual);
   }

   @Test
   public void testGetLargeTriangle() {
      String expected =
            "*\n" +
            "**\n" +
            "***\n" +
            "****\n" +
            "*****\n" +
            "******\n" +
            "*******\n" +
            "********\n" +
            "*********\n";
      String actual = TriangleUtilities.getLargeTriangle();
      assertEquals(expected, actual);
   }


   @Test
   public void testGetSmallTriangle() {
      String expected =
            "*\n" +
            "**\n" +
            "***\n" +
            "****\n";
      String actual = TriangleUtilities.getSmallTriangle();
      assertEquals(expected, actual);
   }

}
