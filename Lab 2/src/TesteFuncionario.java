public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Giovanna", "Borges", 5986.00);
        Funcionario funcionario2 = new Funcionario("Rafael", "Souza", 2010.00);

        System.out.println("Salario anual de " + funcionario1.getNome() + " " + funcionario1.getSobrenome() +
                ": R$ " + funcionario1.salarioAnual());
        System.out.println("Salario anual de " + funcionario2.getNome() + " " + funcionario2.getSobrenome() +
                ": R$ " + funcionario2.salarioAnual());

        funcionario1.aumentoSalario();
        funcionario2.aumentoSalario();

        System.out.println("Novo salario anual de " + funcionario1.getNome() + " " + funcionario1.getSobrenome() +
                ": R$ " + funcionario1.salarioAnual());
        System.out.println("Novo salario anual de " + funcionario2.getNome() + " " + funcionario2.getSobrenome() +
                ": R$ " + funcionario2.salarioAnual());
    }
}
