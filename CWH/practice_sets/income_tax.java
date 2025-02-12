
import java.util.Scanner;
public class income_tax {
    public static void main(String[] args){
        System.out.println("what is you income in lakhs write it like 2 , 3.5 ,9 ");

        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();

        float tax = 0;
        if(income <= 2.5){
            System.out.println("there is not tax on income below 2.5 lpa");
        }
        
        else if(income > 2.5 && income < 5){
            tax = tax + (income-2.5f)*0.05f;
            System.out.printf("your tax ammout is %.2f", tax*100000);
        }
        
        else if(income > 5 && income < 10){
            tax = tax + (income-2.5f)*.20f;
            System.out.printf("your tax ammout is %.2f", tax*100000);
        }
        
        else {
            tax = tax + (income-2.5f)*.30f;
            System.out.printf("your tax ammout is %.2f", tax*100000);
        }
    }
}


