package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//Composite pattern part "Composite" similarly

public class Department implements BusinessUnit {

    private static Logger logger = Logger.getLogger(Department.class.getName());
    private Integer id;
    private String name;

    // List of departments
    private List<BusinessUnit> childDepartments = new ArrayList<>();

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void add(BusinessUnit child) {
        childDepartments.add(child);
    }

    public void print() {
        logger.info(name);

        childDepartments.forEach(child -> child.print());
    }



    public void removeDepartment(BusinessUnit department) {
        childDepartments.remove(department);
    }



}
