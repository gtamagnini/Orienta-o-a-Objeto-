
package main;

class Main {

    public static void main(String[] args) {
        Professor prof1 = new Professor("José", "Ciências");
        Professor prof2 = new Professor("Maria", "Matemática");

        Disciplina disciplina1 = new Disciplina("D001", "Física");
        disciplina1.addProfessor(prof1);

        Disciplina disciplina2 = new Disciplina("D002", "Cálculo");
        disciplina2.addProfessor(prof1);
        disciplina2.addProfessor(prof2);

        Aluno aluno1 = new Aluno("João", "123456", "Engenharia");
        aluno1.matricular(disciplina1);
        aluno1.matricular(disciplina2);

        System.out.println(aluno1.getNome() + " está matriculado nas seguintes disciplinas:");
        for (Disciplina disciplina : aluno1.getDisciplinas()) {
            System.out.println(disciplina.getNome());
            System.out.println("Professores:");
            for (Professor professor : disciplina.getProfessores()) {
                System.out.println(professor.getNome());
            }
            System.out.println("---------------");
        }
    }
}



