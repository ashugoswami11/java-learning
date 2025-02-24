//in this program we have to create a game with oops and it functions are it generates a random number and ask a user to 
//to input a number and check if they are similar or not if number varies it alert the user it is greater or smaller and user 
//keep on guess until both number are match and return the user his score in how many turns user successfully found the correct number
import java.util.Random;
import java.util.Scanner;

class randomfun {
    private int rand_num;
    private int counter;

    //constructor 
    public randomfun(){
        Random rand = new Random(); // obj for random utility class
        int random_num = rand.nextInt(100)+1;
        this.rand_num = random_num;
        this.counter = 0;
    }

    public void playrandom(){
        Scanner sc = new Scanner(System.in);
        int userinput;
        System.out.println("enter a number");
        
        while(true){

            userinput = sc.nextInt(); //get user input inside the loop

        if (userinput == rand_num) {
            System.out.println("you guess correct number you won");
            break;
        }
        else if(Math.abs(userinput - rand_num)<10){ // this method return only positive int to compare
            System.out.println("you are very close");
        }
        else if(userinput< rand_num){
            System.out.println("number you entered is smaller");
        }
        else{
            System.out.println("number you entered is greater");
        }
        counter++;
    }
    System.out.printf("you took %d turns to guess the correct number so your score is %d",counter,counter);
    sc.close();
    }

}
public class randomguess {
    public static void main(String[] args) {

        
        randomfun obj1 = new randomfun(); // instanciating an object for the class
        // obj1.randomfun(random_num);

        obj1.playrandom();
    }
}
