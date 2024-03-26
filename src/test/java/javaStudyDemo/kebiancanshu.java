package javaStudyDemo;

public class kebiancanshu {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        int sum = hspMethod.Sum(1, 20, 100);
        System.out.println(sum);
    }
}

class HspMethod {
    //可变参数：同样类型的参数可以使用...来代表个数，传入的参数为一个一维数组
    public int Sum(int... num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        return res;
    }
}