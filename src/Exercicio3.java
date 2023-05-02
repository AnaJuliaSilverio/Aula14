import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeUsuario;
        double peso,altura;
        System.out.println("Digite seu nome: ");
        nomeUsuario = sc.next();
        System.out.println(nomeUsuario+" ,digite seu peso :");
        peso = sc.nextDouble();
        System.out.println(nomeUsuario+" ,agora digite sua altura :");
        altura = sc.nextDouble();
        classificacaoIMC(peso,altura);
    }
    public static void classificacaoIMC(double peso,double altura){
        double imc = peso/(altura*altura);
        String classificao;

        if (imc<18.5){
            classificao="magreza";
        }
        else if(18.5<imc && imc<24.9){
            classificao ="normal";
        }
        else if(25<imc && imc<29.9){
            classificao="sobrepeso";
        }
        else if (30<imc && imc<39.9) {
            classificao = "obesdidade";
        }
        else {
           classificao= "obesidade grave";
        }
        System.out.printf("Segundo seu peso de: %.2f e sua altura de %.2f, seu IMC é %.2f.E sua classicao é :%s\n",peso,altura,imc,classificao);
    }
}
