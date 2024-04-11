import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String state = "GCV";
    char flower1 = state.charAt(0);
    char flower2 = state.charAt(1);
    char flower3 = state.charAt(2);
    char bufFlower;
    //System.out.println(flower1);
    //System.out.println(state.charAt(0));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число дней");
        int K = scanner.nextInt();
        for (int i=0; i<K; i++){
            //morning
            bufFlower = flower3;
            flower3 = flower2;
            flower2 = bufFlower;
            //evening
            bufFlower = flower1;
            flower1 = flower2;
            flower2 = bufFlower;
        }
        System.out.println(flower1+" "+flower2+" "+flower3);
    }
}