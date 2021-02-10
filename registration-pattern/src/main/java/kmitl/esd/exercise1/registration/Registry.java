package kmitl.esd.exercise1.registration;

import java.util.HashMap;

//generic class
public class Registry <K, V>{
    private static Registry instance = null;
//    HashMap<K, V> items = null;
    private CompanyManager companyManager = null;
//    private Registry(){
//        items = new HashMap<K, V>();
//    }

    public boolean regis (CompanyManager companyManager){
        if(companyManager != null && this.companyManager == null){
           this.companyManager = companyManager;
           return true;

        }else{
            return false;
        }
    }
//    public V get(K key){
//        return items.get(key);
//    }
//    public void set(K key, V value){
//        items.put(key, value);
//    }
    public boolean unregister(CompanyManager companyManager){
        if (this.companyManager != null) {
            this.companyManager = null;
            return true;

        }else{
            return false;
        }
    }

    public CompanyManager getCompanyManager(){
        return companyManager;
    }
}
