
class employee1{
    int salary; 
    String name; 
    //member function 
    public int salary(){
        return salary;
    }
    
    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
    
    public void setName(String n){
        name = n;
    }
}

public class employee{
    public static void main(String[] args) {

        //creating object for the class
        employee1 sam = new employee1(); //here the obj name of class is sam
        
        sam.salary = 12333;
        System.out.println(sam.getSalary());

        sam.setName("samishere");
       System.out.println( sam.getName());

    }
}
