public class tema6 {

    public static void tema6 (String[] args) {
          /* Sa se calculeze factorialul unui numar a
                factorialul este definit asa:
        factorial  = 1*2*3*4….*a
        de ex pentru a = 4, factorialul este 1*2*3*4 */
        int nr = 8;
        int fac = 1;
        int sum = 1;
        do {
            sum = sum * fac;
            fac++;
        } while (fac <= nr);
        System.out.println("Factorialul este " + sum);
    }}