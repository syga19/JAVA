package namudarbai;

public class Ciklai {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 5;
        a[1] = 6;
        a[2] = 10;
        a[3] = 15;
        a[4] = 8;
        a[5] = 4;

        int[] b = new int[3];
        b[0] = 8;
        b[1] = 5;
        b[2] = 3;


        int suma = 0;
        int suma2 = 0;
        int lengthOfArray = a.length;
        int lengthOfArray2 = b.length;
        for  (int i = 0; i < lengthOfArray; i++) {
            suma = suma + a[i];
        }
        int pirmo = suma / lengthOfArray;
        System.out.println(pirmo);
        for (int j = 0; j < lengthOfArray2; j++) {
            suma2 = suma2 + b[j];
        }
        int antro = suma2 / lengthOfArray2;
        System.out.println(antro);
//        System.out.println("Pirmo masyvo suma yra = " + suma);
//        System.out.println("Antrojo masyvo suma yra = " + suma2);

    }
}
