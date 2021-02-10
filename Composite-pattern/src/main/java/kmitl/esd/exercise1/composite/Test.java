package kmitl.esd.exercise1.composite;


//Testing
public class Test {
    public static void main(String args[]) {
        BusinessUnit salesDepartment = new Team(1, "Sales department");
//        BusinessUnit BusinessDepartment = new Team(2, "Business department");


        Department headDepartment = new Department(3, "Department");

        headDepartment.addDepartment(salesDepartment);
//        headDepartment.addDepartment(BusinessDepartment);

        headDepartment.printDepartmentName();

    }
}
