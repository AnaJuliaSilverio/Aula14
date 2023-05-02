import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDolar,cotacaoDolar;
        System.out.println("Digite o valor em dolar : ");
        valorDolar = sc.nextDouble();
        System.out.println("Qual a cotação do dolar hoje? ");
        cotacaoDolar = sc.nextDouble();
        converteDolarReal(valorDolar,cotacaoDolar);


    }
    public static void converteDolarReal(double valorEmDolar,double cotacaoDolar){
        double real = valorEmDolar*cotacaoDolar;
        System.out.printf("O valor $%.2f em dolar,com a cotacao atual de R$%.2f, é equivalente a R$%.2f em reais.\n",valorEmDolar,cotacaoDolar,real);
    }
}
