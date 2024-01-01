package vowelCounterKata;

public class Vowels {

    public static int getCount(String str) {
        final String[] VOWELS = new String[]{"a", "e", "i", "o", "u"};
        int count = 0;
        for (int i = 1; i <= str.length(); i++){
            for (int j = 0; j < VOWELS.length; j++){
                if (str.substring(i - 1, i).equalsIgnoreCase(VOWELS[j])) {
                    count++;
                }
            }
        }
        return count++;
    }
}