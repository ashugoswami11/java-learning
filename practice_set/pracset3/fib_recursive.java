public class fib_recursive {
    static int fib(int n){
        if((n==2)||(n==1)){ 
            return 1;
        }else{
            return fib(n-2)+ fib(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(34));
    }
}
