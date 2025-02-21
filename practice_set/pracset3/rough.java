public class rough {
    static int recursive_sum(int n){
        if (n == 1) {
            return 1;
        }
        else{
            return n + recursive_sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("sum of no.5 is"+recursive_sum(3
        ));
    }
}
