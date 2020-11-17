package ivadas;

public class Apvalinimas {
    public static void main(String[] args) {

        double m = Math.PI; //3.14

        System.out.println(m); // 3.141592653589793 -> 3.142
        System.out.println(Math.floor((m + 0.0005) * 1000.0) / 1000.0); // 3.142


        System.out.println(Math.floor(3.4 + 0.5)); //3.0
        System.out.println(Math.floor(2.5 + 0.5)); //3.0
    }
}
