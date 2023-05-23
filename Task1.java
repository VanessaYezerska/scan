import java.util.Scanner;
import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Task1

        System.out.println("Введіть п'ять слів:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);

        System.out.println("Вречення: " + sentence);
    }
}


class Task2{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть перше ім'я:");
            String name1 = scanner.nextLine();

            System.out.println("Введіть друге ім'я:");
            String name2 = scanner.nextLine();

            boolean name = name1.equalsIgnoreCase(name2);

            if (name) {
                System.out.println("Імена ідентичні.");
            } else {
                System.out.println("Імена не ідентичні.");
            }
        }
    }
    class Task3{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть перший рядок:");
            String string1 = scanner.nextLine();

            System.out.println("Введіть другий рядок:");
            String string2 = scanner.nextLine();

            int length1 = string1.length();
            int length2 = string2.length();

            if (length1 > length2) {
                System.out.println("Перший рядок має більшу кількість символів.");
            } else if (length2 > length1) {
                System.out.println("Другий рядок має більшу кількість символів.");
            } else {
                System.out.println("Рядки мають однакову кількість символів.");
            }
        }
    }
    class Task4{
        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            double a, b, c;

            System.out.println("Введіть три дробові числа:");
            if (name.hasNextDouble()) {
                a = name.nextDouble();
            } else {
                System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
                return;
            }

            if (name.hasNextDouble()) {
                b = name.nextDouble();
            } else {
                System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
                return;
            }

            if (name.hasNextDouble()) {
                c = name.nextDouble();
            } else {
                System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
                return;
            }

            double max = Math.max(Math.max(a, b), c);
            System.out.println("Найбільше дробове число із введених: " + max);


        }
    }

