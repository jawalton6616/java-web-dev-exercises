package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola!";
        } else if (lang.equals("fr")) {
            return "Bonjour!";
        }
        else if(lang.equals("gm")){
            return "idk German";
        }
        else {
            return "Hello!";
        }
    }
}
