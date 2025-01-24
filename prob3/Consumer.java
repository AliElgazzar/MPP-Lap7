package lesson7.labs.prob3;

import java.util.List;

public interface Consumer {

    default void printUpperCase(List<String> list) {
        for (String s : list) {
            System.out.println(s.toUpperCase());
        }
    }
}
