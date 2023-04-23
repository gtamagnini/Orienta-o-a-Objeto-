package lab_8;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; // importando pacote de arquivo

public class Agenda {
    private static final String ARQUIVO_AGENDA = "agenda.txt";
    private static final String SEPARADOR_CAMPOS = ";";

    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String opcao = "";
 
    }
      // Carrega os contatos do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_AGENDA)))
    private String ARQUIVO_AGENDA;
    private String SEPARADOR_CAMPOS;

{
            String linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(SEPARADOR_CAMPOS);
                String nome = campos[0];
                String telefone = campos[1];
                int id = Integer.parseInt(campos[2]);
                Pessoa pessoa = new Pessoa(nome, telefone, id);
                agenda.add(pessoa);
                linha = br.readLine();
            }
            System.out.println("Agenda carregada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de agenda: " + e.getMessage());
        }

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

                // Salva a pessoa no arquivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_AGENDA, true))) {
                    String linha = pessoa.getNome() + SEPARADOR_CAMPOS + pessoa.getTelefone() + SEPARADOR_CAMPOS + pessoa.getId();
                    bw.write(linha);
                    bw.newLine();
                    System.out.println("Pessoa salva no arquivo de agenda!");
                } catch (IOException e) {
                    System.out.println("Erro ao salvar a pessoa no arquivo de agenda: " + e.getMessage());
                }

            } else if (opcao.equals("d")) {
                System.out.println("Entre com o nome da pessoa que deseja excluir:");
                String nome = input.nextLine();
                boolean pessoaEncontrada = false;
                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).getNome().equals(nome)) {
                        agenda.remove(i);
                        pessoaEncontrada = true;
                        System.out.println("Pessoa excluída com sucesso!");

                        // Atualiza o arquivo
}
