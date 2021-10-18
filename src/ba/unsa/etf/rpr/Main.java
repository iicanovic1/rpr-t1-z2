package ba.unsa.etf.rpr;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            if(djeljivSaSumomSvojihCifara(i))
                System.out.println(i);
        }

    }

    private static boolean djeljivSaSumomSvojihCifara(int i) {
        return sumaCifara(i) % i == 0;
    }

    private static int sumaCifara(int broj) {
        int suma = 0;
        for (int i = 1; i<= broj ; i++)
            suma+=i;
        return suma;
    }


}
