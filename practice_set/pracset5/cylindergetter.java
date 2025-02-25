
class cylinder{
    private float radius;
    private float height;

    void setradius(float rad){
        this.radius = rad;
    }

    void setheight(float h){
        this.height = h;
    }

    float getheight(){
        return height;
    }

    float getradius(){
        return radius;
    }

    public void cylindercal(){   // there is a confusion it is supposed to be a method but it is acting like a constructor too 
        float surface_area = 2*3.14f*radius*height + 2*3.14f*(radius*radius);//2πrh + 2πr²
        float volume = 3.14f*(radius*radius)*height;
        System.err.println(surface_area);
        System.err.println(volume);
    }
}

public class cylindergetter {
    public static void main(String[] args) {
        cylinder cilin  = new cylinder();

        cilin.setheight(23f);
        cilin.setradius(12f);

        System.out.println("height is: "+ cilin.getheight());
        System.out.println("radius is "+cilin.getradius());

        cilin.cylindercal();
    }
}
