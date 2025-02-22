// package practice_set.pracset4;
class cellphone1 {
    public void ringing() {
        System.out.println("ringing");
    }

    public void vibrating() {
        System.out.println("vibrating");
    }

}


public class cellphone {
    public static void main(String[] args) {
        cellphone1 call = new cellphone1();

        call.vibrating();
        call.ringing();
    }

}