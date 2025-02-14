public class dowhile {
    public static void main(String[] args) {
        // int i = 45;

        // do while loop first runs the code and then checks the conditions it doesn't means that it will not going to follow the while condition 
        //they both work together while condition and do block 

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i>100);

        System.out.println("printing first 10 odd numbers");

        //to print first 10 odd numbers there could be multiple methods but if i had choice i can say i choose the following methods right there
        // int n = 20;
        // for(int i =0; i<n; i++ ){
        //     if(i%2 != 0){
        //         System.out.println(i);
        //     }
        // }

        //but this is not the very only method the most feasible method is following told by harry
        int n = 10; // i need first 10 odd numbers

        //it simply convert every number starting from 0 to 9 odd by first multiplying it to 2 and then adding 1

        for(int i = 0; i<n; i++){
            System.out.println(i*2+1); //here are the main logic are (2n) for even numbers and (2n+1) for odd numbers 
        }

    }

}
