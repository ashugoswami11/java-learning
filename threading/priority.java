
class mythr1 extends Thread{
    public mythr1(String name){
        super(name); //it is calling the constructor of Thread class which take name as input
    }
    public void run(){
        int i = 22;
            System.out.println("this is thread " + this.getName());
        
    }
}

public class priority {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("alpha 1 least important");
        mythr1 t2 = new mythr1("beta 2");
        mythr1 t3 = new mythr1("gamma 3");
        mythr1 t4 = new mythr1("sigma 4");
        mythr1 t5 = new mythr1("delta 5 most important");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
