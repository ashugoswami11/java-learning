//create a class monkey with jump() and bite() methods create a class human which inherits this monkey class and implements basic animal interface with eat() and sleep methods
interface BasicAnimals{
    public void eat();    
    public void sleep();    
}

class monkey1
{
    public void jump(){}
    public void bite(){}
}

class human1 extends monkey1 implements BasicAnimals{
    public void eat()
    {System.out.println("human is eating");}
    public void sleep()
    {System.out.println("human is sleeping");}
    public void jump()
    {System.out.println("human is jumping");}
    public void bite()
    {System.out.println("human bites");}
} 

public class monkey {
    public static void main(String[] args) {
        monkey1 h1 = new human1();
        BasicAnimals b1 = new human1();
        h1.bite();
        b1.eat();
        b1.sleep();
        h1.jump();
    }
}
