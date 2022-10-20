import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в Фаренгейтах: ");
        int a = in.nextInt();
        double b = (a - 32) * 5 / 9;
        System.out.println(b);
    }
}