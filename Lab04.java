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

        sentence.append(articles[0]);
        sentence.append(" ");
        sentence.append(nouns[0]);
        sentence.append(" ");
        sentence.append(verbs[0]);
        sentence.append(" ");
        sentence.append(prepositions[0]);
        sentence.append(" ");
        sentence.append(articles[1]);
        sentence.append(" ");
        sentence.append(nouns[1]);

        return sentence;
    }
}
