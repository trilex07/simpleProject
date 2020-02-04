import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Helo {

    public static void main(String[] args) {


        obiekty o1 = new obiekty();
        obiekty o2 = new obiekty();
        obiekty o3 = new obiekty();

        ArrayList<obiekty> lista = new ArrayList<obiekty>();
        lista.add(o1);
        lista.add(o2);
        lista.get(0).w1=3;
        lista.add(o3);

        lista.get(2).w1 =4;
        lista.get(2).w2 = 5;

        List<String> lista2 = new LinkedList<String>();
        lista2.add("h");
        lista2.add("a");
        String s1 = " a la       ";
        String result = "nope";
        int aNumber = -7;
        int bNumber = 0;
        for (String x : lista2){
            System.out.print(x);
        }
        for ( obiekty s : lista){
            System.out.println(s.w1 +"" + s.w2);
        }
        s1 = s1;
        s1.toLowerCase();
        s1.replace(" ", "");
        if(!isNullorEmpty(result)){
            result = "pusto";
        }
        else {

        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) == s1.charAt(s1.length() - 1 - i)) {
                result = " YUP";
            } else {
                result = "Nope";
            }


        }}
        System.out.println(result);
        String silniaA ="Silnia to "+ silnia(5) + "";
        String potega = "Potego to "+ potegowanie(2,10) + "";
        String fibbo = "Ciąg fibbonaciego to " + fibonacci(12)+ "";
        System.out.println(potega);
        System.out.println(fibbo);
        System.out.println(silniaA);

      String numery =  changeNumbers(aNumber, bNumber);
        System.out.println(numery);
    }


   private static String changeNumbers(int a, int b){
        if(a == 0){
            a = b;
            b =0;
        }
        else if (b ==0){
            b = a;
            a = 0;
        }
        else {
            a = (b * a);
            b = (a / b);
            a = (a / b);
        }
       return "Teraz A to "+ a + " B to "+b ;
    }

    //    } }
    public static boolean isNullorEmpty(String s) {
        if (s != null && !s.equals("")) {
            return true;
        }
        return false;
    }
    private static int silnia(int n){
        if(n  == 0){
            return 1;
        }
        return  n * silnia(n-1);

    }
    private static int fibonacci(int n){
        if(n<=1){
            return n;}
            return fibonacci(n-1)+fibonacci(n-2);


    }
    private static  int potegowanie(int n, int s){
        int wynik =1;
        if(s == 0){
            return 1;
        }
      else  if (s == 1){
            return n;
        }
      else
        {
            while(s>0){
                wynik = wynik *n;
                s--;
            }
        }
        return  wynik;
    }

}
class obiekty{
    int w1 = 0;
    int w2 = 2;
}

