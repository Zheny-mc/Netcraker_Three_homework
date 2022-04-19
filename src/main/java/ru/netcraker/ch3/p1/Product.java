package ru.netcraker.ch3.p1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class Product {
    private double purchase; // покупка
    private double payment; // продажа
}
