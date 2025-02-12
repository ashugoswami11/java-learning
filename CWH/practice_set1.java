import java.util.Scanner;

public class practice_set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of you hindi subject");
        double hindi = sc.nextInt();

        System.out.println("enter marks of you english subject");
        double english = sc.nextInt();

        System.out.println("enter marks of you maths subject");
        double maths = sc.nextInt();

    if (hindi<33 || english <33 || maths < 33) {
        System.out.println("you're failed");
    }
    else if ((hindi + english + maths)*100/300< 40) {
        System.out.println("you're failed");
    }
    else{
        System.out.printf("you're passed with the %.2f%%", (hindi + english + maths)*100/300 );
    }
    }

}
