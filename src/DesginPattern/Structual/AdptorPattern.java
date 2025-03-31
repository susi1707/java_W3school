package DesginPattern.Structual;

// Target Interface: Expected by the client
interface MobileCharger {
    void chargePhone();
}

// Adaptee: Old charging system (Micro-USB)
class OldCharger {
    void chargeWithMicroUSB() {
        System.out.println("Charging with Micro-USB charger...");
    }
}
// Adapter: Converts OldCharger to be compatible with MobileCharger
class ChargerAdapter implements MobileCharger {
    private OldCharger oldCharger;

    // Constructor Injection
    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargePhone() {
        oldCharger.chargeWithMicroUSB(); // Adapting the old method
    }
}
public class AdptorPattern {
    public static void main(String[] args) {
        // Old Charger (Adaptee)
        OldCharger oldCharger = new OldCharger();

        // Using Adapter to make it compatible
        MobileCharger charger = new ChargerAdapter(oldCharger);

        // Charging the phone using Adapter
        charger.chargePhone();
    }
}
