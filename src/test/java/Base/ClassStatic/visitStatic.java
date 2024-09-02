package Base.ClassStatic;

/**
 * 1.static 静态变量修饰符  访问修饰符 static 对象类型 对象名
 * 2.同一个类对象都可以访问
 * 3。随着类的加载就生成
 * 4.遵守访问权限
 * 5.不需要实例化才可以访问
 */
public class visitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
        A a = new A();
        System.out.println(a.name);
    }
}

class A{
    public static String name = "gxy";


}
