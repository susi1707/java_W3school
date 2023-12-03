package Inhertence;

class Animal{
    public String makeSound(){
        return "Making sound animal";
    }
}
class Cat extends Animal{
    public String makeSound(){
        return "Mewow";
    }
}
public class Q1Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        System.out.println(animal.makeSound());
        System.out.println(cat.makeSound());
    }
}
