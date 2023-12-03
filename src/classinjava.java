
import java.util.Scanner;
 class classijava {
     String name;
     String Email;

     public void info() {
         System.out.println(this.name);
         System.out.println(this.Email);
     }

     classijava() {
     }

     classijava(classijava s2) {
         this.name = s2.name;
         this.Email = s2.Email;
     }
 }
    public class classinjava {

    public static void main(String[] args) {
        classijava i = new classijava();
        i.name="asd";
        i.Email="asd@djsfn";
        classijava i2 = new classijava(i);
        i2.info();
    }

}

