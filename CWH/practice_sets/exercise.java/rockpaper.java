import java.util.Scanner;
import java.util.Random;

public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to create an object of random class we do same like we did in the case of
        // scanner just parenthesis remains empty
        Random rand = new Random();
        int randnum = rand.nextInt(3) + 1;

        // taking input from the user

        int counter = 0;

        int computer_score = 0;
        int user_score = 0;

        while (counter < 5) {

            System.out.printf("\n<-------chances left are : %d --------->\n\n", 5 - counter);
            System.out.println("enter a number \n 1 for rock, \n 2 for paper \n 3 for scissor");
            int usernum = sc.nextInt();

            // int digit = randnum;
            System.out.printf("you chose %d and computer chose %d\n ", usernum, randnum);

            if (usernum == randnum) {
                System.out.println("it is a draw");
            }
            // here are only winning situations for the user
            else if ((randnum == 1 && usernum == 2) ||
                    (randnum == 2 && usernum == 3) ||
                    (randnum == 3 && usernum == 1)) {
                System.out.println("you win this round");
                user_score = user_score + 1;

            } else {
                computer_score = computer_score + 1;
                System.out.println("computer win this round\n");
            }

            counter++;
        }
        System.out.printf("your score is %d\n", user_score);
        System.out.printf("computer score is %d\n", computer_score);

        if (computer_score > user_score) {
            System.out.println("computer wins\n");
        } else if (user_score > computer_score) {
            System.out.println("you wins\n");
        } else {
            System.out.println("it is a draw");
        }

    sc.close();
    }
}
