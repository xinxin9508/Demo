package javaStudyDemo.ClassAndMethodHomeWork;

import sun.util.resources.cldr.ii.CalendarData_ii_CN;

import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        Caiquan caiquan = new Caiquan();
        WinOrLose winOrLose = new WinOrLose();
        winOrLose.jieguo(caiquan,5);
    }
}

class Caiquan{

    int ranDen;
    public Caiquan(){

    }
    public int randen(){
        Random random = new Random();
        int res = random.nextInt(3);
        this.ranDen = res;
        return ranDen;
    }
}
class WinOrLose{
    public void jieguo(Caiquan caiquan, int tom){
        int res = caiquan.randen();
        int w = 0;
        int l = 0;
        String tomRes = "";
        String comRes = "";
        for (int i = 0; i < tom; i++) {
            Random random = new Random();
            int a = random.nextInt(3);
            if (a == 0){
                tomRes = "石头";
            }else if (a == 1){
                tomRes = "剪刀";
            }else if (a == 2){
                tomRes = "布";
            }
            if (res == 0){
                comRes = "石头";
            }else if (res == 1){
                comRes = "剪刀";
            }else if (res == 2){
                comRes = "布";
            }
            System.out.println("tom出" + tomRes + "\t电脑出" + comRes);
            if(a == 0 && res == 1){
                System.out.println("tom赢");
                ++w;
            }else if (a == 0 && res == 2){
                System.out.println("tom输");
                ++l;
            } else if (a == 1 && res == 0) {
                System.out.println("tom输");
                ++l;
            }else if (a == 1 && res == 2) {
                System.out.println("tom赢");
                ++w;
            }else if (a == 2 && res == 0) {
                System.out.println("tom赢");
                ++w;
            }else if (a == 2 && res == 1) {
                System.out.println("tom输");
                ++l;
            }else {
                System.out.println("平局");
            }
        }
        System.out.println("tom赢了" + w + "次");
        System.out.println("tom输了" + l + "次");
    }
}