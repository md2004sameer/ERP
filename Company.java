import java.util.ArrayList;

public class Company {
    private String name ;
    private ArrayList<Department> departments = new ArrayList<>();


    Company(String name  ){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }



    boolean addDepartment(Department department){
        if(department == null) return false;

        departments.add(department);
        return true;
    }
}
