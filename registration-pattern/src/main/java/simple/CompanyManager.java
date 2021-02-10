package simple;


import kmitl.esd.exercise1.registration.Company;

import java.util.ArrayList;
import java.util.List;

//simple package contain CompanyManger

public class CompanyManager {
    private static CompanyManager companyManager;
    private List<Company> companyList = new ArrayList<>();

    //private constructor in simple package
    private CompanyManager() {
    }
}