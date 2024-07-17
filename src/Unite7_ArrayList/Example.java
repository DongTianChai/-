package Unite7_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("张三");
        list.add("李浩楠");
        list.add("胡成波");
        System.out.println("集合长度"+list.size());
        System.out.println("第二个元素"+list.get(1));
        System.out.println("李浩楠的位置"+(list.indexOf("李浩楠")+1));
        //迭代器
        Iterator<String> it= list.iterator();

        while(it.hasNext()) {
//            Object obj=it.next();
//            System.out.println(obj);
            System.out.println(it.next());
        }
        System.out.println("---------------");
        //增强for循环
        for(String s:list){
            System.out.println(s);
        }
    }
}
