public class LiczIntD extends LiczInt {

    public int odejmij(int a, int b){
        int wynik = super.odejmij(a , b);
        if(wynik > 0)
            return wynik;
        return 0;
    }

    public int podziel(int a, int b) throws Wyjatek{
        if(b == 0)
            throw new Wyjatek("BLAD! Dzielnik nie moze byc zerem!!!");
        else
            return a / b;
    }
}
