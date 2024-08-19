package Base.Poly.polyparameter_;

public class manage extends Emplayee{
    private double bonus;

    public manage(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public void manage(){
        System.out.println(getName()+"is managing");
    }
}
