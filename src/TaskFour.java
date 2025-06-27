import java.util.Scanner;

public class TaskFour {
    // TODO: Напишите программу, которая найдет и выведет все простые числа в заданном (сами задаете) диапазоне.
    //  Сделайте метод public static boolean isPrime(int num) {} и вызывайте его в методе main.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayNumb = new int[2];
        String read;

        // Проверка на ввод числа и заполнение массива введенными числами
        for (int i = 0; i < arrayNumb.length; i++) {
            do {
                if (i == 0) {
                    System.out.print("Введите первое число диапазона: ");
                } else {
                    System.out.print("Введите второе число диапазона: ");
                }
                read = scan.nextLine();
                try {
                    arrayNumb[i] = Integer.parseInt(read);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число");
                }
            } while (true);
        }

        for (int i = arrayNumb[0]; i <= arrayNumb[1]; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
