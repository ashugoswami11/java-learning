class mainEmployee {
    private int salary;
    private String name;

    // void setsalary(int n) {
    //     this.salary = n;
    // }

    // void setname(String name1) {
    //     this.name = name1;
    // }

    int getsalary() {
        return salary;
    }

    String getname() {
        return name;
    }

    //creating a constructor
    public mainEmployee(int n, String name1){
        this.name = name1;
        this.salary= n;
    }
}

public class construct {
    public static void main(String[] args) {

        mainEmployee emp1 = new mainEmployee(23000,"ashu");
        // emp1.setname("ashu");
        // emp1.setsalary(1220000);

        System.out.println(emp1.getname());
        System.out.println(emp1.getsalary());
    }
}
