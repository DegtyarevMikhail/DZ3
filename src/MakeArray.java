import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MakeArray {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        for (String o : words) {
            System.out.print(o + " ");
        }
        System.out.println();
        String scan;
        String str;
        str = words[random.nextInt(words.length)];
        int[] numberAns = new int[5];
        int s;
        System.out.println("Guess the word :" + " " + "Игра отгадай слово :");
        System.out.println("Enter the word :" + " " + "Введите название фрукта,овоща из списка выше :");
        for (int i = 0; i < numberAns.length; i++) {
            scan = scanner.nextLine();
            test(scan, str, words);
            if (i == 0) {
                prompt(str, 1);
            } else if (i == 1) {
                prompt(str, 2);
            } else if (i == 2) {
                prompt(str, 3);
            }
        }

        //System.out.println(words[random.nextInt(words.length)]);
    }

    public static void test(String scan, String str, String[] words) {
        if (Objects.equals(str, scan)) {
            System.out.println("The word is guessed!");
            System.out.println("You WIN!");
        } else if (str != scan) {
            System.out.println("Попробуйте ещё раз");
        } else {
            System.out.println("The word is not guessed!");
        }

    }

    public static void prompt(String str, int s) {
        switch (s){
            case 1:
                char c = str.charAt(0);
                System.out.println("Первая буква в слове :");
                System.out.println(c);
                break;
            case 2:
                char z = str.charAt(1);
                System.out.println("Вторая буква в слове :");
                System.out.println(z);
                break;
            case 3:
                char w = str.charAt(2);
                System.out.println("Третья буква в слове :");
                System.out.println(w);
                break;
        }
    }
}
   /* public static void prompt2(char c, char z){
        System.out.println("Вторая буква в слове :");
        System.out.println(z);
    }
    public static void prompt3(char w, char c, char z){
        System.out.println("Первые три буквы в слове :");
        System.out.println(c + " " + z +" " + w );
    }
    public static void prompt4(int w, int c, int z){
        switch (w, c, z){

        }
        System.out.println("Первые три буквы в слове :");
        System.out.println(c + " " + z +" " + w );
    } */






