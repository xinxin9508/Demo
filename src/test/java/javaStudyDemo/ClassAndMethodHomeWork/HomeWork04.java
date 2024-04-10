package javaStudyDemo.ClassAndMethodHomeWork;

public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        A03 a03 = new A03();
        int[] newarr = a03.copyArr(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + "\t");
        }
    }
}
class A03{

    public int[] copyArr(int[] arr){
        int[] arrcopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        return arrcopy;
    }
}