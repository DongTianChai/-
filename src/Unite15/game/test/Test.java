package Unite15.game.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
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
        //打印打乱顺序的一维数组

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //3.定义一个二维数组
        int[][] data = new int[4][4];
        //4.把打乱顺序的一维数组中的数据添加到二维数组中
        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }
        //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
