package calculadora1;
import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite + para soma, - para subtração, * para multiplicação, / para divisão");
        String op = scanner.next();
        System.out.println("Digite o 1° número");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o 2° número");
        double num2 = scanner.nextDouble();
        
        double resp = calcular(num1, num2, op);
        
        System.out.println("O resultado é: " + resp);
    }
    
    public static double calcular(double num1, double num2, String op) {
        double resultado = 0;
        
        if (op.equalsIgnoreCase("+")) {
            resultado = num1 + num2;
        } else if (op.equalsIgnoreCase("-")) {
            resultado = num1 - num2;
        } else if (op.equalsIgnoreCase("*")) {
            resultado = num1 * num2;
        } else if (op.equalsIgnoreCase("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero!");
                return 0;
            }
        } else {
            System.out.println("Operador inválido!");
        }
        
        return resultado;
    }
}
    

