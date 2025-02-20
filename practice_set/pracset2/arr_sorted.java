public class arr_sorted {
    public static void main(String[] args) {
        
        int[] arr = {12,34,566,77,87,99};

        boolean issorted = true; // here we created a boolean which initially says the array is arr_sorted

        for(int i = 0; i<arr.length-1;i++) // here we want to run the loop till "lenght-1" because last element is not comparable
        {
            if(arr[i] > arr[i+1]) // comparing next element with previous element is it larger or not 
            {
                issorted = false;  //it false the condition by itself that array is sorted
                break;
            }
        }
        if (issorted) // if issorted is true print yeah array is sorted
         {
            System.out.println("yeah array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
