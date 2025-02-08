import java.util.Scanner;

public class literals {
    public static void main(String[] args){
        int age = 34;
        float num = 56.77f;
        double num2 = 56.77;
        // System.out.println(age);
        // System.out.println(num);
        // System.out.println(num2);
        //taking inputs in java 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();

        System.out.println(a+b);
    }
}
