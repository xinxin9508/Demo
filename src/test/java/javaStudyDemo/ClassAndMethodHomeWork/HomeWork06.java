package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork06 {
    public static void main(String[] args) {
        Cale cale = new Cale(4,5);
        System.out.println(cale.merchant());
        Cale cale1 = new Cale(10,20);
        System.out.println(cale1.Sum());
    }
}
class Cale{
    double a;
    double b;

    public Cale(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double Sum(){
        return this.a + this.b;
    }

    public double cha(){
        return this.a - this.b;
    }

    public double chen(){
        return this.a * this.b;
    }

    public double merchant(){
        if (b == 0){
            System.out.println("除数不能为0");
            return -1;
        }else {
            return a/b;
        }
    }
}