package Unite7_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Maniger {
    public static void main(String[] args) {
        int num;
        ArrayList<Product> products=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("-------------");
            System.out.println("商品管理系统");
            System.out.println("1.商品入库");
            System.out.println("2.商品显示");
            System.out.println("3.删除商品");
            System.out.println("0.退出系统");
            System.out.println("-------------");
            num = sc.nextInt();
            int i=0,j=0,k=0,l=0;//商品编号
            switch (num) {
                case 0:
                    return;
                case 1:
                System.out.println("是否要录入商品信息（1：录入；任意其他数字：不录入）");
                int flag1;
                flag1=sc.nextInt();
                if(flag1==1){
                    System.out.println("请输入商品名称");
                    String name, colour;
                    double price;
                    int num1;
                    Scanner scs = new Scanner(System.in);
                    Scanner scd = new Scanner(System.in);
                    name = scs.nextLine();
                    System.out.println("请输入商品颜色");
                    colour = scs.nextLine();
                    System.out.println("请输入商品价格");
                    price = scd.nextDouble();
                    System.out.println("请输入商品数量");
                    num1 = sc.nextInt();
                    Product product = new Product(name, colour, price, num1);
                    products.add(product);
                    System.out.println("商品录入成功，现有以下商品");
                    for (Product product1 : products) {

                        i++;
                        System.out.print(i+".");
                        product1.info();
                    }
                    break;
                }
                else break;

                case 2:
                    for (Product product1 : products) {

                        j++;
                        System.out.print(j+".");
                        product1.info();
                    }
                    break;
                case 3:
                    int id;//删除商品名
                    Scanner scanner=new Scanner(System.in);
                    for (Product product1 : products) {

                        k++;
                        System.out.print(k+".");
                        product1.info();
                    }
                    System.out.println("存在这些商品请输入要删除商品前的编号");
                    id=scanner.nextInt();
                    delete(products,id);
                    System.out.println("删除后的商品余下");
                    for (Product product1 : products) {
                        l++;
                        System.out.print(l+".");
                        product1.info();
                    }
                    break;
                default:
                    System.out.println("输入错误请重新输入");

            }
        }


    }
    public static void delete(ArrayList<Product> products,int s){
        Iterator<Product> it=products.iterator();
        int flag=0;
        int i=0;
        while(it.hasNext()) {
            Product product=new Product();
            product=it.next();
            i++;
            if(i==s){
                it.remove();
                System.out.println("商品删除成功");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("不存在该商品，商品删除失败");
        }
    }
}
