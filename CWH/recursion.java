//this function is to print factorial of a number with recursion or iterative approach
import java.util.Scanner;
public class recursion {
    static int fac_iterative(int n){
        int result = 1;
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            for(int i =1; i<=n;i++){
                result = result * i; // at every iteration value of result and i both update by mistake i wrote result = i*n = which will gonna give 25 for fact 5
            }
            return result;
        }
    }

    static int recursive_fact(int n){
        if (n==0 || n==1) {
            return 1;
        }
        else{
            return n * recursive_fact(n-1);  // it calls the function with the value of n it hold for the last number (it forms a loop)  
            //the proper exit plan here is n-1 when n was 5 in first recursion then onwards it start decreasing by one until it won't reach one and hit the exit condition which is n==1 or n==0
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("which approach you want to use press 1 for iterative and 2 for recursive");
        int choice = sc.nextInt();
        
        System.out.println("enter a number of which factorial you want to print");
        int num = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.printf(" by iterative approach the factorial of %d is %d\n" , num, fac_iterative(num));
                break;
        
            case 2:
            System.out.printf(" by recursive approach the factorial of %d is %d\n" , num, recursive_fact(num));
                break;

            default:
            System.out.println("you entered something wrong");    
        }

    }

}
