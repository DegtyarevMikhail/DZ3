import java.util.Random;
import java.util.Scanner;

public class Riddle {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = -1;//переменная для ввода с консоли
        int r = 10;//диапазон отгадываемого числа (0-10)
        int x = -1;//переменная для записи random.
        int z = 3;// колличество попыток.
        x = random.nextInt(r);
        System.out.println("Загадано число от 0 до 9 :");
        System.out.println("Отгадайте число от 0 до 9 :");
        //boolean flag = true;
        //while(flag) {
        for (int i = 0;i < z;i++){
            a = scanner.nextInt();
            chekWin(a, x);
        }
        System.out.println("Игра окончена!");
    }

    public static void chekWin(int a, int x) {
            if (a < 0 && a > 9) {
                System.out.println("Вы ввели недопустимое число");
            } else if (x > a) {
                System.out.println("Загаданое число больше");
            } else if (x < a) {
                System.out.println("Загаданое число меньше");
            } else if (a == x) {
                System.out.println("Вы отгадали число");
            }

    }
    /*public static boolean exitGame(int a, int x){

    } */

}



