// package practice_set.pracset4;

class square1{
    int side;
    public int area (){
        return (int) Math.pow(side, 2);
    }
    public int parameter (){
        return 4*side;
    }
    
}

public class square {
    public static void main(String[] args){

        square1 sq1 = new square1();

        sq1.side = 34;
        System.out.println("the area of the square is :"+ sq1.area());
        System.out.println("the parmeter of the square is :"+ sq1.parameter());

    }   
}
