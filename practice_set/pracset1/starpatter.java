
public class starpatter {

    public static void main(String[] args) {
        for(int i=4; i>0; i--){
            // System.out.println("*");
            for(int j=4; j>i-1; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
