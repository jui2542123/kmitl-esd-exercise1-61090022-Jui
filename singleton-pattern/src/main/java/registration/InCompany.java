package registration;

import kmitl.esd.exercise1.registration.Company;

import java.util.List;

//interface for CompanyManager

public interface InCompany {
    List<Company> getCompanyList();
    void setCompanyList(List<Company> companyList);
}
