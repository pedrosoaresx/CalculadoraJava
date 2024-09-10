import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bem vindo a nossa calculadora de operações simples!");
        //Lendo o primeiro valor
        System.out.println("Digite o primero valor:");
        double number1 = input.nextDouble();
        // Consumir a quebra de linha pendente após o nextInt()
        input.nextLine();
        // Lendo a operação a ser realizada
        System.out.println("Qual operação deseja realizar (+ - * /):");
        String operacao = input.nextLine();
        // Lendo o segundo valor
        System.out.println("Digite o segundo valor:");
        double number2 = input.nextDouble();
        // Realizando as operações
        switch (operacao) {//Utilizando o switch no lugar do else-if, tornado o código mais limpo
            case "+" -> soma(number1, number2);
            case "-" -> sub(number1, number2);
            case "*" -> multiplica(number1, number2);
            case "/" -> {
                if (number2 != 0) {
                    div(number1, number2);
                } else {
                    System.out.println("Erro: Não é possivél divisão por zero");
                }
            }//Tratando possivél erro de entrada
            default -> System.out.println("ERRO: Operação inexistente!");
        }
        input.close();
    }
    //Criando métodos para as operações
    public static void soma(double x, double y){
        System.out.println("Resultado = " + (x + y));
    }

    public static void sub(double x, double y){
        System.out.println("Resultado = " + (x - y));
    }

    public static void multiplica(double x, double y){
        System.out.println("Resultado = " + (x * y));
    }

    public static void div(double x, double y){
        System.out.println("Resultado = " + (x / y));
    }
}
