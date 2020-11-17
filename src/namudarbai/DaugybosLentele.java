package namudarbai;

public class DaugybosLentele {
    public static void main(String[] args) {
//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j < 10 ? " " : " ") + i * j);
//
//            }
//            System.out.println();
//        }
        lentele4x2();
    }
    static void lentele4x2() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j < 10 ? " " : " ") + i * j + "  ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + (i * j < 10 ? " " : " ") + i * j + " ");
            }
            System.out.println();
        }
    }
}
