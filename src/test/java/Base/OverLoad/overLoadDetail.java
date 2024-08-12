package Base.OverLoad;

/**
 * 1.方法重载：方法名必须相同；
 *           参数列表必须不同--类型、个数、顺序满足其中一个,参数名可以相同；
 *           返回类型没有要求；
 *  return中？：的用法
 *  2 ==0 ? 1+ 1: 2-2;
 * 如过2等于0，执行1+1，如果2不等于0 ，则执行2-2.
 */
public class overLoadDetail {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.MyCal(1,2));
        System.out.println(test.MyCal(1,2.2));

        Test01 test01 = new Test01();
        System.out.println(test01.m(2));
        System.out.println(test01.m(2,3));
        System.out.println(test01.m("3"));

        System.out.println(test01.max(1,2));
        System.out.println(test01.max(1.1,2.2));
        System.out.println(test01.max(2.2,4.4,3.3));
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

class Test01 {
    public int m(int n1) {
        return n1 * n1;
    }

    public int m(int n1, int n2) {
        return n1 * n2;
    }

    public String m(String n1) {
        return n1+"*"+n1;
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        return n1 > n2 && n1 > n3 ? n1 : n2 > n3 ? n2 : n3;
    }
}