//create a class abstract with methods write() and refill() as abstract methods
//use pen class from question 1 to create a concrete class fountain pen with additional method changenib()


abstract class pen1{
    public abstract void write();
    public abstract void refill();

}

//this is a concrete class because all methods are instanciated and it is derived from parent class pen and has an additional method changenib
class fountain_pen extends pen1{
    public void write(){
        System.out.println("pen starts writing");
    }

    public void refill(){
        System.out.println("refilling this pen");
    }

    public void changenib(){
        System.out.println("changing the nib");
    }
}


// class pen_derived extends pen1{
//     public void write(){
//         System.out.println("pen starts writing");
//     }

//     public void refill(){
//         System.out.println("refilling this pen");
//     }
// }


public class pen{
    public static void main(String[] args) {
        fountain_pen p = new fountain_pen();

        p.write();
        p.refill();
        p.changenib();
    }
}