package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork05 {
    public static void main(String[] args) {
        double R = 3;
        Circle circle = new Circle(R);
        System.out.println("圆的周长= " + circle.perimeter());
        System.out.println("圆的面积= " + circle.area());
    }
}
class Circle{
    double r;

    public Circle(double r){
        this.r = r;
    }

    public double perimeter(){
        double per = this.r * Math.PI * 2;
        return per;
    }

    public double area(){
        return  Math.PI * r * r;
    }
}