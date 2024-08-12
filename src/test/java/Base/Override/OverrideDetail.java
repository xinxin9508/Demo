package Base.Override;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * 1.方法重写：子类的参数列表和方法名称需要和父类的相同
 *           子类的返回类型需要和父类的一致或是父类返回类型的子类
 *           子类不能缩小父类的访问权限：public>protected>默认>private
 */
public class OverrideDetail {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}


class Animal{
    public void cry(){
        System.out.println("动物哭....");
    }

    public Object m1(){
        return true;
    }
}

class Dog extends Animal{

    @Override
    public void cry(){
        System.out.println("狗....");
    }

    @Override
    public String m1(){
        return "111";
    }
}