import java.util.HashMap;
import java.util.Scanner;

public class Woerterbuch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> gerMap = new HashMap<>();
        HashMap<String, String> engMap = new HashMap<>();
        int choice = 4;
        while (choice != 0) {
            choice = getChoice(choice, sc);

            if (choice == 1) {
                choice = addTranslation(sc, gerMap, engMap, choice);
            } else if (choice == 2) {
                choice = removeTranslation(gerMap, sc, choice);
            } else if (choice == 3) {
                choice = translate(sc, choice, gerMap, engMap);
            }
        }
    }

    private static int getChoice(int choice, Scanner sc) {
        while (choice < 0 || choice > 3) {
            System.out.println("Möchtest du:");
            System.out.println("0. Beenden");
            System.out.println("1. Einen Eintrag hinzufügen");
            System.out.println("2. Einen Eintrag entfernen");
            System.out.println("3. Etwas übersetzen");
            choice = sc.nextInt();
        }
        return choice;
    }

    private static int translate(Scanner sc, int choice, HashMap<String, String> gerMap, HashMap<String, String> engMap) {
        boolean back;
        do {
        System.out.println("Möchtest du:");
        System.out.println("0. Zurück.");
        System.out.println("1. Von Deutsch in Englisch übersetzen.");
        System.out.println("2. Von Englisch in Deutsch übersetzen.");
        int translateChoice = sc.nextInt();
        while (translateChoice < 0 || translateChoice > 2) {
            System.out.println("Fehler. Versuchs erneut.");
            translateChoice = sc.nextInt();
        }

        while (translateChoice != 0) {
            if (translateChoice == 0) {
                choice = 4;
            } else if (translateChoice == 1) {
                System.out.println("Gib ein was du übersetzen möchtest.");
                System.out.println(gerMap);
                String translate = sc.next();
                System.out.println(gerMap.get(translate));
                translateChoice = 0;
            } else {
                System.out.println("Write down, what you want to translate.");
                System.out.println(engMap);
                String translate = sc.next();
                System.out.println(engMap.get(translate));
                translateChoice = 0;
            }
        }

            System.out.println("Möchtest du weitermachen? (true oder false)");
            back = sc.nextBoolean();
            if (!back) {
                choice = 4;
            }
        } while (back);
        return choice;
    }

    private static int removeTranslation(HashMap<String, String> gerMap, Scanner sc, int choice) {
        boolean back;
        do {
            boolean toDeleteTrue = false;
            String toDelete = null;
            System.out.println("Verbleibende Wörter im Wörterbuch: ");
            System.out.println(gerMap);
            System.out.println("Gib das deutsche Wort ein um den Eintrag zu löschen.");
            while (!toDeleteTrue) {
                toDelete = sc.next();
                toDeleteTrue = gerMap.containsKey(toDelete);
                gerMap.remove(toDelete);
            }
            System.out.println(toDelete + " wurde erfolgreich entfernt.");
            System.out.println("Verbleibende Wörter im Wörterbuch: ");
            System.out.println(gerMap);

            System.out.println("Möchtest du weitermachen? (true oder false)");
            back = sc.nextBoolean();
            if (!back) {
                choice = 4;
            }
        } while (back);
        return choice;
    }

    private static int addTranslation(Scanner sc, HashMap<String, String> gerMap, HashMap<String, String> engMap, int choice) {
        boolean back;
        do {
            System.out.println("Gib zuerst das Deutsche Wort ein.");
            String german = sc.next();
            System.out.println("Nun gib das Englische Wort ein.");
            String english = sc.next();

            gerMap.put(german, english);
            engMap.put(english, german);

            System.out.println("Möchtest du weitermachen? (true oder false)");
            back = sc.nextBoolean();
            if (!back) {
                choice = 4;
            }
        } while (back);
        return choice;
    }
}
