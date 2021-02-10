package registration;


//private concrete class
//This will be use to contain companies

import kmitl.esd.exercise1.registration.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyManager implements InCompany{
    //ArrayList for containing List of companies
    private List<Company> companyList = new ArrayList<>();
    @Override
    public List<Company> getCompanyList() {
        return companyList;
    }
    @Override
    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }
}
