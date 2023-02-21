import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] list = {34, -56, -67, 103, 85, -5, 98, 39, 76, 59};
        System.out.println("Bir değer giriniz : ");
        int n = scanner.nextInt();

        int nMin = list[0];
        int nMax = list[0];

        for(int i: list){
            if (i < n){
                nMin = i;
            }
            if (i > n){
                nMax = i;
            }
        }
        System.out.println("Girilen Değere En Yakın Minimum değer: " + nMin);
        System.out.println("Girilen Değere En Yakın Maksimum değer: " + nMax);
    }
}