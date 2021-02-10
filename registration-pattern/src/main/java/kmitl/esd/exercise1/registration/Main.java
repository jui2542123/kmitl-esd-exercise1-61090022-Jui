package kmitl.esd.exercise1.registration;

/*
*  Main method for testing
*
* */

import registration.InCompany;
import registration.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //Create company register
        Registry company1 = new Registry();

        //Register company
        company1.register(Registry.getInstance().create());

        //create company list
        List<Company> companyList = new ArrayList<>();

        //Create foreign company
        Company foreignCompany = Company.create(CompanyType.FOREIGN);

        //Assign the Foreign company name
        foreignCompany.setName("Foreign<Company>");
        //Add company in the list
        companyList.add(foreignCompany);

        //Console log out for info
        companyList.forEach(company -> logger.info(company.getName()));

    }
}
