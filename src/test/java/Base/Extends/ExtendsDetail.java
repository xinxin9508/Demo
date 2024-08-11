package Base.Extends;

/**
 * 1.子类调用时必须先初始化父类的构造器
 * 2.默认调用父类的无参构造器，如果没有无参构造器，则要用super特指父类的构造器去完成初始化
 * 3.super()和this()必须放在子类方法的第一行，且两者不能同时出现
 * 4.不写super()，默认存在这个方法
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.Test();
        sub.sayok();
    }
}