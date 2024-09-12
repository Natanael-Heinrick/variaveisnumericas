import java.util.Locale;

public class Main{
    public static void main(String[] args){
        //DECLARAÇÃO DE VARIÁVEIS NUMÉRICAS
        //-----------------------------------------------------------
        //VARIÁVEL DO TIPO INTEIRA

        int primeiraVariavel = 5;
        System.out.println("A primeira variável declarada, que apresenta o tipo inteiro: " + primeiraVariavel);

        // VARIÁVEL DO TIPO DOUBLE, SEM FORMATAÇÃO
        double segundaVariavel = 10.489454652;
        System.out.println("A segunda variável declarada, sem ter alguma formatação será: " + segundaVariavel);

        // VARIÁVEL DO TIPO DOUBLE, COM FORMATAÇÃO
        double terceiraVariavel = 25.56441321;
        System.out.printf("%.4f%n", terceiraVariavel);

        // VARIÁVEL DO TIPO DOUBLE, COM FORMATAÇÃO E APRESENTANDO VÍRGULA
        double quartaVariavel = 34.8546845412;
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", quartaVariavel);

        //CONCATENANDO VARIÁVEIS DENTRO DE UMA STRING
        String nome = "Fernando";
        int idade = 20;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais como aprendiz%n", nome, idade, renda);
    }
}
