import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.next();
            if (command.equals("end")) {
                System.out.println("bye bye");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.next();
                continue;
            }
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = scanner.next();
                String word = dictionary.translate(toBeTranslated);
                if (word == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                    continue;
                }
                System.out.println("Translation: " + word);
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Translation:");
        String translatedWord = scanner.next();
        dictionary.add(word, translatedWord);

    }
}
