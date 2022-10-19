import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        String[] names = {"Nikola", "Ivan", "Peter", "Dobromir"};
        String[] places = {"Plovdiv", "Sofia", "Veliko Tarnovo", "Varna"};
        String[] verbs = {"sees", "eats", "is playing", "ride"};
        String[] nouns = {"apple", "volleyball", "watch", "bikes"};
        String[] adverbs = {"slowly", "sadly", "warmly", "quickly"};
        String[] details = {"in the park", "near the river", "at home", "in the hall"};

        System.out.println("Hello," +
                "This is your first random-generated sentence:");
        while (true) {
            String randomName = randomWord(names);
            String randomPlace = randomWord(places);
            String randomVerbs = randomWord(verbs);
            String randomNouns = randomWord(nouns);
            String randomAdverbs = randomWord(adverbs);
            String randomDetails = randomWord(details);
            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomVerbs, randomNouns, randomAdverbs, randomDetails);
            System.out.println("Click [Enter] to generate a new one.");
            System.out.println();
        }
    }

    public static String randomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
