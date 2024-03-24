package javaStudyDemo;

public class Recusion02 {
    public static void main(String[] args) {
        Test t = new Test();
//        int res = t.f(7);
//        System.out.println("res="+res);
        int r = t.peach(9);
        System.out.println(r);
    }
}
class Test{
    public int f(int n){
        if(n>=1){
            if (n == 1 || n == 2) {
                return 1;
            }else {
                return f(n-1) + f(n-2);
            }
        }else {
            System.out.println("输入的数不对");
            return n;
        }
    }

    public int peach(int day){
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day+1)+1)*2;
        }else {
            return -1;
        }
    }
}