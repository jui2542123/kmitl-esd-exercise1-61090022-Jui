package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;


//Composite pattern part "Composite" similarly

public class Department implements BusinessUnit {
    private Integer id;
    private String name;

    private List<BusinessUnit> childDepartments;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartmentName() {
        childDepartments.forEach(BusinessUnit::printDepartmentName);
    }

    public void addDepartment(BusinessUnit department) {
        childDepartments.add(department);
    }

    public void removeDepartment(BusinessUnit department) {
        childDepartments.remove(department);
    }


}
