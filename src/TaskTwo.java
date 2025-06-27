import java.util.Scanner;

public class TaskTwo {
    // TODO: Напишите программу, которая проверяет, является ли введенная строка палиндромом
    //  (читается одинаково с начала и с конца, игнорируя пробелы и регистр букв). Сделать с помощью массива символов char.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("Введенная строка не является палиндромом");
                return;
            }
        }
        System.out.println("Введенная строка является палиндромом");
    }
}
