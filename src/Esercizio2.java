import java.util.*;

public class Esercizio2 {
    public static List<Integer> listaNumeri (){

        List<Integer> numeriCasuali = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri casuali vuoi generare?");
        int n = scanner.nextInt();

        Random random = new Random();

        for(int i = 0; i<n;i++){
         int casuale = random.nextInt(101);

         numeriCasuali.add(casuale);
        }

        return numeriCasuali;
    }
    public static List<Integer> listaNumeri2 (List<Integer> numeriCasuali){
        List<Integer> numeriCasualiReverse = new ArrayList<>(numeriCasuali);

        for(int i = numeriCasuali.size() - 1 ; i>=0;i-- ){
            numeriCasualiReverse.add(numeriCasuali.get(i));
        }
        return numeriCasualiReverse;
    }

 

    public static void main(String[] args){
        List<Integer> numeriCasuali = listaNumeri();
        System.out.println("Numeri casuali generati:" + numeriCasuali);

        List<Integer> numeriCasualiReverse = listaNumeri2(numeriCasuali);
        System.out.println("Numeri casuali seguiti da numeri in ordine inverso:");
        System.out.println(numeriCasualiReverse);

    }
}

