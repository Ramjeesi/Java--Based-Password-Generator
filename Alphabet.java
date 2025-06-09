package passgen;
public class Alphabet {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()_-+=<>?/{}~|";

    private String alphabet;
 
    public Alphabet(boolean upper, boolean lower, boolean num, boolean sym) {
        alphabet = "";
        if (upper) alphabet += UPPERCASE_LETTERS;
        if (lower) alphabet += LOWERCASE_LETTERS;
        if (num) alphabet += NUMBERS;
        if (sym) alphabet += SYMBOLS;
    }

    public String getAlphabet() {
        return this.alphabet;
    }
}
