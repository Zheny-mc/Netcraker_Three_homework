import ru.netcraker.ch3.IRun;
import ru.netcraker.ch3.p1.CashRegister;
import ru.netcraker.ch3.p1.Product;
import ru.netcraker.ch3.p2.CashRegister_2;
import ru.netcraker.ch3.p4.Sheet;
import ru.netcraker.ch3.p4.SheetFormat;
import ru.netcraker.ch3.p6.Human;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IRun task1 = () -> {
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
        //task1.run();

        IRun task2 = () -> {
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
        //task2.run();

        IRun task3 = () -> {
            Sheet sheet = new SheetFormat().getFormat(-1);
            System.out.println(sheet);
        };
//        task3.run();

        IRun task4 = () -> {
            Human human = new Human("Evgeny");
            human.befriend(new Human("Null1"));
            human.befriend(new Human("Null2"));
            System.out.println("human = " + human.getFriendNames());
        };
        task4.run();

        IRun task5 = () -> {
            Human human = new Human("Evgeny");
            human.befriend(new Human("Null1"));
            human.befriend(new Human("Null2"));

            System.out.println("the number of friends a person has = "
                    + human.getFriendCount());
        };
        task5.run();

    }
}
