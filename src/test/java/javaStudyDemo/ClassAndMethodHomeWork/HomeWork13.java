package javaStudyDemo.ClassAndMethodHomeWork;


public class HomeWork13 {
        public static void main(String[] args) {
            int times = 5;
            Circle1  circle1 = new Circle1();
            PassObject passObject = new PassObject();
            passObject.printAreas(circle1, times);
        }
}

class Circle1{
    double radius;
    public Circle1(){

    }
    public double findArea(){
        return  Math.PI * radius * radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printAreas(Circle1 circle1, int times){
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            circle1.setRadius(i);
            System.out.println(i + "\t" + circle1.findArea());
        }
    }
}