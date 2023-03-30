package projetoaluno;

public class TestaAluno {

    public static void main(String[] args) {
        Pessoa jose = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
        System.out.print("Dados da Pessoa: ");
        jose.imprimePessoa();

        Aluno pedro = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2",
                59751, 4.5, 8.0, 10);

        System.out.println("\nDados:");
        pedro.ImprimeAluno();
        pedro.ImprimeFaltas();
        pedro.resultado();


        Aluno francisco = new Aluno(pedro);
        francisco.setNome("Francisco");
        francisco.setNotaP1(9.0);
        francisco.setNotaP2(9.5);

        System.out.println("\nDados do novo Aluno: ");
        francisco.ImprimeAluno();
        francisco.ImprimeFaltas();
        francisco.resultado();

        francisco.setFaltas(11);
        System.out.println("\nResultado Faltas: ");
        francisco.resultado();

        francisco.setNotaP1(8.0);
        francisco.setNotaP2(9.5);
        System.out.println("\nResultado notas: ");
        francisco.resultado();
    }

}
