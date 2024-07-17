package Unite15.game.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
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

        //给整个窗口添加键盘监听
        this.addKeyListener(this);



        // 设置界面可视化
        this.setVisible(true);
    }

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("按下不松");
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("按下不松");
    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        //获取键盘每一个按钮的编号
        int code=e.getKeyCode();

        System.out.println(code);
    }
}
