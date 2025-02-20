//program to reverse an array 

public class arr_rev {
    public static void main(String[] args){
        System.out.println("reversing the array");

        int[] arr = {1,2,3,4,5};
        int l = arr.length;

        //because the loop only run for the half size of an array and half size is calculated by the floor division
        int n = Math.floorDiv(l,2); //here we are doing floor division
        int temp;

        for(int i =0; i<n; i++) // here i wrote i<n "n" is half of the array and i want to run the loop till half 
        {
            temp = arr[i];
            arr[i] = arr[l-1-i];  //here we write length-1 because length starts from 0 and mention -i because we've to reduce last element of array by one
            arr[l-1-i] = temp;
        }

        for(int element:arr){
            System.out.print(element);
            System.out.print(" ");
        }



    }
}
