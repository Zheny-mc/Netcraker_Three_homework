package ru.netcraker.ch3.p4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sheet {
    private String name;
    private Integer height;
    private Integer width;
}
