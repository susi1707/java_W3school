package OOPs;

public class TrafficLight {
    String color;
    int duration;
TrafficLight(String color){
    this.color = color;
}

    void signal(TrafficLight colors) throws InterruptedException {
        if(this.color.equalsIgnoreCase("red")){
            System.out.println("Stop " + color);
            duration = 4000;
            Thread.sleep(duration);
            this.color = "green";
            System.out.println("u can go now " + color);

        }


    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight("red");
        try {
            tl.signal(tl);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
