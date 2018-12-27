package pl.coderstrust.regex;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(isIpAddress("192.0.2.255"));
        System.out.println(isIpAddress("192.00.2.255"));
        System.out.println(isIpAddress("192.0.2.255.56"));
        System.out.println(isIpAddress("256.0.2.255"));
    }
    public static boolean isIpAddress(String input){
       return input.matches("(25[0-5]|2[0-4]\\d|[1]?[1-9]?\\d)([.](25[0-5]|2[0-4]\\d|[1]?[1-9]?\\d)){3}");
    }
}
