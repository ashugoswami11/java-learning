import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a year to check whether it is leap or not");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year%400 == 0))
        {
            System.out.println("yes this is a leap year !");
        }
        else{
            System.out.println("no this is not a leap year");
        }
    }
    
}
