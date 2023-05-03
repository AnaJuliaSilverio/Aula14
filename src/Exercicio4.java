import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor;

        System.out.println("Quantos valores quer adicionar? ");
        tamanhoVetor = sc.nextInt();
        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Valor da posicao "+(i+1));
            valores.add(sc.nextInt()) ;
        }
        menorValor(valores);
    }

    public static void menorValor(List<Integer> valores) {
        int menor;
        menor = valores.get(0);

        for (int i = 0; i <valores.size() ; i++) {
            if (menor>valores.get(i)){
                menor = valores.get(i);
            }
        }
        System.out.println("O menor valor desse vetor eh "+menor);
    }
}
