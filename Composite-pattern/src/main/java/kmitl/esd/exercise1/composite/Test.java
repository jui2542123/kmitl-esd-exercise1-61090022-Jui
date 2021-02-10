package kmitl.esd.exercise1.composite;


//Testing
public class Test {
    public static void main(String args[]) {
        //Create departments
        BusinessUnit salesDepartment = new Team(1, "Sales department");
        BusinessUnit BusinessDepartment = new Team(2, "Business department");

        //Create Main department
        Department headDepartment = new Department(3, "Department");

        //Add departments to the main department
        headDepartment.add(salesDepartment);
        headDepartment.add(BusinessDepartment);

        //Show output  ///console log
        headDepartment.print();

    }
}
