
package business;


import java.io.IOException;
import java.util.logging.*;


public class Main {
    private static Logger logger = Logger.getLogger("com.wombat.nose");
    private static FileHandler fh;

    static {
        try {
            fh = new FileHandler("mylog.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


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
