import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeVendedor;
        double salarioVendedor;
        double valorTotalVendas;
        double salarioTotal;

        System.out.println("Digite seu nome: ");
        nomeVendedor = sc.nextLine();
        System.out.println(nomeVendedor+",digite seu salario fixo: ");
        salarioVendedor = sc.nextDouble();
        System.out.println(nomeVendedor+",digite o total de vendas efetuadas no mes: ");
        valorTotalVendas = sc.nextDouble();
        salarioTotal=calcularSalario(valorTotalVendas,salarioVendedor);

        System.out.println("Vendedor "+nomeVendedor);
        System.out.printf("Salario Fixo: R$%.2f\nValor total de vendas do mes: R$%.2f\nSalario total com 15%% de comissao sobre o valor de vendas:R$%.2f\n",salarioVendedor,valorTotalVendas,salarioTotal);



    }
    public static double calcularSalario(double valorVendas,double salarioFixo) {
        double salarioTotal = (valorVendas * 0.15) + salarioFixo;
        return salarioTotal;
    }
}
