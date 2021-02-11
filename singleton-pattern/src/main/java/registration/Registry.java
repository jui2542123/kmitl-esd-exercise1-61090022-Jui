package registration;

//Registration class.

public class Registry {
    private static Registry instance = null;
    private InCompany companyManager = null;

    public static Registry getInstance() {
        if (instance == null) {
            synchronized (Registry.class) {
                if (instance == null) {
                    instance = new Registry();
                }
            }
        }
        return instance;
    }

    //Register function to register in company
    public Boolean register(InCompany companyManager) {
        if (companyManager != null && this.companyManager == null) {
            this.companyManager = companyManager;
            return true;
        }
        return false;
    }
    //Create companyManager inside the List
    public InCompany create() {
        CompanyManager newCompanyManager = new CompanyManager();
        if (register((InCompany) newCompanyManager)) {
            return (InCompany) newCompanyManager;
        }
        return companyManager;
    }


}
