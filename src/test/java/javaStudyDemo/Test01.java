package javaStudyDemo;

public class Test01 {
    public static void main(String[] args) {
        double all = 100000;
        int cishu = 0;
        while (all >= 0 ){
            if (all > 50000) {
                all *= 0.95;
            }else if (all >= 1000){
                all -= 1000;
            }else {
                break;
            }
            cishu++;
        }
        System.out.println("总共经过："+cishu+"次");
    }
}
