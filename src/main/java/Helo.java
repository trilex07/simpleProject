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
        int aNumber = 5;
        int bNumber = 12;
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
        System.out.print(result);

      String numery =  changeNumbers(aNumber, bNumber);
        System.out.println(numery);
    }


   private static String changeNumbers(int a, int b){
        a= (b*a);
        b = (a/b);
        a = (a/b);
        return "Teraz A to "+ a + " B to "+b ;
    }

    //    } }
    public static boolean isNullorEmpty(String s) {
        if (s != null && !s.equals("")) {
            return true;
        }
        return false;
    }

}
class obiekty{
    int w1 = 0;
    int w2 = 2;
}

