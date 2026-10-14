import java.util.ArrayList;
import java.util.UUID;

public class Team {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private Employee teamLead;
    private Department department;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<String> projects = new ArrayList<>();

    Team(String name, Employee teamLead, Department department,
         ArrayList<Employee> employees, ArrayList<String> projects) {
        this.name = name;
        this.teamLead = teamLead;
        this.department = department;
        this.employees = employees;
        this.projects = projects;
    }


    Team(String name) {
        this.name = name;
    }

    public String getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Employee getTeamLead() { return teamLead; }
    public void setTeamLead(Employee teamLead) { this.teamLead = teamLead; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public ArrayList<Employee> getEmployees() { return employees; }
    public void setEmployees(ArrayList<Employee> employees) { this.employees = employees; }

    public ArrayList<String> getProjects() { return projects; }
    public void setProjects(ArrayList<String> projects) { this.projects = projects; }

    void addEmployee(Employee employee) { employees.add(employee); }

    void addProject(String project) { projects.add(project); }

    int getNumberOfEmployee() { return employees.size(); }
}