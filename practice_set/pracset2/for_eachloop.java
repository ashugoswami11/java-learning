public class for_eachloop {
    public static void main(String[] args) {
        int physics[] = {45,65,87,55,67,78,24,67,78,98}; 

        //formula of average is average = sum of all elements/total number of elements

        //for-each loop is an advance version of loop in java
        // float average = 0f;
        int sum = 0;
        for(int elements:physics){
            sum += elements;
        }
       float average = sum/physics.length;

        System.out.println(average);
    }
}
