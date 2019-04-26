package shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ///Given
        Shape circle = new Circle(100);
        Shape square = new Square(100);
        Shape triangle = new Triangle(100, 20);
        ShapeCollector shapeCollector = new ShapeCollector();

        ///When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        ///Then
        Assert.assertEquals(3, shapeCollector.getFiguresQuantity());
    }


    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(100, 30);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0, shapeCollector.getList().size());
    }

    @Test
        public void testRemoveFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(100, 30);
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, shapeCollector.getList().size());
        }


        @Test
        public void testGetFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(20);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assert.assertEquals(circle, retrievedShape);
        }

        @Test
        public void testGetFigureNotExisting () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(20);

            //When
            Shape retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assert.assertNull(retrievedShape);
        }

        @Test
        public void testGetFigureNegativeIndex () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(20);

            //When
            Shape retrievedShape = shapeCollector.getFigure(-1);

            //Then
            Assert.assertNull(retrievedShape);
        }

        @Test
        public void testGetFigureUnavailableIndex () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(20);

            //When
        Shape retrievedShape = shapeCollector.getFigure(1);

            //Then
            Assert.assertNull(retrievedShape);
        }

        @Test
        public void testShowFigure(Object shapeName) {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(20);
            shapeCollector.addFigure(circle);

            //When
            shapeName = circle.getShapeName();
            //Then
            Assert.assertEquals(shapeName, "This is circle");
        }


        @Test
        public void testShowFigureNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(100);

            //When
            Object shapeName = circle.getShapeName();
            //Then
            Assert.assertNull(shapeName);
        }

    }




