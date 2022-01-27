import static lib.Input.*;

public class Harassen_Berechner {
    public static void main(String[] args) {
        int Flaschenanzahl = inputInt("Wie viele Flaschen hast du?");
        int Harassenanzahl = 0;

        if (Flaschenanzahl > 0) {
            while (Flaschenanzahl > 0) {
                Flaschenanzahl = Flaschenanzahl - 6;
                Harassenanzahl++;
            }
            System.out.println(Harassenanzahl);
        } else {
            System.out.println("Sie brauchen keine Harasse");
        }
    }
}
