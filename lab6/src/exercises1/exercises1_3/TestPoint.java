package exercises1.exercises1_3;

public class TestPoint {
    public static void main(String[] args) {
        Point3D point1 = new Point3D(3, 4, 5 / 3);
        System.out.println("(" + point1.getX() + "," + point1.getY() + point1.getZ() + ")");
        Point3D point2 = new Point3D(3 / 4, 7, 3);
        System.out.print("(");
        for (float i : point2.getXYZ()) {
            System.out.print(i + ",");
        }
        System.out.print(")");
    }
}
