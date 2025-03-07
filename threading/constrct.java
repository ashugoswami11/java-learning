
class mythr extends Thread{
    public mythr(String name){
        super(name); //it is calling the constructor of Thread class which take name as input
    }
    public void run(){
        for(int i=1;i<3; i++){
            System.out.println("i am a thread");
        }
    }
}
public class constrct {
    public static void main(String[] args) {
        mythr t1 = new mythr("local");
        t1.start();
        System.out.println("the name of the thread t is "+ t1.getName());
    }
}
