package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
//        String[] arr = null;
        A02 a02 = new A02();
        System.out.println(a02.find(arr,"c"));
    }
}
class A02 {
    public int find(String[] arr, String f) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (f == arr[i]) {
                    return i;
                }
            }
            return -1;
        }else {
            return -2;
        }
    }
}
