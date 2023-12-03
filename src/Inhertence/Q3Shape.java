package Inhertence;

class Shape{
    double getArea(){
return 0;
    }
}
class Rectangle extends Shape{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getArea(){
        return a*b;
    }
}

public class Q3Shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 10.0);
         double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
