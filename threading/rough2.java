class MyThread2 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("extend class value of i is %d "+i);
        }
    }
}

class MyThread3 implements Runnable{
    public void run(){
        for(int i=10; i>=1; i--){
            System.out.println("second class i is %d "+i);
        }
    }
}

public class rough2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        Thread thread = new Thread(t1);

        MyThread3 t2 = new MyThread3();
        Thread thread2 = new Thread(t2);
        thread.start();
        thread2.start();       
    }
}
