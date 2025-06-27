import java.util.Scanner;

public class TaskFive {
    // TODO: Напишите программу, которая генерирует(Random) случайное число от 1 до 100,
    //  а затем предлагает пользователю угадать это число.
    //  Программа должна предоставлять подсказки (слишком маленькое или слишком большое)
    //  и продолжать игру, пока пользователь не угадает число. Используйте цикл do-while для реализации этой задачи.
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * (100));
        System.out.println("Угадайте число от 1 до 100");
        Scanner scan = new Scanner(System.in);
        String read;
        int number;
        do {
            do {
                System.out.print("Введите число: ");
                read = scan.nextLine();
                try {
                    number = Integer.parseInt(read);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не целое число");
                }
            } while (true);

            if (randomNum < number) {
                System.out.println("Ваше число больше загаданного");
                continue;
            } else if (randomNum > number) {
                System.out.println("Ваше число меньше загаданного");
                continue;
            } else {
                System.out.println("\n\nПОЗДРАВЛЯЮ!!!\nВы угадали заданное число.");
                return;
            }
        } while (true);
    }
}
