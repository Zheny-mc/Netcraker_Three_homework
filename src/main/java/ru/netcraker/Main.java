package ru.netcraker;

import ru.netcraker.ch3.p1.CashRegister;
import ru.netcraker.ch3.p1.Product;
import ru.netcraker.ch3.p2.CashRegister_2;
import ru.netcraker.ch3.p4.Sheet;
import ru.netcraker.ch3.p4.SheetFormat;
import ru.netcraker.ch3.p6_p7.Human;
import ru.netcraker.ch3.p8.Student;
import ru.netcraker.ch3.p9.Battery;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IRun task3_1 = () -> {
            List<Product> products = List.of(
                    new Product(100., 150.0),
                    new Product(200., 250.0),
                    new Product(300., 350.0)
            );
            CashRegister cashReg = new CashRegister();

            products.stream().forEach((i) -> {
                cashReg.giveChange(i.getPurchase(), i.getPayment());
            });

            System.out.println("Number of products sold = " + cashReg.getItemCount());
        };
//        task3_1.run();

        IRun task3_2 = () -> {
            List<Product> products = List.of(
                    new Product(100., 150.0),
                    new Product(200., 250.0),
                    new Product(300., 350.0)
            );
            CashRegister_2 cashReg =
                    new CashRegister_2(new LinkedList<>(), 0.1);

            products.stream().forEach((i) -> {
                cashReg.giveChange(i.getPurchase(), i.getPayment());
            });

            System.out.println("Total Tax = " + cashReg.getTotalTax());
        };
//        task3_2.run();

        IRun task3_4 = () -> {
            Sheet sheet = new SheetFormat().getFormat(3);
            System.out.println(sheet);
        };
//        task3_4.run();

        IRun task3_6 = () -> {
            Human human = new Human("Evgeny");
            human.befriend(new Human("Null1"));
            human.befriend(new Human("Null2"));
            System.out.println("human = " + human.getFriendNames());
        };
//        task3_6.run();

        IRun task3_7 = () -> {
            Human human = new Human("Evgeny");
            human.befriend(new Human("Null1"));
            human.befriend(new Human("Null2"));

            System.out.println("the number of friends a person has = "
                    + human.getFriendCount());
        };
//        task3_7.run();

        IRun StudentTester_task3_8 = () -> {
            Student student = new Student("Evgeniy");
            student.addQuiz(5);
            student.addQuiz(5);
            student.addQuiz(5);
            System.out.println("student Total Score = " +
                    student.getTotalScore());
            System.out.println(
                    String.format("student Average Score = %.3f",
                            student.getAverageScore() ) );
        };
//        StudentTester_task3_8.run();

        IRun task3_9 = () -> {
            Battery battery = new Battery(2000);
            System.out.println(
                    String.format("initial battery capacity = %.1f", battery.getCapacity()));

            battery.drain(1000);

            System.out.println(
                    String.format("initial battery capacity before drain = %.1f", battery.getCapacity()));

            battery.charge();

            System.out.println(
                    String.format("initial battery capacity before charge = %.1f", battery.getCapacity()));
        };
//        task3_9.run();
    }
}
