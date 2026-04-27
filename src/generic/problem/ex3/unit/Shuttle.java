package generic.problem.ex3.unit;

public class Shuttle<T extends BioUnit> {
    T bioUnit;

    public void in(T bioUnit) {
        this.bioUnit = bioUnit;
    }

    public void showInfo(){
        System.out.println("이름: " + bioUnit.getName() + ", HP: " + bioUnit.getHp());
    }
}
