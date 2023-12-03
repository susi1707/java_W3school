package Abstract;

abstract class Animall {
    abstract void sound();
}
class Lion extends Animall{

    @Override
    void sound() {
        System.out.println("roar");
    }
}
class Tiger extends Animall{

    @Override
    void sound() {
        System.out.println("Growls");
    }
}

public class Q1Animal {
    public static void main(String[] args) {
Animall lion = new Lion();
        Animall tiger = new Tiger();
lion.sound();
tiger.sound();
    }
}
