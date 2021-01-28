package business;


public class ForeignCompany extends Company{
    // -> behavioral inheritance

    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    public String getName() {
        return "Foreign Comp." + name;
    }
}
