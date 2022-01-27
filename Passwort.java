package ch.tbz;

import static lib.Input.inputString;

public class Passwort {
    public static void main(String[] args) {

        pwchecker();

    }

    private static void pwchecker() {
        for(int i = 0; i < 3; i++){
            String pw = inputString("Bitte geben Sie ein Passwort ein.");
        String pw2 = inputString("Bitte wiederholen Sie Ihr Passwort ein.");

        if(pw.length() < 8 && pw2.length() < 8){
                System.out.println("Ihr Passwort ist zu kurz");
            continue;
        }
            if (pw.equals(pw2)) {
                System.out.println("cool");
                break;
            } else {
                System.out.println("Bitte wiederholen.");
            }

        }
    }
}
