package Base.Poly.Persons;


/**
 * 多态数组： 数组的定义类型为父类类型，里面保存的实际元素为子类类型
 */
public class PloyArray {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack",18);
        person[1] = new Student("smith",20,100);
        person[2] = new Tercher("king",40,20000);

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
            if (person[i] instanceof Student){
                System.out.println( ((Student)person[i]).study());
            } else if (person[i] instanceof Tercher) {
                System.out.println(((Tercher)person[i]).teach());
            }
        }
    }
}
