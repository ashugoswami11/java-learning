import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name = sc.nextLine();

        System.out.println("enter your  maths marks");
        int maths = sc.nextInt();
        System.out.println("enter your  hindi marks");
        int hindi = sc.nextInt();
        System.out.println("enter your  english marks");
        int english = sc.nextInt();
        System.out.println("enter your  science marks");
        int science = sc.nextInt();
        System.out.println("enter your  social science marks");
        int social = sc.nextInt();

        if ((maths > 100 || maths < 0) ||
                (hindi > 100 || hindi < 0) ||
                (english > 100 || english < 0) ||
                (science > 100 || science < 0) ||
                (social > 100 || social < 0)) {
            System.out.println("please enter valid marks out of 100");

        } else {
            double percent = (maths + hindi + english + science + social) / 500.0 * 100;
            System.out.println("heyy " + name + " your total percentage in the boards exam is " + percent);
        }

    }

}
