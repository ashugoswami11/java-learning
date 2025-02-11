import java.util.Scanner;

class switchcase{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 25:
                System.out.println("you are allowed to drink"); 
                break;
            case 60:
                System.out.println("you are senior citizen"); 
                break;
            default:
                System.out.println("enjoy your life");

        }

    sc.close();
    }
}