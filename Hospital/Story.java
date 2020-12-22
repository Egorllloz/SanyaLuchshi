package Hospital;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Story {
    Scanner sc = new Scanner(System.in);
    User user;
    Choices choices = new Choices();


    public void showStory1() {
        System.out.println("Здраствуйте! Мы рады вас видеть в госпитале Алкемилла." +
                " Возьмите талон и дождитесь своей очереди");
        System.out.println("Выберите действие:");
        System.out.println("1. Взять талон.\n2. Уйти.");
    }

    public void showStory2(Doctor doctor) throws InterruptedException {
        Random random = new Random();
        int c = random.nextInt(100) + 1;
        System.out.println("Ваш талон " + c);
        System.out.println("У кабинета сидит " + c / 2 + " человек, придётся подождать.");

        TimeUnit.SECONDS.sleep(c / 2);

        System.out.println("Из кабинета 1505 доносится крик: ЗАХОДИТЕ!\n На двери ты замечаешь надпись " +
                "'" + doctor.getName() + "'");
        System.out.println("На стуле сидит врач лет " + doctor.getAge());
        System.out.println();
        System.out.println("Врач: Называйте имя, возраст и номер карты");
    }

    public void nameAgeCard() {
        System.out.println(user.getName() + ": " + user.getName() + ", " + user.getAge() + ", " + user.getCardNumber());
    }

    public boolean showStory3(int age) {
        if (age > 20) {
            System.out.println("Врач: Ааа, так вы уже старый, что ж вы стоите тогда,проходите быстрее");
            return true;
        }
        if (age < 18) {
            System.out.println("Врач: Так вы не туда попали, голубчик, вам в детсткую больницу");
            System.out.println("GAME OVER");
            return false;
        }

        System.out.println("Врач: Ну, голубчик, проходите, садитесь, рассказывайте что болит");
        return true;
    }

    public void showStory4(int n) {
        if (n == 1) {
        }
    }

    public void showStory51() {
        Main main = new Main();
        System.out.println("Придя на анализ крови, как только медсестра берёт достаточно крови вы теряете сознание");
        System.out.println("Неизвестный: Доброе утро, Соня");
        System.out.println(user.getName() + ": Что? Где я?");
        System.out.println("Неизвестный: В 303 палате. Тебя привезли вчера, всего такого сморщенного, даже смотреть " +
                "противно было.");
        System.out.println("В палату заходит Абр.\nВрач: Так, Сивачёв, хватит человека пугать!");
        System.out.println("Сивачёв: А я чё? я ничё. Он то как оказалось всегда так выглядит, а не только когда ему" +
                "плохо.");
        System.out.println(user.getName() + ": Ну спасибо");
        System.out.println("Врач: Так, всё, хватит с меня ваших перебранок, " + user.name + ", у тебя авитоминоз" +
                "полежишь тут пару деньков, укольчики поделаешь и отпустим.");
        main.vvv();
    }

    public void showStory52(User sivachev) {
        System.out.println();
        System.out.println("ДЕНЬ 2");
        System.out.println(sivachev.getName() + ": Доброе утро, Соня");
        System.out.println("Сейчас ты понимаешь, что он даже не ложился спать");
        System.out.println(sivachev.getName() + "Курить будешь?\nОн протягивает вам сигарету и зажигалку");
        System.out.println(user.getName() + ": Тут же нельзя, вроде?");
    }

    public void showStory53(int x) {
        Main main = new Main();
        if (x == 1) {
            System.out.println(user.getName() + "Да, давай");
            System.out.println("Покурив вы выкидываете сигареты в банку, которую он достал из под кровати");
        }
        if (x == 2){
            System.out.println(user.getName() + "Нет, спасибо, не хочу нарушать правила");
            System.out.println(Main.sivachev.getName() + ": Ну как знаешь\nДокурив сигарету он бросил её в еле" +
                    " заметную банку под кроватью");
            System.out.println("Сивачёв встал и открыл окно, чтобы выветрился стойкий, противный для некурящего запах" +
                    " дешёвых сигарет.");
            action1();
            int n = choices.choiceStory53();
            if (n == 1){
                System.out.println();
            }
            if (n == 2 ){
                System.out.println("Вы прячите таблетки");
                System.out.println("Но не смогли, вас увидела медсестра");
                System.out.println("Медсестра: вы что такое делаете?");
                System.out.println(user.getName() + ": Я против таблеток.");
                System.out.println("А мы против вашего присутсвия в больнице.");
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }

    }
    public void action1(){
        System.out.println("Спустя час к вам приходит медсестра, принесшая еды");
        System.out.println("Не сказать, что еда выглядела апеттитно, но в твоём состоянии тебе всё равно.");
    }
    public void showStory531(){

    }
}
