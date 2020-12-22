package Hospital;

public class Nurse extends Person {

    protected Doctor doctor;
    public Nurse(String name, int age, Doctor doctor1) {
        super(name, age);
        this.doctor = doctor1;
    }
}
