package Hospital;

import java.util.Scanner;

public class Helper {
    public User createNewUser(Doctor doctor) {
        Scanner sc = new Scanner(System.in);
        return new User(sc.nextLine(), sc.nextInt(), sc.nextInt(), doctor);
    }

    public void rulesHospital(){
        System.out.println("Запрещается:");
        String[] rules = new String[5];
        rules[0] = "Распитие спиртных напитков";
        rules[1] = "Курение на территории больницы";
        rules[2] = "Выход за территорию больницы без разрешения врача";
        rules[3] = "Шум после 10 часов вечера";
        rules[4] = "Нарушения требований врача по поводу лечения";
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + rules[i]);
        }
        return;
    }
}
