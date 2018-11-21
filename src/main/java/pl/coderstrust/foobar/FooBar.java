package pl.coderstrust.foobar;

import java.util.ArrayList;

public class FooBar {

    public static void main(String[] args) {
        printFooBar();
        System.out.print(printFooBar());
    }

    public static ArrayList<String> printFooBar() {
        ArrayList<String> fooBarList = new ArrayList<String>();
        fooBarList.add("0");
        for (int i = 1; i <= 100; i++) {
            fooBarList.add(i + " ");
            if (i % 3 == 0) {
                fooBarList.set(i, i + " Foo");
            }
            if (i % 5 == 0) {
                fooBarList.set(i, i + " Bar");
            }
            if (i % 15 == 0) {
                fooBarList.set(i, i + " FooBar");
            }
        }
        return fooBarList;
    }
}


