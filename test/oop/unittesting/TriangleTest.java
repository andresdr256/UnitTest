package oop.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void givenEvenBaseAndHeight_whenGetArea_thenValidAreaIsReturned(){
        //Given:
        Triangle triangle = new Triangle();
        triangle.setBase(2);
        triangle.setHeight(6);

        //When:
        double area = triangle.getArea();

        //Then:
        assertEquals("Area for triangle is not valid", 6, area, 0);
    }

    @Test
    public void givenOddBaseAndHeight_whenGetArea_thenValidAreaIsReturned(){
        //Given:
        Triangle triangle = new Triangle();
        triangle.setBase(3);
        triangle.setHeight(5);

        //When:
        double area = triangle.getArea();

        //Then:
        assertEquals("Area for triangle is not valid", 7.5, area, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeBase_whenGetSetBase_thenErrorIllegalArgumentExceptionsIsThrown(){
        //Given:
        Triangle triangle = new Triangle();

        //When:
        triangle.setBase(-3);

        //Then: Exception was thrown
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeBase_whenGetSetHeight_thenErrorIllegalArgumentExceptionsIsThrown(){
        //Given:
        Triangle triangle = new Triangle();

        //When:
        triangle.setHeight(-3);

        //Then: Exception was thrown
    }
}
