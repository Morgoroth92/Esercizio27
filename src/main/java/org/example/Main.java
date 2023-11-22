package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Questa è la stringa di prova"));
        System.out.println(checkString2("prava n.2"));
    }
    private static String checkString(String value) {
        String result;
        if (value.length() >= 10) {
            result = "Lunghezza maggiore di 10";
        } else {
            result = "Lunghezza minore di 10";
        }
        return result;
    }

    private static String checkString2(String value) {
        String result = value.length() >= 10 ? "Lunghezza maggiore di 10" : "Lunghezza minore di 10";
        return result;
    }

}