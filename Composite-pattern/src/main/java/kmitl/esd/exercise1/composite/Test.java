package kmitl.esd.exercise1.composite;

import kmitl.esd.exercise1.composite.CreativeDepartment;

public class Test {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        Department socialDepartment = new SocialDepartment(3, "Social department");
        Department creativeDepartment = new CreativeDepartment(4, "Social department");

        HeadDepartment headDepartment = new HeadDepartment(5, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(socialDepartment);
        headDepartment.addDepartment(creativeDepartment);

        headDepartment.printDepartmentName();
    }
}
