
    
class mynewthr extends Thread{
   
    public void run(){
        for(int i=1;i<=30; i++){
            System.out.println("i am a thread"+i);
            try {
                
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
    
            }
        }
    }
}

class mynewthr1 extends Thread{
   
    public void run(){
        for(int i=30;i>=1; i--){
            System.out.println("i am a reaper"+i);
        }
    }
}

public class meth {
    public static void main(String[] args) {
        mynewthr t1 = new mynewthr();
        mynewthr1 t2 = new mynewthr1();
        t1.start();

        // try {
        //     t1.join();
        // }
        //  catch (Exception e) {
        //     System.out.println(e);
        // }

        t2.start();
        
    }
}


