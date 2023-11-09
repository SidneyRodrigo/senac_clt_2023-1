package classes;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        PessoaIMC[] pessoas = new PessoaIMC[tamanho];

        for (int i = 0; i <tamanho; i++) {
            System.out.print("Digite o tipo de objeto (H para Homem, M para Mulher): ");
            String tipo = scanner.next();

            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite a data de nascimento: ");
            String dataNascimento = scanner.next();

            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            if (tipo.equalsIgnoreCase("H")) {
                pessoas[i] = new Homem(nome, dataNascimento, peso, altura);
            } else if (tipo.equalsIgnoreCase("M")) {
                pessoas[i] = new Mulher(nome, dataNascimento, peso, altura);
            }
        }

        for (PessoaIMC pessoa : pessoas) {
            System.out.println(pessoa.toString());
            System.out.println("Resultado IMC: " + pessoa.resultIMC());
            System.out.println();
        }
    }
}
