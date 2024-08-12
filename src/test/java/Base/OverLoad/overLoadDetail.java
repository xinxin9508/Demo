package Base.OverLoad;

/**
 * 1.方法重载：方法名必须相同；
 *           参数列表必须不同--类型、个数、顺序满足其中一个,参数名可以相同；
 *           返回类型没有要求；
 */
public class overLoadDetail {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.MyCal(1,2));
        System.out.println(test.MyCal(1,2.2));
    }
}

class Test {

    public int MyCal(int n1, int n2) {
        return n1 + n2;
    }

    public double MyCal(int n1, double n2) {
        return n1 + n2;
    }
}