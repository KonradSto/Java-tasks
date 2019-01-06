package pl.coderstrust.ipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddressValidator {
    public static boolean isIpAddress(String input){
        if(input == null){
            throw new IllegalArgumentException("IP Address cannot be a null");
        }
        String regex = "^(25[0-5]|2[0-4]\\d|[1]+\\d\\d|[1-9]?\\d)([.](25[0-5]|2[0-4]\\d|[1]+\\d\\d|[1-9]?\\d)){3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
       return matcher.matches();
    }
}
