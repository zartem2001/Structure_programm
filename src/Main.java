import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("укажите сумму за товар");
        int price = scanner.nextInt();
        System.out.println("укажите вес товара");
        int ves = scanner.nextInt();
        int c = calculateCustoms(price, ves);
        System.out.println("Размер пошлины составляет : " + c);

    }

    public static int calculateCustoms(int a, int b) {
        int d = a / 100 + b*100;
        return d;
    }
}