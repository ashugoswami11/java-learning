//example to show how call by reference work with a tricky question

public class method{
    static void change(int [] arr) //simple method which change the first element of an array
    {
        arr[0] = 666;
    }

    public static void main(String[] args) {
        int[] arr = {23,45,65,68,54,43}; //here we we create array's values it create object of array  and word "arr" holds the address where these values are stored
        change(arr);

        System.out.printf("%d", arr[0]);
    }
}