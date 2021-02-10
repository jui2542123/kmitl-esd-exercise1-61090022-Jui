package kmitl.esd.exercise1.registration;

public class LocalCompany extends Company{

    public CompanyType getCompanyType() {
        return CompanyType.LOCAL;
    }
    public String getName() {
        return "Local Comp." + name;
    }

}