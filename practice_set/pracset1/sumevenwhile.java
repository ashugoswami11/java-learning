public class sumevenwhile {

    public static void main(String[] args) {

        System.out.println("printing the sum of first n even numbers using while loop");
        int i = 0;
        int sumofeven = 0;
        while (i < 10) {
            System.out.printf("%d even number is: %d\n", i + 1, 2 * i);
            sumofeven = sumofeven + 2 * i;
            i++;
        }
        System.out.printf("sum of first 10 even numbers are %d", sumofeven);

    }

}
