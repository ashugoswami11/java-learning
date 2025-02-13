import java.util.Scanner;
public class urlfinding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a website name to check it's url type");
        String arr = sc.nextLine();

        // In this program what i learned instead of making the code more complex i simply used the name.endsWith() function which i was ignoring first but this program is become easy by only n only adding the endsWith() String method
        if(arr.endsWith("org")){
            System.out.println("this is an organizational website");
        }
        else if(arr.endsWith("com")){
            System.out.println("this is a commercial website ");
        }
        else if(arr.endsWith("in")){
            System.out.println("this is an indian website ");
        }
        else if(arr.endsWith("uk")){
            System.out.println("this is an united kingdom website ");
        }

    }
    
}
