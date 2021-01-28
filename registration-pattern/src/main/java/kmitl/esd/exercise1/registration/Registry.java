package kmitl.esd.exercise1.registration;

import java.util.HashMap;

//generic class
public class Registry <K, V>{
    private static Registry instance = null;
    HashMap<K, V> items = null;

    private Registry(){
        items = new HashMap<K, V>();
    }

    public static Registry getInstance() {
        if(instance == null){
            synchronized(Registry.class){
                if(instance == null)
                    instance = new Registry();
            }
        }
        return instance;
    }
    public V get(K key){
        return items.get(key);
    }
    public void set(K key, V value){
        items.put(key, value);
    }
}
