import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUsuario;
        System.out.println("Digite seu nome: ");
        nomeUsuario = sc.next();
        imprimirNome(nomeUsuario);
    }
    public static void imprimirNome(String nomeUsuario){
        System.out.println("Meu nome é "+nomeUsuario);
    }
}
