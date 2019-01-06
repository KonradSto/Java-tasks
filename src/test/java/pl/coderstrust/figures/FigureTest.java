package pl.coderstrust.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void shouldReturnCorrectAreasForAllFigures(){
        double expectedArea = 0;
        double actualArea = 0;
        Figure square = new Square(4);
        expectedArea=16;
        actualArea=square.calculateArea();
        assertEquals(actualArea,expectedArea, 0.001);

        Figure rectangle = new Rectangle(4, 5);
        expectedArea=20;
        actualArea=rectangle.calculateArea();
        assertEquals(actualArea,expectedArea, 0.001);

        Figure circle = new Circle(6);
        expectedArea=113.097;
        actualArea=circle.calculateArea();
        assertEquals(actualArea,expectedArea, 0.001);

        Figure triangle = new Triangle(4,6);
        expectedArea=12;
        actualArea=triangle.calculateArea();
        assertEquals(actualArea,expectedArea, 0.001);

        Figure trapezoid = new Trapezoid(4,6,3);
        expectedArea=15;
        actualArea=trapezoid.calculateArea();
        assertEquals(actualArea,expectedArea, 0.001);
    }
}
