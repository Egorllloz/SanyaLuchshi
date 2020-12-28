package Uchet;

import Uchet.Buyer;
import Uchet.Order;
import Uchet.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean answerOfUser = true;
    static ArrayList<Order> orders = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int id = 1;

    public static void addProducts(Order order){
        answerOfUser = true;

        while(answerOfUser){
            System.out.println("Введите данные о продукте: название, цену, чьё производство");

            sc.nextLine();
            String productName = sc.nextLine();
            double cost = sc.nextDouble();
            sc.nextLine();
            String manufacturer = sc.nextLine();

            Product product = new Product(productName, cost, manufacturer);
            order.setProducts(product);

            System.out.println("Хотите добавить ещё продуктов?");
            System.out.println("Да или нет");

            String answer = sc.next();
            while(!answer.equals("Да") && !answer.equals("Нет")){
                System.out.println("Пожалуйста напишите да или нет");
                answer = sc.next();
            }
            if(answer.equals("Нет"))
                answerOfUser = false;
        }
    }
    public static void firstRequest(){
        System.out.println("Введите своё имя, пол и возраст");

        String name = sc.nextLine();
        String sex = sc.next();
        int age = sc.nextInt();

        Buyer buyer = new Buyer(name, age, sex);
        Order order = new Order();
        order.setBuyer(buyer);
        order.setId(id);

        System.out.println("Номер вашего заказа " + id);
        System.out.println("Сделайте ваш заказ");

        addProducts(order);
        orders.add(order);
        id++;
    }

    public static void secondRequest(int id){
        Order order =  orders.get(id-1);
        addProducts(order);
    }

    public static void thirdRequest(){
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            Buyer buyer = order.getBuyer();
            System.out.println("========================================");
            System.out.println("Имя: " + buyer.getName());
            System.out.println("Пол:  " + buyer.getSex());
            System.out.println("Возраст:  " + buyer.getAge());
            System.out.println("----------------------------");

            ArrayList<Product> products = order.getProduct();
            System.out.println("Заказ " + order.getId());
            for (int j = 0; j < products.size(); j++) {
                System.out.println("Название:         " + products.get(j).getName());
                System.out.println("Цена:         " + products.get(j).getCost() + " RUB");
                System.out.println("Производство: " + products.get(j).getManufacturer());
                if(j!= products.size()-1)
                    System.out.println("----------------------------");
            }
            System.out.println("========================================");

            System.out.println("Введите 'Y'");
            sc.next();
        }
    }

    public static void thirdRequest(int id){
        Order order = orders.get(id-1);
        Buyer buyer = order.getBuyer();
        System.out.println("========================================");
        System.out.println("Имя: " + buyer.getName());
        System.out.println("Пол:  " + buyer.getSex());
        System.out.println("Возраст:  " + buyer.getAge());
        System.out.println("----------------------------");

        ArrayList<Product> products = order.getProduct();
        System.out.println("Заказ " + order.getId());
        for (int j = 0; j < products.size(); j++) {
            System.out.println("Название:         " + products.get(j).getName());
            System.out.println("Цена:         " + products.get(j).getCost() + " Р");
            System.out.println("Производство: " + products.get(j).getManufacturer());
            if(j!= products.size()-1)
                System.out.println("----------------------------");
        }
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        int userRequest = 1;
        while(userRequest > 0){
            System.out.println("-----------------------------------");
            System.out.println("1.Сделать заказ");
            System.out.println("2.Добавить продуктов в заказ");
            System.out.println("3.Информация о заказах");
            System.out.println("Введите 0, если хотите закончить использование программы");
            System.out.println("-----------------------------------");
            System.out.println();

            System.out.println("Выберите функцию и введите её номер");
            System.out.println();

            userRequest = sc.nextInt();
            if(userRequest == 1)
                firstRequest();
            else if(userRequest == 2) {
                System.out.println("Введиет номер заказа");
                int id = sc.nextInt();
                secondRequest(id);
            }
            else if(userRequest == 0){
                System.out.println("Спасибо за использование нашей программы :)");
                break;
            }
            else {
                System.out.println("Введите номер заказа, чтобы получить всю информацию о заказе");
                int id = sc.nextInt();
                if(id > 0)
                    thirdRequest(id-1);
                else
                    thirdRequest();
            }
        }
    }
}
