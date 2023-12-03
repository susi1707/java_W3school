package OOPs;
class parent{
    void study(){
        System.out.println("Law");
    }
}
public class Inhertance extends parent {
Inhertance(){{
    super.study();
    System.out.println("Game Developer");

}

}
    public static void main(String[] args) {
        Inhertance child1 = new Inhertance();


    }
}
