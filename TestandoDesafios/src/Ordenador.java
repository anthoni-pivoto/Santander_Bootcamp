import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenador{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> ativos = new ArrayList<>();

    int quantidadeAtivos = scanner.nextInt();

    for(int i = 0; i < (quantidadeAtivos+1); i++) {
        String proxAtivo = scanner.nextLine();
        ativos.add(proxAtivo);
        System.out.println(i);
    }
    Collections.sort(ativos);

    for(int i = 0; i < ativos.size(); i++){
        System.out.println(ativos.get(i));
    }
    scanner.close();
  }
}
