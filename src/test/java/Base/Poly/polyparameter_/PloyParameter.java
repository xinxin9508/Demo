package Base.Poly.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        PloyParameter ployParameter = new PloyParameter();
        Emplayee emplayee = new Worker("smith",3000);
        System.out.println(ployParameter.showEmpAnnual(emplayee));
        ployParameter.testWork(emplayee);
        emplayee = new manage("king",5000,10000);
        ployParameter.testWork(emplayee);
        System.out.println(ployParameter.showEmpAnnual(emplayee));
    }
    public double showEmpAnnual(Emplayee e){
        return e.getAnnual();
    }
    public void testWork(Emplayee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof manage) {
            ((manage) e).manage();
        }
    }
}

