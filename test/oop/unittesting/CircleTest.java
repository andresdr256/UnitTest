package oop.unittesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void givenValidRadio_whenGetArea_thenValidAreaIsReturned(){
        //Given:
        Circle circle = new Circle();
        circle.setRadio(10);

        //When:
        double area = circle.getArea();

        //Then:
        assertEquals("Area for circle is not valid", 314.15, area, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeRadio_whenSetRadio_thenIllegalArgumentExceptionWasThrown(){
        //Given:
        Circle circle = new Circle();

        //When:
        circle.setRadio(-10);

        //Then: IllegalArgumentException was thrown
    }

}
