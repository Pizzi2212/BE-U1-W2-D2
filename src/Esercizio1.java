import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti elementi vuoi inserire?");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> elementi = new HashSet<>();

        List<String> duplicati = new ArrayList<>();
        int count = 0;
        while(count < n){
            System.out.println("inserisci l elemento che vuoi aggiungere:");
            String elemento = scanner.nextLine();
            if(!elementi.add(elemento)) {duplicati.add(elemento);} else{
                elementi.add(elemento);
            }
            count ++;
        }


        System.out.println("hai inserito questo numero di elementi:" + elementi.size());
        System.out.println("elementi inseriti:" + elementi);
        System.out.println("elementi duplicati:" + duplicati );
        scanner.close();
    }
}