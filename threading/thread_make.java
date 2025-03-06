
//create a thread class and extends the inbuilt thread
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("value of i is %d "+i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i = 10; i>=1; i--){
            System.out.println("value of i is %d "+i);
        }
    }
}
public class thread_make {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
    
}
