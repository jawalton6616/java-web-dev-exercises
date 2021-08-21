package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner langInput = new Scanner(System.in);
        System.out.print("What language do you speak?: ");
        String language = langInput.next();
        langInput.close();
        String message = Message.getMessage(language);
        System.out.println(message);
    }

}
