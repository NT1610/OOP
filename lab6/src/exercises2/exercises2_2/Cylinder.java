package exercises2.exercises2_2;

public class Cylinder extends Circle{
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    public double getArea() {
        return 2 * Math.PI * base.getArea() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of" + super.toString() + "height=" + height;
    }
}
