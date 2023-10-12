import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int k = readFromFile("INPUT.TXT"); //Кол-во дней
        String[] arr = trackRearranging(k);
        writeToFile(arr);
    }
    public static int readFromFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        int k = sc.nextInt(); //Кол-во дней
        System.out.println("Количество дней = "+k);
        return k;
    }
    public static String[] trackRearranging(int k) throws FileNotFoundException {
        String[] arr = {"G", "C", "V"}; //Герань, крокус, фиалка
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<k; i++) {
            String tmp = arr[1];
            arr[1] = arr[2];
            arr[2] = tmp;
            tmp = arr[1];
            arr[1] = arr[0];
            arr[0]=tmp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void writeToFile( String[] arr) throws IOException {
        String outputFName = "FlowersOrderAfterKDays";
        String s = Arrays.toString(arr);
        Files.writeString(Path.of(outputFName),s);
    }
}