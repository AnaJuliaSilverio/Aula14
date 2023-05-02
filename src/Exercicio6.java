import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperaturaCelsius;
        System.out.println("Digite a temperatura em Celsius: ");
        temperaturaCelsius = sc.nextDouble();
        converteCelsiuEmFahrenheit(temperaturaCelsius);
    }
    public static void converteCelsiuEmFahrenheit(double temperaturaCelsius){
        double temperaturaFahrenheit = ((9*temperaturaCelsius)+160)/5;
        System.out.println("A temperatura "+temperaturaCelsius+" em Celsius convertida pra Fahrenheit é: "+temperaturaFahrenheit);
    }
}
