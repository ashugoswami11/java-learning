class phone {
    public void greet() {
        System.out.println("good morning");
    }

    public void on() {
        System.out.println("turning on phone");
    }
}

class smartphone extends phone {
    public void music(){
        System.out.println("playin music");
    }

    public void on() {
        System.out.println("turning on smartphone");
    }
}

public class dynamicdispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone smart = new smartphone();

        phone obj = new smartphone(); // reference to base class and object of child class
        // obj.welcome();
        obj.on(); // object method will run not reference
        obj.music();  // no this is not allowed

    }
}