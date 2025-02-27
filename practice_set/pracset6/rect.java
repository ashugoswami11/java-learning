class rectangle1{
    float length;
    float width;
    float height;

    public rectangle1(float n , float a, float b){
        this.length = n;
        this.width = a;
        this.height = b;
    }

    public float areacalculate(){
        return length*width;
    }

    
}

class cuboid extends rectangle1{

    public cuboid(float length, float width, float height){
        super(length, width, height);
    }

    public float areacuboid(){
        return 2 * (length * width + length * height + width * height);
    }

    public float volume(){
        return length*height*width;
    }
}

public class rect {
    public static void main(String[] args) {
        cuboid cub = new cuboid(56f, 33f, 56f);

        System.out.println("volume of cuboid is "+ cub.volume());
        System.out.println("area of cuboid is "+ cub.areacuboid());
        System.out.println("area of rectangle is "+ cub.areacalculate());
        
    }
}
