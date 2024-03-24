package javaStudyDemo;

public class EightQueen {
    public static void main(String[] args) {
        int[][] arr = new int[16][16];
        Queen queen = new Queen();
        int n = 0;
        int m = 0;
        for (int i = 1; i < 7; i++) {
            arr[0][i] = 2;
            arr[i][0] = 2;
            arr[i+i][i+i] = 2;
        }
        queen.q(arr,n,m);
        System.out.println(arr);
    }
}
//1 为可以放置，2为不可放置
class Queen{
    public boolean q(int[][] arr, int n,int m){
        if (n == 0 && m == 0){
            //放置第一个，坐标0,0
            arr[n][m] = 0;
            return true;
        } else{
            for (int i = 1; i < 8; i++) {
                arr[i][m] = 2;
                return false;
//                for (int j = 1; j < 7; j++) {
//                    arr[n][j] = 0;
//                    return false;
//                }
            }

        }
        return true;
    }
}