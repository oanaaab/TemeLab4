/**
 * Created by Oana on 4/8/2016.
 */
public class tema7 {
    public static void main(String[] args) {
         /*
       7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
 de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8
        */
        int[] a = {11, 13, 9, 8, 16,};
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println(a[i]);
                System.out.println(a[i + 1]);
                System.out.println("--");
            }


        }

    }
}
