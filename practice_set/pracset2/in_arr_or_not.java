public class in_arr_or_not {
    public static void main(String[] args) {
        int array[]= {23,45,65,12,90,15};

        for(int i =0; i<array.length; i++){
            if (array[i] == 15) {
                System.out.println("yes here it is"+array[i]);
                break;
            }
        }
        
    }
}
