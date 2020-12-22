package Hospital;

public class Doctor extends Person {

    protected int cabN;

    public Doctor(String name, int age, int cabN) {
        super(name, age);
        this.cabN = cabN;
    }


}
