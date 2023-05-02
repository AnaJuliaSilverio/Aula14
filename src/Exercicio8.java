import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDeCusto,percentualAcrescimo,valorVenda;
        System.out.println("Digite o valor de custo do produto: ");
        valorDeCusto = sc.nextDouble();
        System.out.println("Digite o percentual de acrescimo do produto: ");
        percentualAcrescimo = sc.nextDouble();
        valorVenda=calcularValorVenda(valorDeCusto,percentualAcrescimo);
        System.out.printf("O valor total do produto é de R$%.2f",valorVenda);

    }
    public static double calcularValorVenda(double valorDeCusto,double percentualAcrescimo){
        double valorVenda = (1+(percentualAcrescimo/100))*valorDeCusto;
        return valorVenda;
    }
}
