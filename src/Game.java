import java.util.Scanner;
public class Game {
    static Words wordBank = new Words();

    public static void startGame(){
        String word = wordBank.getRandomWord();
        roundStart(word);
    }

    public static void Options(){

    }

    public static void roundStart(String word){
        word = word.toLowerCase();
        char[] letters = new char[word.length()];
        Scanner sc = new Scanner(System.in);
        boolean gotIt = false;
        for(int i = 0; i < word.length(); i++){

            if (letters[i] == '\u0000') {
                letters[i] = '_';
            }
        }
        while (!gotIt){
            System.out.println("You have to guess the word");

            System.out.print("\n\t\t");

            showWord(letters);
            System.out.println();
            String guess = sc.next();
            if (word.equals(guess)){
                System.out.println("Congratulations! You've guessed the word: " + word);
                sc.next();
                gotIt = true;
            }

            if (checkGuess(guess, word)) {
                for(int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == guess.charAt(0)){
                        letters[i] = guess.charAt(0);
                    }
                }
            } else {
                System.out.println("Wrong guess");
            }
            if (new String(letters).equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                sc.next();
                gotIt = true;

            }
        }
    }
    public static boolean checkGuess(String guess, String word){
        if (guess.isEmpty()){
            return false;
        } else if (guess.length() == 1){
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == guess.charAt(0)){
                    return true;
                }
            }
        }else if (guess.length() == word.length()){
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == guess.charAt(i)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void showWord(char[] letters){
        for (int i = 0; i < letters.length; i++){
            System.out.print(letters[i]);
        }

    }
}
