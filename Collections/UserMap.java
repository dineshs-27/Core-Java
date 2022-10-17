package Collections;

import java.util.HashMap;
import java.util.Map;

public class UserMap {
    public static void main(String[] args) {
        UserMap a = new UserMap();
        a.userHashMap();
    }
    public void userHashMap(){
        Map newMap = new HashMap();
        newMap.put(1,"One");
        newMap.put(2,"Two");
        newMap.put(3,"Three");
        System.out.println(newMap);
    }
}