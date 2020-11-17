package ivadas;

public class Masyvai {
    public static void main(String[] args) {
        String[] miestai = {"Kaunas", "Babtai"};
        System.out.println(miestai[1]);

        String[] miestai2; //sukuriamas tuscias masyvas
        int miestuSkaicius = 3; //nustatome kiek masyve bus duomenui
        miestai2 = new String[miestuSkaicius]; // sukuriam nauja masyva
        System.out.println(miestai2.length);
        miestai2[0] = "Lapes"; //naujam masyvui priskiriam duomenis
        miestai2[1] = "Jonava";
        miestai2[2] = "Babulkos";
        if(miestai2[1] == null) {
            System.out.println("Nera miesto!!!");
        } else {
            System.out.println(miestai2[1]);
        }

    }
}
