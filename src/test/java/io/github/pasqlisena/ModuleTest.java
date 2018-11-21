package io.github.pasqlisena;

import org.junit.Assert;
import org.junit.Test;

public class ModuleTest {

  @Test
  public void toNumerical() {
    Assert.assertEquals(16, RomanConverter.toNumerical("XVI"));
    Assert.assertEquals(14, RomanConverter.toNumerical("XIV"));
  }

  @Test
  public void isRoman() {
    Assert.assertTrue(RomanConverter.isRoman("XVI"));
    Assert.assertFalse(RomanConverter.isRoman("XPA"));
  }


  @Test
  public void toRoman() {
    Assert.assertEquals("XVI", RomanConverter.toRoman(16));
    Assert.assertEquals("XIV", RomanConverter.toRoman(14));
  }

  @Test(expected = NumberFormatException.class)
  public void toRomanException() {
    RomanConverter.toNumerical("Hello World");
  }


}
