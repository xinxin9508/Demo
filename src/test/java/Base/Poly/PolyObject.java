package Base.Poly;

/**
 * 1.多态：
 *       一个对象的编译类型和运行类型可以不一致
 *       编译类型在定义对象时，就确定了，不能改变
 *       运行类型可以改变
 *       编译类型看定义时 = 号的左边，运行类型看 = 号的右边
 */
public class PolyObject {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        tom.feed(new Dog("小黑"), new Meet("rou"));

        tom.feed(new Cat("小花"),new Fish("鱼"));
    }
}
