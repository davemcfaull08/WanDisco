import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VolumeCalculatorTests {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void sphereRadius1Test() {
        Shape.Sphere sphere = new Shape.Sphere(1);
        Assert.assertEquals(4.19, sphere.getSphereVolume(), 0);
    }

    @Test
    public void sphereRadius5Test() {
        Shape.Sphere sphere = new Shape.Sphere(5);
        Assert.assertEquals(523.6, sphere.getSphereVolume(), 0);
    }

    @Test
    public void sphereRadiusDoubleTest() {
        Shape.Sphere sphere = new Shape.Sphere(12.4);
        Assert.assertEquals(7986.45, sphere.getSphereVolume(), 0);
    }

    @Test
    public void sphereRadiusGreaterThan2DPTest() {
        Shape.Sphere sphere = new Shape.Sphere(0.95555);
        Assert.assertEquals(3.65, sphere.getSphereVolume(), 0);
    }

    @Test
    public void cubeWidth1Test() {
        Shape.Cube cube = new Shape.Cube(1);
        Assert.assertEquals(1, cube.getCubeVolume(), 0);
    }

    @Test
    public void cubeWidth5Test() {
        Shape.Cube cube = new Shape.Cube(5);
        Assert.assertEquals(125, cube.getCubeVolume(), 0);
    }

    @Test
    public void cubeWidthDoubleTest() {
        Shape.Cube cube = new Shape.Cube(9.3);
        Assert.assertEquals(804.36, cube.getCubeVolume(), 0);
    }

    @Test
    public void cubeWidthGreaterThan2DPTest() {
        Shape.Cube cube = new Shape.Cube(4.888);
        Assert.assertEquals(116.79, cube.getCubeVolume(), 0);
    }

    @Test
    public void tetrahedronEdgeLength1Test() {
        Shape.Tetrahedron tetrahedron = new Shape.Tetrahedron(1);
        Assert.assertEquals(0.12, tetrahedron.getTetrahedronVolume(), 0);
    }

    @Test
    public void tetrahedronEdgeLength5Test() {
        Shape.Tetrahedron tetrahedron = new Shape.Tetrahedron(5);
        Assert.assertEquals(14.73, tetrahedron.getTetrahedronVolume(), 0);
    }

    @Test
    public void tetrahedronEdgeLengthDoubleTest() {
        Shape.Tetrahedron tetrahedron = new Shape.Tetrahedron(2.9);
        Assert.assertEquals(2.87, tetrahedron.getTetrahedronVolume(), 0);
    }

    @Test
    public void tetrahedronEdgeLengthGreaterThan2DPTest() {
        Shape.Tetrahedron tetrahedron = new Shape.Tetrahedron(6.777777);
        Assert.assertEquals(36.69, tetrahedron.getTetrahedronVolume(), 0);
    }

    @Test
    public void tetrahedronEdgeLengthMaxDoubleTest() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("Input Value Exceeds Limits: NumberFormatException");

        new Shape.Tetrahedron(Double.MAX_VALUE);
    }

    @Test
    public void zeroInputValueTest() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Invalid Input Value: 0.0");

        new Shape.Tetrahedron(0);
    }

    @Test
    public void negativeInputValueTest() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Invalid Input Value: -10.0");

        new Shape.Tetrahedron(-10);
    }

}