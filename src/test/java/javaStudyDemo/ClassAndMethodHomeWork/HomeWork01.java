package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork01 {
    public static void main(String[] args) {
        double[] arr1 = null;
//        double[] arr1 = {20.1, 4.0, 3.3, 10.0, 9.9};
        A01 a = new A01();
        Double res = a.max(arr1);
        if (res != null) {
            System.out.println(a.max(arr1));
        }else {
            System.out.println("数组为空");
        }
    }
}
class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }
}