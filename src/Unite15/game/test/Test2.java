package Unite15.game.test;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setSize(603,680);
        //设置界面标题
        jFrame.setTitle("事件演示 " );
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
//取消默认的居中放置位置，只有取消了才会按照xy轴的形式添加组件
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jbt=new JButton("点我啊");
        //设置位置和宽高
        jbt.setBounds(100,100,100,50);
        //给按钮添加动作监听
        //jtb:组件对象，表示要给组件添加那个事件监听（动作监听包含左键点击，空格）
        //参数 表示事件要执行的代码
//        jbt.addActionListener(new MyActionListener());
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你点我干嘛");
            }
        });
        //添加按钮到界面
        jFrame.add(jbt);
        jFrame.setVisible(true);
    }
}
