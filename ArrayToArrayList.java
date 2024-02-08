import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int numArrayElements = scanner.nextInt();
        Integer[] array = new Integer[numArrayElements];


        System.out.print("Enter the elements of the array (separated by spaces): ");
        for (int i = 0; i < numArrayElements; i++) {
            array[i] = scanner.nextInt();
        }


        List<Integer> arrayList = Arrays.asList(array);
        System.out.println("ArrayList from array:");
        System.out.println(arrayList);

        scanner.nextLine();


        System.out.print("\nEnter the number of elements in the ArrayList: ");
        int numArrayListElements = scanner.nextInt();
        scanner.nextLine();

        List<String> stringList = new ArrayList<>();
        System.out.println("Enter the elements of the ArrayList (one per line):");
        for (int i = 0; i < numArrayListElements; i++) {
            String element = scanner.nextLine();
            stringList.add(element);
        }


        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("\nArray from ArrayList:");
        System.out.println(Arrays.toString(stringArray));

        scanner.close();
    }
}

