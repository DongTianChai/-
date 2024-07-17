package Unite10Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        HashMap map=new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        System.out.println("1:"+map.get("1"));
        System.out.println("2:"+map.get("2"));
        System.out.println("3:"+map.get("3"));
        System.out.println("-----------------");
        Set<String> key=map.keySet();
        for(String s:key){
            System.out.println(s+map.get(s));
        }
        System.out.println("-----------------");
        Set<Map.Entry> entry=map.entrySet();
        System.out.println(entry);
        Iterator it=entry.iterator();
        while (it.hasNext()){
            Map.Entry entry1=(Map.Entry)(it.next());
            Object key1=entry1.getKey();
            Object value=entry1.getValue();
            System.out.println(key1+","+value);

        }
        System.out.println("-----------------");
        for (Map.Entry me:entry){
            Object key2=me.getKey();
            Object value=me.getValue();
            System.out.println(key2+","+value);
        }

    }
}
