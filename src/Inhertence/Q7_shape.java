package Inhertence;

class Shapee{
    double radius;

    public Shapee(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    double getArea(){
        return radius*2;
    }
    double getPerimeter(){
        return 2+radius;
    }
}
class Cirlcee extends Shapee{

static final double pi = Math.PI;
    public Cirlcee(double radius) {
        super(radius);

    }
    double getArea(){
        return pi*radius*radius;
    }
    double getPerimeter(){
        return 2*pi*radius;
    }

}

public class Q7_shape {
    public static void main(String[] args) {
        double r = 8.0;
        Cirlcee c1 = new Cirlcee(r);
        System.out.println("Radius of the circle="+r);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());
        r = 3.2;
        Cirlcee c2 = new Cirlcee(r);
        System.out.println("\nRadius of the circle="+r);
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());
    }
    }

