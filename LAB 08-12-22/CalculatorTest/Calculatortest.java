package testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import testclasses.Calculator;


class Calculatortest {
	
	Calculator mycal=new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(8,mycal.add(2, 6));
    }
    
    @Test
    public void testsubtract() {
        assertEquals(2,mycal.subtract(4,2));
    }
    
    @Test
    public void testmultiply() {
        assertEquals(15,mycal.multiply(3, 5));
    }
    
    @Test
    public void testdivide() {
        assertEquals(0,mycal.divide(4, 0));
        assertEquals(2,mycal.divide(4, 2));
    }
}



