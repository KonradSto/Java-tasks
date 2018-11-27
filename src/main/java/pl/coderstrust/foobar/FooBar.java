package pl.coderstrust.foobar;

import java.util.ArrayList;
import java.util.List;

public class FooBar {

    public static void main(String[] args) {
        System.out.print(getFooBar(15));
    }

    public static List<String> getFooBar(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        List<String> fooBar = new ArrayList<>();
        StringBuilder item = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            item.append(i);
            if (i % 3 == 0) {
                item.append("Foo");
            }
            if (i % 5 == 0) {
                item.append("Bar");
            }
            fooBar.add(item.toString());
            item.delete(0, item.length());
        }
        return fooBar;
    }
}
