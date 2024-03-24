package javaStudyDemo;

public class HanoiTower {
    public static void main(String[] args) {
       Tower tower = new Tower();
       tower.move(2,'A','B','C');
    }
}
class Tower{
    public void move(int num,char a,char b,char c){

        if (num == 1){//只有一层
            System.out.println(a + "->" + c);
        }else {//如果有两层
            move(num-1,a,c,b);
            System.out.println(a + "->" + c);
            move(num-1,b,a,c);
        }
    }
}
