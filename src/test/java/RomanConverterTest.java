import org.junit.Test;

import static org.junit.Assert.*;

public class RomanConverterTest {

    private RomanConverter converter = new RomanConverter();

    @Test(expected = NullPointerException.class)
    public void testNullInput() {
        converter.convertRoman(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCharacters() {
        converter.convertRoman("A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyString() {
        converter.convertRoman("");
    }

    @Test
    public void testI() {
        assertEquals(1, converter.convertRoman("I"));
    }

    @Test
    public void testIII() {
        assertEquals(3, converter.convertRoman("III"));
    }

    @Test
    public void testIV() {
        assertEquals(4, converter.convertRoman("IV"));
    }

    @Test
    public void testV() {
        assertEquals(5, converter.convertRoman("V"));
    }

    @Test
    public void testVI() {
        assertEquals(6, converter.convertRoman("VI"));
    }

    @Test
    public void testVII() {
        assertEquals(7, converter.convertRoman("VII"));
    }

    @Test
    public void testIX() {
        assertEquals(9, converter.convertRoman("IX"));
    }

    @Test
    public void testX() {
        assertEquals(10, converter.convertRoman("X"));
    }

    @Test
    public void testXVIII() {
        assertEquals(18, converter.convertRoman("XVIII"));
    }

    @Test
    public void testXIX() {
        assertEquals(19, converter.convertRoman("XIX"));
    }

    @Test
    public void testXX() {
        assertEquals(20, converter.convertRoman("XX"));
    }
}
