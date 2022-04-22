package ru.netcraker.ch3.p6_p7;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@ToString
public class Human {
    private String name;
    private List<Human> friends;

    public Human(String name) {
        this.name = name;
        friends = new LinkedList<>();
    }

    public void befriend(Human p) {
        friends.add(p);
    }

    public void unfriend(Human p) {
        friends.remove(p);
    }

    public String getFriendNames() {
        return friends.stream().map(i -> i.name)
                .collect(Collectors.joining(", "));
    }

    public int getFriendCount() {
        return friends.size();
    }
}

