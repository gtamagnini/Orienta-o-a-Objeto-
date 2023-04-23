package lab_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
        Scanner input = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equals("q")) {
            System.out.println("Digite a opção desejada:");
            System.out.println("n - criar nova pessoa");
            System.out.println("d - deletar pessoa");
            System.out.println("p - imprimir toda a agenda");
            System.out.println("q - sair do programa");
            opcao = input.nextLine();

            if (opcao.equals("n")) {
                System.out.println("Entre com o nome:");
                String nome = input.nextLine();
                System.out.println("Entre com o telefone:");
                String telefone = input.nextLine();
                Pessoa pessoa = new Pessoa(nome, telefone);
                agenda.add(pessoa);
                System.out.println("Pessoa criada com sucesso!");
            } else if (opcao.equals("d")) {
                System.out.println("Entre com o nome da pessoa que deseja excluir:");
                String nome = input.nextLine();
                boolean pessoaEncontrada = false;
                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).getNome().equals(nome)) {
                        agenda.remove(i);
                        pessoaEncontrada = true;
                        System.out.println("Pessoa excluída com sucesso!");
                        break;
                    }
                }
                if (!pessoaEncontrada) {
                    System.out.println("Pessoa não encontrada!");
                }
            } else if (opcao.equals("p")) {
                System.out.println("Agenda:");
                for (Pessoa pessoa : agenda) {
                    System.out.println(pessoa.toString());
                }
            } else if (!opcao.equals("q")) {
                System.out.println("Opção inválida!"); // O programa Agenda possui um loop infinito que só é interrompido quando o usuário digita "q". 
                //A cada iteração do loop, é exibido um menu com as opções disponíveis e o usuário
            }
        }
        input.close();
    }
}
