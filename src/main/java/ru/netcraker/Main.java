package ru.netcraker;

import ru.netcraker.ch3.p1.CashRegister;
import ru.netcraker.ch3.p1.Product;
import ru.netcraker.ch3.p2.CashRegister_2;
import ru.netcraker.ch3.p4.Sheet;
import ru.netcraker.ch3.p4.SheetFormat;
import ru.netcraker.ch3.p6_p7.Human;
import ru.netcraker.ch3.p8.Student;
import ru.netcraker.ch3.p9.Battery;
import ru.netcraker.ch8_1.ComboLock;
import ru.netcraker.practika.Employee;
import ru.netcraker.practika.HourlyEmployee;
import ru.netcraker.practika.Manager;
import ru.netcraker.practika.SalariedEmployee;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //test_ch3();
        //test_ch8_1();
        test_practika();

    }

    public static void test_practika() {
        IRun task = () -> {
            Employee[] staff = new Employee[3];
            staff[0] = new HourlyEmployee("Morgan, Harry", 30);
            staff[1] = new SalariedEmployee("Lin, Sally", 52000);
            staff[2] = new Manager("Smith, Mary", 104000, 50);

            Scanner in = new Scanner(System.in);
            Arrays.stream(staff).forEach( (e) -> {
                System.out.print("Hours worked by " + e.getName() + ": ");
                int hours = in.nextInt();
                System.out.println("Salary: " + e.weeklyPay(hours));
            } );
        };
        task.run();
    }

    public static void test_ch8_1() {
        IRun task = () -> {
            ComboLock comboLock = new ComboLock(List.of(10, 5, 15));
            comboLock.turnRight(10);
            comboLock.turnLeft(5);
            comboLock.turnRight(10);
            System.out.println("comboLock open = " + comboLock.open());
        };
        task.run();
    }

    public static void test_ch3() {
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
