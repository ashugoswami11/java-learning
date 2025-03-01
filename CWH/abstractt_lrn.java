interface bike {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class splendor implements bike{
    int speed = 100;;
    public void applyBrake(int decrement){
        System.out.println("applying brake");
        System.out.println(speed = speed-decrement);
    }

    public void speedUp(int increment){
        System.out.println("full throttle ");
        System.out.println(speed = speed+increment);
    }
}

abstract class parent2{
    //constructor is important
    public parent2(){
        System.out.println("i am a parent class constructor");
    }
        abstract public void greet();
    
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

class child3 extends parent2{

    public void show(){
        System.out.println("hello ");
    }

    @Override
    public void greet(){
        System.out.println("good evening");
    }
}

public class abstractt_lrn {
    public static void main(String[] args) {
        child2 c2 = new child2();
    }
}
