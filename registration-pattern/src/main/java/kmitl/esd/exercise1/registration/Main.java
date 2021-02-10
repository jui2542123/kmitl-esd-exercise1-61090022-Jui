package kmitl.esd.exercise1.registration;



/*
*  Main method for testing
*
* */

public class Main {
    public static void main(String[] args) {
//        Registry<Integer, Employee> r = Registry.getInstance();
//        r.set(1,new Employee(01, "Jay"));
//        r.set(2,new Employee(02, "Bain"));
//
//        Employee e1 = r.get(1);
//        Employee e2 = r.get(2);
//
//        e1.showInfo();
//        e2.showInfo();

//        CompanyManager.INSTANCE.doSthInstance(); // Singleton

//        Registry<Integer, CompanyManager> r1 = Registry.getInstance();
//        r1.set(1,new CompanyManager( 1,"Manage"));
//        CompanyManager c1 = r1.get(1);
//        c1.doSthInstance();

        // create a local company
        Company companyLocal = Company.create(CompanyType.LOCAL);
        companyLocal.setName("lcomp");

        // create a foreign company
        Company companyForeign = Company.create(CompanyType.FOREIGN);
        companyForeign.setName("fcomp");

        // get and print the names
        System.out.println(companyForeign.getName());
        System.out.println(companyLocal.getName());

        // Encpsulation
//        LocalCompany localCompany = new LocalCompany(); // allowed, because pulic class
//        companyLocal.getTaxId();
    }
}
