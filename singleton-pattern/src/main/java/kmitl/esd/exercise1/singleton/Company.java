package kmitl.esd.exercise1.singleton;

import java.util.concurrent.Phaser;

public abstract class Company implements ICompany {

    private String taxId;


    public static Company create(CompanyType companyType) {
        Company company;
        switch (companyType) {
            case LOCAL:
                company = new LocalCompany();
                break;
            case FOREIGN:
                company = new ForeignCompany();
                break;
            default:
                throw new IllegalArgumentException();
        }

        return company;
    }

    // fields
    protected long id;
    protected String name;

    // Constructor
    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return this.taxId;
    }

    void showInfo(){
        System.out.println(name + ":" + id);
    }
}
