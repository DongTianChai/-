package Unite15.game.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //表示登录界面



    public LoginJFrame(){
//        在创建界面时，同时设置一些信息
        //设置宽高
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 登录 " );
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);


        // 设置界面可视化

        this.setVisible(true);
    }
}
