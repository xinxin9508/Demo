package javaStudyDemo;

public class kebiancanshu {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        int sum = hspMethod.Sum(1, 20, 100);
        System.out.println(sum);
        int[] arr = {10,30,50};
        hspMethod.sum1(arr);
        hspMethod.sum2("可变参数和=",arr);
    }
}

class HspMethod {
    //可变参数：同样类型的参数可以使用...来代表个数，传入的参数为一个一维数组

    /**
     * 细节：
     * 1.可变参数的实参为一个数组，可以直接传入一个数组
     * 2.可变参数和普通类型的形参可以放在一起，但是要保证可变参数在后面
     * 3.一个形参列表中只能有一个可变参数
     * @param num
     * @return
     */
    public int Sum(int... num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        return res;
    }

    public void sum1(int... num){
        System.out.println("参数长度=" + num.length);
    }
    public void sum2(String name, int... num1){
        int res = 0;
        for (int i = 0; i < num1.length; i++) {
            res += num1[i];
        }
        System.out.println(name + res);
    }
}