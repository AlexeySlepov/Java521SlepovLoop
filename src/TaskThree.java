import java.util.Scanner;

public class TaskThree {
    // TODO: Напишите программу для создания пирамиды из звездочек с заданным количеством уровней.
    //  Используйте вложенные циклы for.
    static final char SYMBOL = '*';

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String read = "";
        int lvl;
        do {
            System.out.print("Введите кол-во уровней в пирамидке: ");
            read = scan.nextLine();
            try {
                lvl = Integer.parseInt(read);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
            }
        } while (true);

        for (int i = 0; i < lvl; i++) {

            for (int j = 0; j <= (lvl - 1) * 2; j++) {
                if (j >= (lvl - 1 - i) && j <= ((lvl - 1) * 2) - (lvl - 1 - i)) {
                    System.out.print(SYMBOL);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
