package ru.netcraker.ch3.p2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class Product {
    private double purchase; // покупка
    private double payment; // продажа
}
