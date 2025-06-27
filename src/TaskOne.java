import java.util.Scanner;

public class TaskOne {
    // TODO: Напишите программу, которая запрашивает год и определяет, является ли он високосным, используя boolean для условия.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String read = "";
        int year;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите год: ");
            read = scan.nextLine();
            try {
                year = Integer.parseInt(read);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
            }
        } while (true);

        boolean isLeapYear = year % 4 == 0;

        if (isLeapYear) {
            System.out.printf("Год %d високосный", year);
        } else {
            System.out.printf("Год %d не високосный", year);
        }
    }
}


