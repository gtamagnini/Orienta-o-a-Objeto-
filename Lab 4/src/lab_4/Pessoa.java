
package lab_4;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String telefone;
    private int id; //privado, mas não possui um método público de acesso, uma vez que seu valor é gerado automaticamente pelo construtor
    private static int proximoId = 1; // incrementa a cada nova instância de Pessoa

    public Pessoa(String nome, String telefone) { //A classe Pessoa possui as variáveis de instância nome, telefone e id. 
        //As primeiras duas são privadas e podem ser acessadas através dos métodos públicos getNome() e getTelefone()
        this.nome = nome;
        this.telefone = telefone;
        this.id = proximoId;
        proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {// para que seja impressa a informação
        return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", id=" + id + "]";
    }
}
