package Base.Poly.polyparameter_;

public class Worker extends Emplayee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
        System.out.println(super.getName() + "is working");
    }
}
