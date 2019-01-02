package pl.coderstrust.regex;

public class Regex {
    public static boolean isIpAddress(String input){
        if(input==null){
            throw new NullPointerException("IP Address cannot be a null");
        }
       return input.matches("^(25[0-5]|2[0-4]\\d|[1]+\\d\\d|[1-9]?\\d)([.](25[0-5]|2[0-4]\\d|[1]+\\d\\d|[1-9]?\\d)){3}");
    }
}
