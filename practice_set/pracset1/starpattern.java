public class starpattern {
    public static void main(String[] args){

        System.out.println("star patter\n");
        
        //first loop is for rows and and first loop only run for i<= times whereas inner loop will run for 4*4 = 16 times
            for(int i = 4; i>=0; i--){
                for(int j = 0; j<=i; j++ ){
                    System.out.print("*");
                }
                System.out.print("\n");         
                }
            }
    }

