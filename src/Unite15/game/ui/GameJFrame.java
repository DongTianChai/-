package Unite15.game.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener
{
    //GameJFrame表示游戏主界面
//    与游戏相关的逻辑写在这

    //.定义一个二维数组
    //目的用来管理数据
    int[][] data = new int[4][4];
    //记录空白方块
    int x=0;
    int y=0;
    //定义一个变量记录展示图片的路径
    String path = "image\\animal\\animal3\\";
    //win
    int[][] win={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int step=0;
    //创建选项下面的条目对象
    JMenuItem replayItem =new JMenuItem("重新游戏");
    JMenuItem reLoginItem =new JMenuItem("重新登录");
    JMenuItem closeItem =new JMenuItem("关闭游戏");
    JMenuItem accountItem =new JMenuItem("公众号");
    JMenuItem girl =new JMenuItem("美女");
    JMenuItem sport =new JMenuItem("运动");
    JMenuItem animal =new JMenuItem("动物");
    public GameJFrame(){
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenubar();
        //初始化数据（打乱）
        initData();
        
        //初始化图片
        initTmage();


//        显示出来
        this.setVisible(true);
    }

    private void initData() {
        //把一个一维数组中的数据0-15打乱顺序

        //然后再按照4个一组的方式添加到二维数组中
        //1.定义一个一维数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中数据的顺序
        //遍历数组得到每一个元素跟随机索引上的数据进行交换
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //4.把打乱顺序的一维数组中的数据添加到二维数组中
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                x=i/4;
                y=i%4;
            }
            data[i / 4][i % 4] = arr[i];

        }

    }

    //初始化图片 添加图片时用二维数组中的数据来控制图片的位置
    private void initTmage() {
        //删除已经出现的图片
        this.getContentPane().removeAll();
        if(victory()){
            //显示胜利
            JLabel winJLabel=new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }
        JLabel stepCount=new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);


        //创建一个图片ImageIcon的对象
//        ImageIcon icon1=new ImageIcon("E:\\java code note\\untitled\\image\\animal\\animal3\\1.jpg");
        //创建一个JLabel的对象（管理容器）
//        JLabel jLabel1=new JLabel(new ImageIcon("E:\\java code note\\untitled\\image\\animal\\animal3\\1.jpg"));
//        //指定图片位置
//        jLabel1.setBounds(0,0,105,105);
//
//        //把管理容器添加到界面中
//        //this.add(jLabel);
//        this.getContentPane().add(jLabel1);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number1=data[i][j];
                JLabel jLabel=new JLabel(new ImageIcon(path+number1+".jpg"));
                //指定图片位置
                jLabel.setBounds(105*j+83,105*i+134,105,105);
                //给图片添加边框
                //0让图片凸起1相反
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到界面中
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片
        ImageIcon bg =new ImageIcon("image\\background.png");
        JLabel background=new JLabel(bg);
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
        //  刷新界面
        this.getContentPane().repaint();

    }

    private void initJMenubar() {
        //创建整个菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单上面的两个选项对象
        JMenu fuctionJMenu =new JMenu("功能");
        JMenu aboutJMenu =new JMenu("关于我们");
        JMenu changeImage=new JMenu("更换图片");

        //将每一个选项下面的条目添加到选项中
        fuctionJMenu.add(replayItem);
        fuctionJMenu.add(reLoginItem);
        fuctionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        changeImage.add(girl);
        changeImage.add(sport);
        changeImage.add(animal);
        fuctionJMenu.add(changeImage);
        //给条目绑定事件
         replayItem.addActionListener(this);
         reLoginItem.addActionListener(this);
         closeItem.addActionListener(this);
         accountItem.addActionListener(this);
         girl.addActionListener(this);
         animal.addActionListener(this);
         sport.addActionListener(this);

        jMenuBar.add(fuctionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图单机版 V1.0" );
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中

        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置位置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

       //键盘按下时触发
    @Override
    public void keyPressed(KeyEvent e) {
        //按下q键
        int code =e.getKeyCode();
        if(code==81){
            //把界面所有图片删除
              this.getContentPane().removeAll();
                //加载第一张完整的图片
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //加载背景图片
            //添加背景图片
            ImageIcon bg =new ImageIcon("image\\background.png");
            JLabel background=new JLabel(bg);
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否结束
        if(victory()){

            return;
//
        }
    //对上38下40左37右39进行判断
        //w87s83a65d68
        int code =e.getKeyCode();
        if(code==38||code==87){

            System.out.println("向下移动");
            if (x==0){
                return;
            }
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            step++;
            initTmage();
        }else if(code==40||code==83){
            System.out.println("向上移动");
            if(x==3){
                return;
            }
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            step++;
            initTmage();
        }else if(code==37||code==65){

            System.out.println("向右移动");
            if(y==0){
                return;
            }
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            step++;
            initTmage();
        }else if(code==39||code==68){
            System.out.println("向左移动");
            if (y==3){
                return;
            }
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            step++;
            initTmage();
        }
        else if(code==81){
            initTmage();
        }
        //按下v完成拼图
        else if(code==86){
            data=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}};
            initTmage();

        }

    }

    //判断data与win是否xiangt
    public boolean victory(){
           for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
        }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取被点击的条目
        Object obj=e.getSource();
        if(obj==girl){
            path="image\\girl\\girl";
//            生产一个1到13的随机数
            int num= (int) (Math.random()*13+1);
            path=path+num+"\\";
            step=0;
            initData();
            initTmage();

        }
        else if (obj==sport){
            path="image\\sport\\sport";
            int num= (int) (Math.random()*10+1);
            path=path+num+"\\";
            step=0;
            initData();
            initTmage();
        }
        else if(obj==animal){
            path="image\\animal\\animal";
            int num= (int) (Math.random()*8+1);
            path=path+num+"\\";
            step=0;
            initData();
            initTmage();
        }
        if(obj==replayItem){
            System.out.println("重新开始");
            //再次打乱二维数组
            initData();
            step=0;
            initTmage();


        }
        else if (obj==reLoginItem){
            System.out.println("重新登录");
            //关闭界面
            this.setVisible(false);

            //打开登录
//            new LoginJFrame();
        }
        else if (obj==closeItem) {
            System.out.println("退出游戏");
               System.exit(0);

        }
        else if (obj==accountItem) {
            System.out.println("公众号");
            //创建弹框
            JDialog jDialog=new JDialog();
            //Jlabel
            JLabel jLabel=new JLabel(new ImageIcon("image\\img.png"));
            jLabel.setBounds(0,0,264,268);

            //添加
            jDialog.getContentPane().add(jLabel);

            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            //设置弹框居中
            jDialog.setLocationRelativeTo(null);
//不关闭无法操作下一步
            jDialog.setModal(true);
            //显示
            jDialog.setVisible(true);


        }
    }
}
