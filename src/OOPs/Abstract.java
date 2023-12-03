package OOPs;

import java.util.Scanner;

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

    class MotorCycle extends BiCycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am "+ define_me());

            String temp = define_me(); // Calls the define_me method of the superclass BiCycle

            System.out.println("My ancestor is a cycle who is "+ temp );
        }
    }
    public class Abstract {
        public static void main(String []args){
            MotorCycle M = new MotorCycle();
        }
    }

