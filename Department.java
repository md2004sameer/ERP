import java.util.ArrayList;

public class Department {
    String name;
    ArrayList<Team> teams= new ArrayList<>();


   
    Department(String name ){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    

    void addTeam(Team team ){
        teams.add(team);
    }


}
