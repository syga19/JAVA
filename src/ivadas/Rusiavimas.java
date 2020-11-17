package ivadas;

public class Rusiavimas {
    public static void main(String[] args) {

        int[] a = { 3, 2, 7, 1 };

        spausdintiMasyva(a);
//        int s = a[0];
//        a[0] = a[3];
//        a[3] = s;
//        sukeistiVietomis(a, 0, 3);
//        spausdintiMasyva(a);
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i +1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    sukeistiVietomis(a, i, j);
                    spausdintiMasyva(a);
                }
            }
        }
        spausdintiMasyva(a);
    }
    static void sukeistiVietomis(int[] p, int x, int y) {
        int s = p[x];
        p[x] = p[y];
        p[y] = s;
    }
    static void  spausdintiMasyva(int [] p) {
        System.out.print("{ ");
        for(int e : p) {
            System.out.print(e + " ");
        }

        System.out.println('}');
    }
}
