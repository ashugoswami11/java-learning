// package practice_set.pracset8;

class mythr4 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("good morning");
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class mythr5 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class gm_wlc {
    public static void main(String[] args) {
        mythr4 p1 = new mythr4();
        mythr5 p2 = new mythr5();
        p1.setPriority(1);
        p2.setPriority(10);

        p1.start();
        p2.start();
    }
}
