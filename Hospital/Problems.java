package Hospital;

public class Problems {


    public static void problems() {
        String[] availableProblems = new String[7];
        availableProblems[0] = "Слабость, сильная ужас";
        availableProblems[1] = "Температура, кашель, насморк";
        availableProblems[2] = "С головой";
        availableProblems[3] = "Живот болит постоянно";
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "." + availableProblems[i]);
        }
    }

    public static String chosenProblem(int n) {
        String[] availableProblems = new String[7];
        availableProblems[0] = "Слабость, ужас";
        availableProblems[1] = "Температура, кашель, насморк";
        availableProblems[2] = "С головой";
        availableProblems[3] = "Сердечко побаливает";
        availableProblems[4] = "Понос";
        availableProblems[5] = "Живот болит постоянно";
        availableProblems[6] = "Да нет проблем, я хер знает зачем пришел";
        return availableProblems[n];

    }
}