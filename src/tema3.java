import java.util.Scanner;

/**
 * Created by Oana on 4/8/2016.
 */
public class tema3 {

        public static void tema3 (String[] args) {
             /*;Se citesc numere naturale pânã când se introduce numãrul 0. Afisati suma obtinutã prin adunarea primei
         si a ultimei cifre din fiecare numar citit. Numerele cu mai putin de 2 cifre nu se iau in considerare.
        Exemplu: dacã se introduc numerele 3455 66 7 8 23 11221 0 atunci se va afisa 27 (3+5+6+6+2+3+1+1). */

            Scanner input = new Scanner(System.in);
            int n; //nr introdus
            int x = 0; //suma

            do{ //se introduc numere pana la Diferit de 0
                System.out.println("numar :");
                n = input.nextInt();
                if(n!=0) { //daca nr diferit de 0
                    int end = n % 10; // imparte nr la 10

                    while (n > 9) { // in timp ce n mai mare ca 9
                        n /= 10; //
                    }
                    int start = n;
                    int total = start + end;
                    x =  x + total;
                }

            }while(n!=0);

            System.out.println(x);


        }
    }
}
