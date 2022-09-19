package controller.Recursion;

import java.util.ArrayList;
import java.util.List;


/**
 * 关于递归
 */
//1 1 1 1 1 1 1
//1 0 0 0 0 0 1
//1 0 0 0 0 0 1
//1 1 1 0 0 0 1
//1 0 0 0 0 0 1
//1 0 0 0 0 0 1
//1 0 0 0 0 0 1
//1 1 1 1 1 1 1
public class MazeApp {

    public static void main(String[] args) {

        int[][] map = new int[8][7];

        /**
         * 设置第一行和最后一行为墙
         */
        for(int i =0;i < 7 ;i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }

        /**
         * 设置第一列和第七列为墙
         */
        for(int i =0;i < 8 ;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }

        /**
         * 设置障碍墙
         */
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("新的迷宫=====================================");

        for(int i =0;i < 8 ;i++){
            for(int j =0;j < 7 ;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }


        isRun(map,1,1);

        System.out.println("第二次查看==================================");
        for(int i =0;i < 8 ;i++){
            for(int j =0;j < 7 ;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }



    }

    /**
     * 1.小球从哪一个位置开始触发，起始位置 1/1
     * 2.map是地图对象
     * 3.最终到达了6/5
     * 4.元素为0标识该点没有走过，元素为1表示一堵墙，元素为2表示通过可以走，元素为3表示该点已经走过
     * 走不通。
     */
    public static boolean isRun(int[][] map,int i,int j){
//        在终点
        if(map[6][5] == 2){
            return true;
        }else {
//            如果可以走，就赋值为2
            if (map[i][j] == 0){//如果没有走过该点
                //按照策略走，下，右，上，左
                map[i][j] = 2;
                if (isRun(map,i+1,j)){ //往下走
                    return true;
                }else if (isRun(map,i,j+1)){ //往右走
                    return true;
                }else if (isRun(map,i-1,j)){
                    return true;
                }else if (isRun(map,i,j-1)){
                    return true;
                }else {
                    //说明该路是死路，走不通
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }

        }
    }








}
