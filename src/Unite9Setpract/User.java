package Unite9Setpract;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Account account=new Account("woshitiancai","123456");
        Account account1=new Account("hpmssb","1234567");
        Account account2=new Account("wcrsdsb","1234568");
        HashSet<Account> accountHashSet=new HashSet<>();
        accountHashSet.add(account1);
        accountHashSet.add(account2);
        accountHashSet.add(account);
        System.out.println("用户注册请输入用户名");
        boolean flag=true;
        while (flag) {
            String name;
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            Account account3 = new Account(name);
            if (accountHashSet.add(account3)) {
                accountHashSet.remove(account3);
                System.out.println("请输入密码");
                String cipher;
                cipher = sc.nextLine();
                accountHashSet.add(new Account(name, cipher));
                System.out.println("注册成功");
                break;
            } else {
                System.out.println("用户名输入错误请重新输入");
            }

        }
        System.out.println("现有以下账号");
        Iterator<Account> it = accountHashSet.iterator();
        while (it.hasNext()) {
            Account s = it.next();
            System.out.println("账号"+s.getUsername() + ",密码" + s.getCipher());
        }


    }
}
