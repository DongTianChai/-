package IO.File;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1=new File("E:\\ithema\\java.exe");//通过给定的路劲名称字符串转化为抽象路劲名来创建新的file实例。
        System.out.println(f1);
        File f2=new File("E:\\ithema","java.exe");//从父路径名和子路径名创建新的file实例。
        System.out.println(f2);
        File f3=new File("E:\\ithema");
        File f4=new File(f3,"ava.exe");
        System.out.println(f4);
    }
}
