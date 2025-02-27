class circle{
    float radius;
    float area;
    
    public circle(float radius){
        this.radius = radius;
    }

    public float calculatearea(){
        area = (float)Math.PI * radius*radius;
        return area;
    }
}

class cylinder22 extends circle{
    float height;

    public cylinder22(float radius, float height){
        super(radius);
        this.height = height;
    }

    public float calculatearea(){
        return(2*(float)Math.PI*radius*height)+ (2*super.calculatearea());
    }
   

}
public class circ_inherit {
    public static void main(String[] args) {
        cylinder22 cyl = new  cylinder22(7f,89f);

        System.out.println("area of cylinder is "+ cyl.calculatearea());
    }
}
