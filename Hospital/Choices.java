package Hospital;

import java.util.Scanner;

public class Choices {
    Scanner sc = new Scanner(System.in);

    public void stayHospital0()

    {
        System.out.println("1. Да\n2.Нет.");
    }

    public void getStayHospital1(int x) {
        Story story = new Story();
        if (x == 2) {
            System.out.println("Врач: Хорошо, сдайте кровь на анализ и можете идти.\nАбрамский отдаёт вам направление.");
                    System.out.println("1. Пойти по направлению\n2. Уйти");
            Scanner sc = new Scanner(System.in);
            int v = sc.nextInt();
            if (v == 2) {
                System.out.println("Выйдя из больницы вы потеряли сознание.");
                System.out.println("GAME OVER");
                System.exit(0);
            }
            if (v == 1) {
                story.showStory51();
            }
            if (v != 1 | v != 2) {
                System.out.println("Не смешно уже ни хуя, заебал.");
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
        if (x == 1) {
            story.showStory51();
        }

    }
    public static void chosenProblem(int n){
        Story story = new Story();
        if (n-1 == 0 ){
            Scanner sc = new Scanner(System.in);
            Choices choices = new Choices();
            choices.stayHospital0();
            int c = sc.nextInt();
            choices.getStayHospital1(c);

        }
        if (n-1 == 1){

            System.out.println("Врач: Так, у нас других вариантов кроме как класть вас в больницу нет");
            System.out.println("Вас ведут в инфекционное отделение");
            System.out.println("На двери написано 'Палата 305'");
            System.out.println("В палате одна койка, занятая вашим соседом - Тараканом.");
        }
        if (n-1 == 2){
            System.out.println("В профессианальной сфере мы называем это 'жидкий стул', запомните пожалуйста");
            System.out.println("Назначим вам укольчики, в течении пры деньков выпишим.");
        }

    }
    public void cigarets(){
        System.out.println("1. Согласиться");
        System.out.println("2. Отказаться");
        int x = sc.nextInt();
        Story story = new Story();
        story.showStory53(x);
    }
    public int choiceStory53(){
        System.out.println("1. Выпить\n2. Не пить");
        int x = sc.nextInt();
        return x;
    }
}
