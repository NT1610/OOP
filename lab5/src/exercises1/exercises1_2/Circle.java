package exercises1.exercises1_2;

public class Circle {
    private double radius = 1.0;


    public Circle() {
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {

        return radius;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Setter for instance variable color
    public double getArea() {

        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
