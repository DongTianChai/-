package IO.File;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f1=new File("untitled\\java.txt");
        System.out.println(f1.isDirectory());//file是否俄为目录
        System.out.println(f1.isFile());//是否为文件
        System.out.println(f1.exists());//是否存在

        System.out.println(f1.getAbsolutePath());//返回绝对路径名
        System.out.println(f1.getPath());//返回抽象路劲名
        System.out.println(f1.getName());//返回文件或目录的名称

        File f2=new File("E:\\ithema");//返回目录中发文件和目录名数组
        String[] list = f2.list();
        for(String str:list){
            System.out.println(str);
        }
        File[] filearray = f2.listFiles();//返回路径下的文件和目录的file数组
        for(File file:filearray){
            System.out.println(file);
        }


    }
}
