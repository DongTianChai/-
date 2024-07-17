package Unite15.game.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    JButton jtb1 =new JButton("点我啊");
    public MyJFrame2() {
        //设置宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图单机");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置位置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //设置组件的宽高
        jtb1.setBounds(0, 0, 100, 50);
        //添加组件
        this.add(jtb1);
        //给按钮绑定鼠标事件
        jtb1.addMouseListener(this);



        // 设置界面可视化
        this.setVisible(true);
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("鼠标点击了");
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("鼠标按下不松");
    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

        System.out.println("鼠标松开了");
    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("鼠标划入了");
    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("鼠标划出了");
    }
}
