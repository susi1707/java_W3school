package DesginPattern.Creational;



interface OS{
    public void os();
}

class andriod implements OS {

    public void os() {
        System.out.println("Powers full OS");
    }
}

class Ios implements OS {

    public void os() {
        System.out.println("CLosed OS");
    }
}
class Windows implements OS {

    public void os() {
        System.out.println("diee..........");
    }
}

class osFactoryPattern {

    public static OS getInstance (String os){
        if(os.equals("android")){
            return new andriod();
        } else if (os.equals("ios")) {
            return new Ios();
        }else{
            return new Windows();
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
//        OS phoneOs = new andriod();  // here we need to avoid tight couple creational object
//        phoneOs.os();

        OS androidOs = osFactoryPattern.getInstance("android");
        androidOs.os();

        OS windowsOs = osFactoryPattern.getInstance("windows");
        windowsOs.os();


    }
}
