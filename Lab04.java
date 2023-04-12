import java.util.Random;

public class Lab04 {
    
        static String[] articles = {"the", "a", "one", "some", "any"};
        static String[] nouns = {"person", "man", "woman", "dog", "cat", "city", "car", "bicycle"};
        static String[] verbs = {"ran", "walked", "jumped", "skipped", "traveled", "drove"};
        static String[] prepositions = {"to", "from", "over", "under", "on", "by", "for", "away", "towards", "around", "near"};
        public static void main(String[] args) {

            System.out.println(generateSentence());

    }

    public static StringBuilder generateSentence() {
        
        StringBuilder sentence = new StringBuilder();
        Random random = new Random();

        int randomWord = random.nextInt(articles.length);
        sentence.append(articles[randomWord]);
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

        return sentence;
    }
}
