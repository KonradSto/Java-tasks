package pl.coderstrust.foobar;

public class FooBar {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i != 0 && i % 15 == 0) {
                System.out.println(i + " FooBar");
            } else if (i != 0 && i % 3 == 0) {
                System.out.println(i + " Foo");
            } else if (i != 0 && i % 5 == 0) {
                System.out.println(i + " Bar");
            } else {
                System.out.println(i);
            }
        }
    }
}


