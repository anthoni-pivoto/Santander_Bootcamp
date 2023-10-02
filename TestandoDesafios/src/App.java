import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        
        double valorFinal = calcularJuros(valorInicial,taxaJuros,periodo);

        String result = String.format("%.2f", valorFinal);

        System.out.println("Valor final do investimento: R$ " + result);
    
        scanner.close();
    }
    static double calcularJuros(double valor1, double taxa, int anos){
      for(int i = 0; i < anos;i++){
        valor1 = valor1 +(valor1*taxa);
      }
      return valor1;
    }
}