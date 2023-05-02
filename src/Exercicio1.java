import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorDigitadoUsuario;
        System.out.println("Digite um valor: ");
        valorDigitadoUsuario = sc.nextInt();
        somatorio(valorDigitadoUsuario);
    }
    public static void somatorio(int valorUsuario){
        int somaDoIntervalo=0;

        for (int i = 0; i <=valorUsuario ; i++) {
            somaDoIntervalo+=i;
        }
        System.out.println("A soma dos valores do intervalo de 1 a "+valorUsuario+" é "+somaDoIntervalo);

    }
}