//this program is to show how we can create varargs method and use it take as much input as we want
//if we want to create a sum function which could be work with as many args as we want so we create like (int...arr)
//like this (int...arr)  -> it will parse as an array in the method

public class varargs{

    //function to take as much args we want and sum up them
    static int sum(int ...arr){
        int result =0;
        for(int elements: arr){
            result += elements;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("the sum of 1+2 is "+ sum(1,2));
        System.out.println("the sum of 1+2+67 is "+ sum(1,2,67));
        System.out.println("the sum of 1+2+23+56 is "+ sum(1,2,23,56));
        System.out.println("the sum of 1+2+89+99 is "+ sum(1,2,89,99));
    }

}