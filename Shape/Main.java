package Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle(0, 0);
        Circle cir = new Circle(0);
        Triangle tri = new Triangle(0, 0);
        System.out.print("Введите номер фигуры");
        int n = sc.nextInt();
        Shape[] figures = new Shape[n];

        if (n < 1) {
            System.out.println("Невозможно сделать фигуру с такими параметрами");
            return;
        }

        System.out.println("==================================\n" +
                "Возможные фигуры:\n" +
                "1.Прямоугольник\n" +
                "2.Круг\n" +
                "3.Треугольник\n" +
                "==================================");


        for (int i = 0; i < n; i++) {
            System.out.println("Выберите фигуру которую хотите добавить и введите её номер(без пробелов)\n" +
                    "(Прямоугольник/Круг/Треугольник)");
            String answer = sc.next();
            do {
                if (answer.equals("1")) {
                    System.out.println("Введите длину прямоугольника (a & b)");
                    figures[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    break;
                } else if (answer.equals("2")) {
                    System.out.println("Введите радиус круга (r)");
                    figures[i] = new Circle(sc.nextDouble());
                    break;
                } else if (answer.equals("3")) {
                    System.out.println("Введите длину и высоту треугольнику");
                    figures[i] = new Triangle(sc.nextDouble(), sc.nextDouble());
                    break;
                } else
                    System.out.println("Введите номер");
                answer = sc.next();
            } while (true);
            figures[i].getArea();
        }


        System.out.println("\n" +
                "Areas of figures:");
        for (int i = 0; i < n; i++) {
            if (figures[i].getClass().equals(rec.getClass()))
                System.out.println("Rectangle: " + figures[i].area);
            else if (figures[i].getClass().equals(cir))
                System.out.println("Circle: " + figures[i].area);
            else
                System.out.println("Triangle: " + figures[i].area);
        }


        System.out.println("Thank you for using our program :D");

    }
}
