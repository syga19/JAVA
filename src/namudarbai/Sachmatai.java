package namudarbai;

public class Sachmatai {
    //    public static void main(String[] args) {
//        int grudai = 0;
//        //suskaiciuoti kiek grudeliu tilps sachmatu lentoje
//        int lentosDydis = 16;
//        int x = 1;
//        // jei nuo 0 for (int i = 0; i < lentosDydis; i++)
//        for (int i = 1; i <= lentosDydis; i++) {
//
//            System.out.println("Langelyje " + i + " yra " + x + " grudu");
//            grudai = grudai + x;
//            x = x * 2;
//        }
//
//        System.out.println("Is viso ant lentos yra " + grudai + " grudu");
//    }
//
    public static void main(String[] args) {
        double grudai = 0;
        int lentosKrastoDydis = 6; // 3 * 3
        double x = 1;

        for (char stulpelis = 'A'; stulpelis <= 'A' + lentosKrastoDydis - 1; stulpelis++) {
//            System.out.print(stulpelis);
            for (int eilute = 1; eilute <= lentosKrastoDydis; eilute++) {
                System.out.println("Langelyje " + stulpelis + eilute + " yra " + x + " grudu ");
                grudai = grudai + x;
                x = x * 2;
            }
//            System.out.println(); // uzbaigiam eilute
        }

        System.out.println("Is viso ant lentos yra " + grudai + " grudu");
    }
}

