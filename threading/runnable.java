
class MyThreadRunnnable implements Runnable{
    public void run(){
        System.out.println("i am a runnable thread");
    }   
}

class MyThreadRunnnable2 implements Runnable{
    public void run(){
        System.out.println("i am second runnable thread");
    }   
}

public class runnable {
    public static void main(String[] args) {
        MyThreadRunnnable bullet1 = new MyThreadRunnnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnnable2 bullet2 = new MyThreadRunnnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
