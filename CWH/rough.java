import java.util.Scanner;
public class rough {
    public static void main(String[]args){
        System.out.println("welcome to the java program");

        //practice of taking input from the user 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        int a = sc.nextInt();

        System.out.println("enter number two");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("sum of first and second number is"+sum);


    }
}
