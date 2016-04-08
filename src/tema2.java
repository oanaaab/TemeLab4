import java.util.Scanner;
public class tema2 {

    /*  Se da un sir de numere ordonate crescator.
Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
sirul va fi definit asa, numerele sunt de exemplu.
int[] a = {1,3,4,6,7,8,10,12,14,23}; */

        public static void tema2 (String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter number");
            int scan = input.nextInt();
            int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};

            for(int i=1;i<=a.length;i++){
                if(scan==a[i+1] ){
                    System.out.println("numar gasit pe pozitia "+i);
                }
            }
            System.out.println("-1");
        }
    }
}
