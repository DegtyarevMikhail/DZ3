import java.util.Random;
import java.util.Scanner;

public class MakeArray {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        String a;
        System.out.println("guess the word");
        System.out.println("Enter the word");
        a = scanner.nextLine();
        int q;
        //String str = "apple";
        //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        for (String word : words) {
            q = (word == a) ? 1 : 2;
            System.out.println(word);
            switch (q) {
                case 1:
                    System.out.println("The word is guessed!");
                    break;
                case 2:
                    System.out.println("The word is not guessed!");
                default:
            }
        }


        }
    }

