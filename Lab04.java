import java.util.Random;
import java.util.Scanner;

public class Lab04 {

    static Scanner scanner = new Scanner(System.in);
    
    static String[] articles = {"the", "a", "one", "some", "any", "every", "each", "several"};
    static String[] nouns = {"person", "man", "woman", "dog", "cat", "city", "car", "bicycle", "tree", "mountain", "river", "ocean", "sun", "moon"};
    static String[] verbs = {"ran", "walked", "jumped", "skipped", "traveled", "drove", "swam", "flew", "climbed", "danced", "sang", "played"};
    static String[] prepositions = {"to", "from", "over", "under", "on", "by", "for", "away", "towards", "around", "near", "among", "within", "without"};
    
    
    public static void main(String[] args) {

        do {
            int sentenceAmount = 0;

            while (true) {
                System.out.println("Pedro and Matt's Sentence Generator using StringBuilder (Lab04)");
                System.out.println("How many sentences do you want? Between (1-25): ");
                sentenceAmount = getSentencesNumber();
                if (sentenceAmount >= 1 && sentenceAmount <= 25) {
                    break;
                }
                System.out.println("Invalid Input");
            }

            StringBuilder allSentences = new StringBuilder();

            for (int i = 0; i < sentenceAmount; i++) {
                StringBuilder sentence = generateSentence();
                allSentences.append((i+1) + ". " + sentence + "\n");
            }

            System.out.println(allSentences.toString());

            System.out.println("Generate more sentences? (Y/N)");
        } while ( checkIfWantToContinue(scanner.next()));
    }

    public static StringBuilder generateSentence() {
        StringBuilder sentence = new StringBuilder();
        Random random = new Random();
        String firstWord;

        int randomWord = random.nextInt(articles.length);
        firstWord = articles[randomWord];
        sentence.append(firstWord.substring(0, 1).toUpperCase());
        sentence.append(firstWord.substring(1));
        sentence.append(" ");

        randomWord = random.nextInt(nouns.length);
        sentence.append(nouns[randomWord]);
        sentence.append(" ");

        randomWord = random.nextInt(verbs.length);
        sentence.append(verbs[randomWord]);
        sentence.append(" ");

        randomWord = random.nextInt(prepositions.length);
        sentence.append(prepositions[randomWord]);
        sentence.append(" ");

        randomWord = random.nextInt(articles.length);
        sentence.append(articles[randomWord]);
        sentence.append(" ");

        randomWord = random.nextInt(nouns.length);
        sentence.append(nouns[randomWord]);

        sentence.append(".");

        return sentence;
    }


    public static boolean checkIfWantToContinue(String input) {

        while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.print("y/n? ");
            input = scanner.next();
        }
        if(input.equalsIgnoreCase("y")) {
            return true;
        }

        return false;
    }

    public static int getSentencesNumber () {
        int sentencesNumber = 0;

        while(!scanner.hasNextInt()) {
            System.out.print("Please enter a number ");
            scanner.next();
        }

        sentencesNumber = scanner.nextInt();

        return sentencesNumber;
    }
}
