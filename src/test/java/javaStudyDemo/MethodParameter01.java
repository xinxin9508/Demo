package javaStudyDemo;

public class MethodParameter01 {
    public static void main(String[] args) {
        B b = new B();
        int[] arr1 = {1,2,3};
        b.test100(arr1);
        System.out.println("main的");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}
class B{

    public void test100(int arr[]){
        arr[0] = 100;
        System.out.println("test的");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
