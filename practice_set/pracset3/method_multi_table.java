import java.util.Scanner;

public class method_multi_table {
    static void multiplication_table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of which multiplication table you want to print");
        int num = sc.nextInt();

        multiplication_table(num);

    }
}
