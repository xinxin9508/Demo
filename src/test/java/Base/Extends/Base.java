package Base.Extends;

public class Base {
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public Base(){
        System.out.println("base构造器");
    }

    public int getN4(){
        return n4;
    }
    private void test400(){
        System.out.println("test400");
    }
    public void getTest400(){
        test400();
    }
}
