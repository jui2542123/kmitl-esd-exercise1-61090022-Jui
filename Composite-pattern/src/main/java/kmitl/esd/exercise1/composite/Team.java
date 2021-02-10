package kmitl.esd.exercise1.composite;


//Leaf part in the composite pattern


import java.util.logging.Logger;

public class Team implements BusinessUnit {

    private Integer id;
    private String name;
    private static Logger logger = Logger.getLogger("composite.Team");




    //Contain
    public Team(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Show info

    public void print() {

        logger.info(id + " " + name);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}