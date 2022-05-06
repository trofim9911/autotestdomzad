import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }
    @Test
    public void minusNumerator() {
        Rational One = new Rational(3, -7);
        assertTrue("false", One.getDenominator() > 0);
        assertTrue("False",One.getNumerator() < 0);
    }

    @Test //Не вызывал отдельно метод для сокращения дроби, проверил это обычным озданием дроби
    public void FractoinRational() {
        Rational Two = new Rational(5, 10);
        assertTrue("False", Two.getNumerator() == 1);
        assertTrue("False", Two.getDenominator() == 2);
    }
    @Test
    public void testEquals(){
        Rational A = new Rational(2, 3);
        Rational B = new Rational(2, 3);
        assertTrue("False", A.equals(B));
    }
    @Test
    public void testNoEquals(){
        Rational A = new Rational(4, 3);
        Rational B = new Rational(2, 3);
        assertFalse("False", A.equals(B));
    }

    @Test
    public void testLess(){
        Rational A = new Rational(1, 3);
        Rational B = new Rational(6, 7);
        assertTrue("False", A.less(B));

    }
    @Test
    public void testPlus(){
        Rational A = new Rational(7, 15);
        Rational B = new Rational(-1, 5);
        Rational C = A.plus(B);
        assertEquals("False", 4, C.getNumerator());
        assertEquals("False", 15, C.getDenominator());
    }
    @Test
    public void testMinus(){
        Rational A = new Rational(7, 15);
        Rational B = new Rational(2, 5);
        Rational C = A.minus(B);
        assertEquals("False", 1, C.getNumerator());
        assertEquals("False", 15, C.getDenominator());
    }
    @Test
    public void testMultiply(){
        Rational A = new Rational(2, 5);
        Rational B = new Rational(3, 4);
        Rational C = A.multiply(B);
        assertEquals("False", 3, C.getNumerator());
        assertEquals("False", 10, C.getDenominator());
    }

    @Test
    public void testDivide(){
        Rational A = new Rational(3, 5);
        Rational B = new Rational(7, 8);
        Rational C = A.divide(B);
        assertEquals("False", 24, C.getNumerator());
        assertEquals("False", 35, C.getDenominator());
    }
}