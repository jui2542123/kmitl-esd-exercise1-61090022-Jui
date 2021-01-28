public class CompanyManager {

//    public static final CompanyManager INSTANCE = new CompanyManager();
    protected String name;
    protected int id;

    public CompanyManager(int id, String name){
        this.name = name;
        this.id = id;
    }

    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }

}