import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor;

        System.out.println("Quantos valores quer adicionar? ");
        tamanhoVetor = sc.nextInt();
        int[] valores = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Valor da posicao "+(i+1));
            valores[i] = sc.nextInt();
        }
        menorValor(valores);
    }

    public static void menorValor(int[] valores) {
        int menor;
        menor = valores[0];

        for (int i = 0; i <valores.length ; i++) {
            if (menor>valores[i]){
                menor = valores[i];
            }
        }
        System.out.println("O menor valor desse vetor eh "+menor);
    }
}
