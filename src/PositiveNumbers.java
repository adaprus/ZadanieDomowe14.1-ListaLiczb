import java.util.*;

public class PositiveNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = createList(scanner);
            if (!list.isEmpty()) {
                printReverse(list);
                countSumAndPrint(list);
                System.out.println("Minimalna wartość w liście to: " + Collections.min(list));
                System.out.println("Maksymalna wartość w liście to: " + Collections.max(list));
            } else {
                System.out.println("Lista jest pusta");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzaj tylko liczby, pierwsza ujemna zakończy tworzenie listy");
        }
    }

    private static List<Integer> createList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Wprowadzaj liczby");
        int number = scanner.nextInt();
        scanner.nextLine();

        while (number >= 0) {
            list.add(number);
            number = scanner.nextInt();
            scanner.nextLine();
        }
        return list;
    }

    private static void printReverse(List<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.printf("%d, ", list.get(i));
        }
        System.out.printf("%d", list.get(0));
        System.out.println();
    }

    private static void countSumAndPrint(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            sum += list.get(i);
            System.out.printf("%d + ", list.get(i));
        }
        sum += list.get(list.size() - 1);
        System.out.println(list.get(list.size() - 1) + " = " + sum);
    }
}
