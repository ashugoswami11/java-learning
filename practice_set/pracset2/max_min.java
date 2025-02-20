//finding min and max number in an array

public class max_min {
    public static void main(String[] args){

        int[] arr = {23,45,67,444,567,3,22,68,99};

        
        //for each loop to iterate all the elements present in the array and findind the maximum one
        
        int max = 0;
        for(int elements:arr){
            if (elements>max) {
                max = elements;
            }
        }
        System.out.printf("the maximum no. is %d\n", max);
        
        
        int min = 0;
        for(int elements:arr){
            if (elements<max) {
                max =elements;
                min = elements;
            }
        }
        System.out.printf("the minimum no. is %d", min);

    }
    
}
