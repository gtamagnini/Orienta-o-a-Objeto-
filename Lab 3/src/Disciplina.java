
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private List<Professor> professores; // Agregação

    public Disciplina(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    
}
