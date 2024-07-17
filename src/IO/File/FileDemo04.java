package IO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File f1=new File("src\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.delete());//删除


    }
}
