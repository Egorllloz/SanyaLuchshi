package Hospital;

import java.util.Scanner;

public class Main {
    static Story story = new Story();
    static Scanner sc = new Scanner(System.in);
    static Problems problems = new Problems();
    static Helper helper= new Helper();

    static Doctor doctor1 = new Doctor("Михаил Абрамский", 31, 1505);
    static Doctor doctor2 = new Doctor("Александр Лицкевич" , 23, 1400);
    static User sivachev = new User("Сивачёв", 18,228, doctor1);
    static Nurse nurse = new Nurse("Даша Чербаба", 20, doctor1);


    public static void main(String[] args) throws InterruptedException {

        story.showStory1();

        int x = sc.nextInt();
        if (x > 2 | x < 1) {
            System.out.println("Самый умный думаешь? ИДИ В КАБИНЕТ,БОЛЬНОЙ");
            x = 1;
        }
        if (x == 2) {
            System.out.println("Из этой больницы нет выхода.");
            x = 1;
        }
        System.out.println("Ну что делать? Придётся брать талон");
        if (x == 1) {
            story.showStory2(doctor1);
            User user = helper.createNewUser(doctor1);
            if (!story.showStory3(user.getAge()))
                return;
            Problems.problems();
            int n = sc.nextInt();
            Problems.chosenProblem(n);
            System.out.println(user.getName() + ": '" + Problems.chosenProblem(n) + "'");

            System.out.println("Врач: так, ну если уж совсем плохо, то кладём вас в больницу, а там уж посмотрим.");
            Choices.chosenProblem(n);
        }
    }

    public void vvv(){
        Story story = new Story();
        story.showStory52(sivachev);
    }


}
