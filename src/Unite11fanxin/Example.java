package Unite11fanxin;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(2);
        list.add(1);
        for(Object obj:list){
            int s=(int) obj;
        }
    }
}
