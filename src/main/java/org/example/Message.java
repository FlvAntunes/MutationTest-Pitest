package org.example;

public class Message {
    public String message(int a) {
        String result;
        if (a >= 0 && a <= 10) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }
}
