public class TaskSix {
    // TODO: Напишите программу, которая выводит все нечетные числа в диапазоне от 1 до 20.
    //  Программа должна использовать оператор continue, чтобы пропустить четные числа.
    //  Вывод чисел в строчку через пробел.
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
