import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        // advance switch case
        switch (num) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");

        }
    }
}
