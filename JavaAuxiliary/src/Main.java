import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        LiczInt k1 = new LiczInt();

        int wynik;
        System.out.println("Klasa 1: ");
        wynik = k1.dodaj(2,5);
        System.out.println(wynik);
        wynik = k1.odejmij(2,5);
        System.out.println(wynik);

        System.out.println("Klasa 2:");
        LiczIntD k2 = new LiczIntD();
        wynik = k2.dodaj(3,9);
        System.out.println(wynik);
        wynik = k2.odejmij(3,9);
        System.out.println(wynik);

        try{
            wynik = k2.podziel(9, 2);
            System.out.println(wynik);
            wynik = k2.podziel(9, 0);
            System.out.println(wynik);
        } catch(Wyjatek e){
            e.printStackTrace();
        }
        System.out.println("... i to juz koniec");

        int i;
        double f = 3.14;
        i = (int) f;
        System.out.println(f);
        System.out.println(i);

        Object o1, o2;
        o1 = new LiczInt();
        wynik = ((LiczInt) o1).odejmij(1, 9);
        System.out.println(wynik);
        o2 = new LiczIntD();
        wynik = ((LiczInt) o2).odejmij(1, 9);
        System.out.println(wynik);

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ciag znakow: ");
        String s = sc.next();
        System.out.println("Podaj liczbe calkowita: ");
        int tmp = sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj ciag znakow: ");
        String s2 = br.readLine();
        System.out.println("Podaj liczbe calkowita: ");
        int tmp2 = Integer.parseInt(br.readLine());
        return;
    }
}
