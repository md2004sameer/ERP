public class Main {
    public static void main(String[] args) {
        
        Company orbitBot = new Company("OrbitBot");

        Department engineering = new Department("Engineering");

        Team dev = new Team("Development");

        Employee sameer = new Employee("Sameer", "Engineer" , 80000);

        orbitBot.addDepartment(engineering);
        engineering.addTeam(dev);
        dev.addEmployee(sameer);



    }
    
}
