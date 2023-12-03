package OOPs;

import java.time.LocalDateTime;
import java.time.LocalTime;

//Write a Java program to create a class called "Airplane" with a flight number, destination,
// and departure time attributes, and methods to check flight status and delay
class Airplane{
    String flightNumber;
    String destination;
    LocalTime departure;
    int delays = 0;

    public Airplane(String flightNumber, String destination, LocalTime departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
    }
    void checkStatus(){
        if(delays > 0){
            System.out.println("Flight "+ this.flightNumber+ "is delayed by "+ delays+ "minutes");
        }
        else{
        System.out.println("Flight "+ this.flightNumber+ "is on time");
    }}
    int delay(int delay){
        delays=delay;
        departure = this.departure.plusMinutes(delay);
        return delays;
    }
}

public class Airplane_check {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));
        System.out.println("Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        flight1.delay(40);
        flight2.delay(110);
        System.out.println("\nCurrent Flight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
    }
}
