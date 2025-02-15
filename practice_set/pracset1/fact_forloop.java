import java.util.Scanner;

public class fact_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to find it's factorial");
        int n = sc.nextInt();

        long factorial = 1;
        
        if (n<0||n==0) {
            System.out.println("factorial of zero or negative number is not possible");
        }
        else{
            for(int i = 1; i<=n; i++){
                factorial = factorial*i; 
            }
        }
        System.out.printf("factorial of %d = %d",n,factorial);
    }
}
