
public class arr {
    public static void main(String[] args) {
        // System.out.println("all about arrays");

        // int[] arr = {34,23,67,778,99,54,87};

        // int[] arr2 = new int[5];
        // arr2[0] = 44;
        // arr2[1] = 76;

        // System.out.println(arr2[1]);
        // System.out.println(arr.length);

        // String[] names ={"ashu", "goswami" };

        // //printing the array with the help of iteration
        // // for(int i=0; i<arr.length;i++){
        // //     System.out.printf("array element no. %d is %d\n", i+1, arr[i]);
        // // }
        
        // System.out.println("printing the array elements by new method");

        // for(int nums: arr){        //simple and straightforward way to print the array elements 
        //     System.out.println(nums);
        // }

        System.out.println("printing array of 2-D");

        int[][] flats = new int[2][3]; //declare and memory allocation

        //initialization 
        flats[0][0] = 56;
        flats[0][1] = 77;
        flats[0][2] = 98;
        flats[1][0] = 77;
        flats[1][1] = 62;
        flats[1][2] = 34;

        System.out.println("printing a 2-d array using a for loop");

        for(int i =0;i<flats.length ;i++){
            for(int j =0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");

        }


    }
}