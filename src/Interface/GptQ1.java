package Interface;

interface Polygon{
    int numberOfSides();
    double perimeter();
}
class Triangle implements Polygon {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle implements Polygon{
int length;
int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int numberOfSides() {
        return 4;
    }

    @Override
    public double perimeter() {
        return 2*(length + width);
    }

}

public class GptQ1 {
    public static void main(String[] args) {
        Polygon rect = new Rectangle(2,3);
        Triangle tri = new Triangle(3,3,3);
        System.out.println(rect.numberOfSides());
        System.out.println(rect.perimeter());
        tri.numberOfSides();
        System.out.println(tri.perimeter());

    }
}
