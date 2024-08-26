package Base.OOPHomework.Homework01;

public class homeWork07 {
    public static void main(String[] args) {
        Person01[] person01s = new Person01[4];
        person01s[0] = new Student("smith","boy",18,001);
        person01s[1] = new Student("amy","girl",16,002);
        person01s[2] = new Teacher01("divd","man",35,10);
        person01s[3] = new Teacher01("coco","women",30,11);

        for (int i = 0; i < person01s.length-1; i++) {
            Person01 tmp = null;
            for (int j = 0; j < person01s.length-1-i; j++) {
                if (person01s[j].getAge()<person01s[j+1].getAge()){
                    tmp = person01s[j];
                    person01s[j]= person01s[j+1];
                    person01s[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < person01s.length; i++) {
            System.out.println(person01s[i].info());
        }

        Person01 person01 = new Student("smith","boy",18,001);
        ((Student)person01).study();
        Person01 person02 = new Teacher01("divd","man",35,010);
        ((Teacher01)person02).teach();
    }
}
