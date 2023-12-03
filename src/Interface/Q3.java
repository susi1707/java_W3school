package Interface;


interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}
class Airplane implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}
class Helicopter implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}

public class Q3 {
    public static void main(String[] args) {
/*Flyable airplane = new Airplane();
Flyable spaceCraft = new Spacecraft();
Flyable helicopter = new Helicopter();
        airplane.fly_obj();
        spaceCraft.fly_obj();
        helicopter.fly_obj();*/

        Flyable[] flyables = {new Airplane(),new Spacecraft(),new Helicopter()} ;
        for (Flyable res: flyables             ) {
            res.fly_obj();
        }
    }
}
