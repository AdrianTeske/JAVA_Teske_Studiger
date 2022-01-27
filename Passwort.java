package ch.tbz;

import static lib.Input.inputString;

public class Passwort {
    public static void main(String[] args) {


        pwchecker();



    }

    private static void pwchecker() {
        while(true){
            String pw = inputString("Bitte geben Sie ein Passwort ein.");
        String pw2 = inputString("Bitte wiederholen Sie Ihr Passwort ein.");
            if (pw.equals(pw2)) {
                System.out.println("cool");
                break;
            } else {
                System.out.println("Bitte wiederholen.");
            }

        }
    }
}
