package javaStudyDemo;

public class overloadTest {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.m(2));
        System.out.println(method.m(3,4));
        System.out.println(method.m("out"));
        System.out.println(method.max(1,2));
        System.out.println(method.max(1.1,2.1));
        System.out.println(method.max(3.3,6.6,5.5));
    }
}
//overload重载用法
//形参不同，方法名相同，返回类型可以不同，寻找方法时优先考虑实参不转换精度的方法
 class Method{
     public int m(int a1){
         return a1*a1;
     }
     public int m(int a1,int a2){
         return a1*a2;
     }
     public String m(String a1){
         return a1;
     }
     public int max(int a1,int a2){
//         if (a1 > a2){
//             return a1;
//         }else {
//             return a2;
//         }
         return a1 > a2 ? a1 : a2;
     }
     public double max(double a1,double a2){
//         if (a1 > a2){
//             return a1;
//         }else {
//             return a2;
//         }
         return a1 > a2 ? a1 : a2;
     }
     public double max(double a1,double a2,double a3){
//         if (a1 > a2 & a1 > a3){
//             return a1;
//         } else if (a2 > a1 & a2 > a3) {
//             return a2;
//         } else {
//             return a3;
//         }
         double max1 = a1 > a2 ? a1 : a2;
         return max1 > a3 ? max1 : a3;
     }
 }