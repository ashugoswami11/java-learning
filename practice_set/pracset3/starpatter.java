public class starpatter {
    static void printstar(int n) {
        for (int i = n; i > 0; i--) {
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printstar(6);
    }
}
