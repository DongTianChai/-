package IO.File;

import java.io.File;
import java.io.IOException;
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1=new File("E:\\ithema\\java.exe");
        System.out.println(f1.createNewFile());//创建文件有就ture否
        File f2 =new File("E:\\ithema\\JavaSE");
        System.out.println(f2.createNewFile());
        File f3=new File("E:\\ithema\\javaWEB\\HTML");
//        System.out.println(f3.mkdir());\\错误
        System.out.println(f3.mkdirs());//创建多级目录
        File f4=new File("E:\\ithema\\JavaSE.txt");
        System.out.println(f4.createNewFile());
    }
}
