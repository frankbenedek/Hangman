import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            showmenu();
            switch(input.nextLine()){
                case "1":
                    Game.startGame();
                    break;
                case "2":
                    Game.Options();
                    break;
            }
        }

    }
    public static void showmenu(){
        System.out.println("\n\t\tWelcome to the Hangman Game");
        System.out.println("\n\t\t1. Start Game");
        System.out.println("\t\t2. Options");
        System.out.println("\t\t3. Exit");



    }
}