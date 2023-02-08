import java.math.BigDecimal;
import java.math.RoundingMode;

public class Shape {

    static class Sphere extends Shape {
        double radius;

        Sphere(double radius) {
            Shape.checkInput(radius);
            this.radius = radius;
        }

        double calculateVolume() {
            //Volume of a Sphere = (4 divided 3) multiplied by Pi radius cubed
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            BigDecimal bd = new BigDecimal(volume).setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }

        public double getSphereVolume() {
            return calculateVolume();
        }
    }

    static class Cube extends Shape {
        double sideLength;

        Cube(double sideLength) {
            Shape.checkInput(sideLength);
            this.sideLength = sideLength;
        }

        double calculateVolume() {
            //Volume of a Cube = length of side cubed
            double volume = Math.pow(sideLength, 3);
            //Set to 2 Decimal Places
            BigDecimal bd = new BigDecimal(volume).setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }

        public double getCubeVolume() {
            return calculateVolume();
        }
    }

    static class Tetrahedron extends Shape {
        double edgeLength;

        Tetrahedron(double edgeLength) {
            Shape.checkInput(edgeLength);
            this.edgeLength = edgeLength;
        }

        double calculateVolume() {
            //Volume of a Tetrahedron = length of side cubed divided by 6 times the square root of 2
            double volume = (Math.sqrt(2) / 12) * Math.pow(edgeLength, 3);
            //Set to 2 Decimal Places
            BigDecimal bd = new BigDecimal(volume).setScale(2, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }

        public double getTetrahedronVolume() {
            return calculateVolume();
        }
    }

    private static void checkInput(double input)
    {
        if(input <= 0 )
        {
            throw new IllegalArgumentException("Invalid Input Value: " + input);
        }
        
        if (input == Double.MAX_VALUE )
        {
            throw new NumberFormatException("Input Value Exceeds Limits: " + NumberFormatException.class.getSimpleName());
        }

    }

}