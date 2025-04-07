import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Crie uma lista para armazenar o nome de alunos
        -Adicione pelo menos 5 nomes
        -Remova um nome específico
        -Exiba a lista completa
        -Informe quantos alunos restaram na lista*/

        Scanner scan = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        System.out.print("Digite o nome de 5 alunos: ");
        for(int i = 0; i < 5; i++){
            String nome = scan.nextLine();
            listaNomes.add(nome);
        }
        System.out.print("Qual nome deseja remover? ");
        String removerNome = scan.nextLine();
            listaNomes.remove(removerNome);

            System.out.println("A lista com o nome removido é: " + listaNomes);

            System.out.println("Restaram " + listaNomes.size() + " nomes na lista.");


    }
}