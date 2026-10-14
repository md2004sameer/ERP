public class Employee {
    private String name;
    private String role;
    private double salary;

    Employee(String name , String role , double salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public boolean setSalary(double salary){
        if(salary < 0) return false;
        this.salary = salary;
        return true;
    }

    public double getSalary(){
        return salary;
    }


    public boolean setName(String name) {
    if (name == null || name.isBlank()) return false;
    this.name = name.trim();
    return true;
    }

    public String getName(){
        return name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }




}
