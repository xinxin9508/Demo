package Base.Extends;

/**
 * 1.子类调用时必须先初始化父类的构造器
 * 2.默认调用父类的无参构造器，如果没有无参构造器，则要用super特指父类的构造器去完成初始化
 * 3.super()和this()必须放在子类方法的第一行，且两者不能同时出现
 * 4.不写super()，默认存在这个方法
 * 5.super只能在构造器中使用，不能在成员方法中使用
 * 6.继承的原理：子类继承父类，子类中调用父类的成员方法或向上查找，直到object
 * 7.super访问父类的非私有的成员属性、方法，如果需要访问父类的构造器，需要在构造器中调用，不能在成员方法中嗲用
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.Test();
        sub.sayok();
    }
}
