package Hospital;

public class User extends Person {
    protected int cardNumber;
    public Doctor doctor;
    public String problem;

    public  User(String name, int age, int cardNumber, Doctor doctor) {
        super(name, age);
        this.cardNumber = cardNumber;
        this.doctor = doctor;
    }


    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
     public int getCardNumber(){
        return this.cardNumber;
     }
}
