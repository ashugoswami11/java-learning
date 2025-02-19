import java.util.Scanner;
public class matrix_add {
    public static void main(String[] args){
        //program to add two matrices of size 2*3

        Scanner sc = new Scanner(System.in);
        // declaring and initializing matrices 
        int rows = 2 , cols =3 ; //instead of writing 2 rows and 3 columns for each matrices we simply made these variable
        int mat1[][] = new int[rows][cols];
        int mat2[][] = new int[rows][cols];
        int result[][] = new int[rows][cols];

        //taking inputs from the user to fill in the matrices
        System.out.println("please enter the elements of first matrix");
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
            System.out.printf("please enter the %d %d element of matrix 1 \n",i,j);  // to take inputs form the user
            mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("please enter the elements of second matrix");
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
            System.out.printf("please enter the %d %d element of matrix 2 \n",i,j);  // to take inputs form the user
            mat2[i][j] = sc.nextInt();
            }
        }

        //code to add matrix 1 and matrix 2
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                result[i][j] = mat1[i][j]+ mat2[i][j]; //this line is important which add those elements at specific postions in the matrix and save them in the result matrix
            }
        }

        //printing the result matrix
        System.out.println("the result is: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
