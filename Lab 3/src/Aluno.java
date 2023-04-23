
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String RA;
    private String curso;
    private List<Disciplina> disciplinas; // Composição

    public Aluno(String nome, String RA, String curso) {
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
    }

    public void matricular(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}

//A relação entre Aluno e Disciplina é de composição, porque um Aluno é composto por uma ou mais Disciplinas, e a relação entre Professor e Disciplina é de agregação, porque uma Disciplina pode ter vários Professores