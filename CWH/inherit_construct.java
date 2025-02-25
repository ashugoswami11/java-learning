class base1{
    int x;

    base1(){
        System.out.println("i am a constructor from base");
    }

    base1(int a){
        System.out.println("i am an overloaded constructor from base with value of a:"+a);
    }

}

class derived1 extends base1{
    int y;
    derived1(){
         // to call the overloaded constuctor form base
        System.out.println("i am a constructor from derived");
    }

    derived1(int a,int b){
        super(a);
        System.out.println("i am an overloaded constructor from derived with value of a and b:"+a);
    }

}


class childofderived extends derived1{

    int y;
    childofderived(){
         // to call the overloaded constuctor form base
        System.out.println("i am a constructor from chiildofderived");
    }

    childofderived(int a,int b,int c){
        super(a,b);
        System.out.println("i am an overloaded constructor from childofderived with value of a b and c:"+a+b+c);
    }

}



public class inherit_construct{
    public static void main(String[] args){
        // base1 b = new base1();
        // derived1 d = new derived1(14,5); // it will automatically only call the first constructor from base and construtor from derived
        childofderived d1 = new childofderived(14,5,8); // it will automatically only call the first constructor from base and construtor from derived
    }
}