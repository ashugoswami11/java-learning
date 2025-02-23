//getter and setter for a circle to set area and radius and parameter of circle and if setting area and parameter wrong according to radius then it will give a warning

class circle{
    // double pi = 3.14f;
    static final float pi = 3.1415927f;
    private float radius;
   

    void setRadius(float r){
        this.radius = r;
    }

    // void setParameter(double para){   //no need to set parameter as user input
    //     this.parameter = para;
    // }

    // void setArea(double ar){    //no need to set area as user input
    //     this.area = ar;
    // }


    float getRadius(){
        return radius;
    }

    void checkparameter(float userpara){
        float correctparameter = 2* pi* radius;
        if(Math.round(userpara) == Math.round(correctparameter) ){
            System.out.println("right parameter");
        }
        else{
            System.out.println("wrong parameter");
        }
    }

    void checkarea(float userarea){
        float correctarea = pi*radius*radius;
        if(Math.round(userarea) == Math.round(correctarea)){   // when we do precision check of two decimal number they could be different and handled by computer differently 78.54 might be stored as 78.53999999999 in memory, And pi * radius * radius might be stored as 78.5400000001.
            System.out.println("right area");        // that's the reason we used Math.round() here to eliminate this problem
        }
        else{
            System.out.println("wrong area");
        }
    }



}
public class circlegetset {
    public static void main(String[] args) {
        circle c1 = new circle();

        // c1.setArea(28); // what the hell i am trying to do here 
        c1.setRadius(5.0f);
        
        c1.checkarea(78.54f);
        c1.checkparameter(78);
    }
}
