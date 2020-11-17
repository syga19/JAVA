package ivadas;

public class Demo1 {
    public static void main(String[] arg) {
        System.out.println("Helloo!!"); // String
        System.out.println("ALIO");
        System.out.println(124); //int
        System.out.println(123 > 1000); //boolean
        System.out.println(1.978); // double tipo
        System.out.println(123 + 1000); //int
        System.out.println('A'); //char 'A' != "A"

        int i = 999; //reiksmes priskyrimas nurodom koks bus kintamasis
        System.out.println(i);
        double x = 0.000245;
        float y = 0.01f; //f raide gale pavercia i float tipa is double
        long big = 123456789000L; //didelius sveikus skaicius rasom i long, jis uzima dvigubai vietos nei int, jam skita 8 baitai o int 4
        short s = 6400; // maziau nei int telpa
        System.out.println(big);
        var g = 254; //jei iskar priskiriam reiksme galim nenurodyt tipo nuo 11java versijos
        char c = '\u2654'; //unicodinis simbolis
        System.out.println(c);

        if (s < 1000 && c > 'B') {
            System.out.println("aha");
        } else {
            System.out.println("Oh noo");
        }

        int suma = 0;
        for (int j = 1; j <= 10; j++) {
            suma = suma + j;
        }
        System.out.println("1+2+3+4+5+6...+10=" + suma);
        /*System.out.println(suma); */

    }
}
