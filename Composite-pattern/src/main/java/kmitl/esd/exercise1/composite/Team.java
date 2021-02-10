package kmitl.esd.exercise1.composite;

//Leaf part in the composite pattern

public class Team implements BusinessUnit {

    private Integer id;
    private String name;


    //Show classname ("Team")

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }


    public Team(Integer id, String name){ };

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}