package klases;

public class Main {
        public static void main(String[] args) {
            zmogus z;
            z = new zmogus();
            z.pavarde = "Jonaitis";
            z.vardas = "Jurgis";


            zmogus z2 = z;
            System.out.println(z2.vardas);

            z2.vardas = "Petras";
            System.out.println(z.vardas);
        }
}
