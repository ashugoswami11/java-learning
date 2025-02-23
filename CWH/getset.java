//this program is to show access specifiers and getter and setters


class myemployee {
        //this example is to show private access modifiers
        private int salary;
        private String name;
        
       public void setSalary(int n){
            this.salary = n;
        }
        
       public void setName(String n){
            this.name = n;
        }

        public String getname(){
            return name;
        }
        
       public int getsalary(){
            return salary;
        }
        
    }
    
    public class getset {
    public static void main(String[] args) {
        myemployee emp1 = new myemployee();
       // emp1.name = "ashu";  this will not gonna happen because name is a private property

       //to set properties of an object with getter and setter syntax is objname.setname/setsalary();
       emp1.setName("ashu");
       emp1.setSalary(100000000);

       System.out.println(emp1.getname()); // i was doing a mistake here by writing getname.emp1  to print the name of the employee instead of emp1.getname()
       System.out.println(emp1.getsalary());
    }

}