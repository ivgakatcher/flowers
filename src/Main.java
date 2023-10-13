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
        //String[] arr = trackRearranging(k);
        String[] arr = RearrangingAnalise(k);
    writeToFile(arr);
    }
    public static int readFromFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        int k = sc.nextInt(); //Кол-во дней
        //System.out.println("Количество дней = "+k);
        return k;
    }
    public static String[] trackRearranging(int k) throws FileNotFoundException {
        String[] arr = {"G", "C", "V"}; //Герань, крокус, фиалка
       // System.out.println(Arrays.toString(arr));
        for (int i = 0; i<k; i++) {
            String tmp = arr[1];
            arr[1] = arr[2];
            arr[2] = tmp;
            tmp = arr[1];
            arr[1] = arr[0];
            arr[0]=tmp;
        }
       // System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void writeToFile( String[] str) throws IOException {
        String outputFName = "OUTPUT.TXT";
        String s = printArr(str);
        Files.writeString(Path.of(outputFName),s);
    }
    public static String printArr(String[] arr)
    {String str = "";
        for (int i = 0; i < arr.length; i++) {
             str = str + (String) arr[i];


        }
        return str;
    }
    public static String[] RearrangingAnalise(int k) throws FileNotFoundException {
        String[] arr = {"G", "C", "V"}; //Герань, крокус, фиалка
        // System.out.println(Arrays.toString(arr));
        int x = k%3;
        String[] pos1 = {"V","G", "C"};
        String[] pos2 = {"C","V", "G"};
        if (x == 1)
            arr = pos1;
        else
            arr = pos2;
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}