package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {
    //generate random string
    public static String getRandomString(){
        String s= RandomStringUtils.randomAlphabetic(6);
        return s;
    };
}
