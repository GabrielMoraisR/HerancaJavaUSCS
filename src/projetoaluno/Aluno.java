package projetoaluno;

public class Aluno extends Pessoa {

    public int matricula;
    public double notaP1;
    public double notaP2;
    public int faltas;

    private static final int LIMITE_FALTAS = 10;
    private static final double MEDIA_APROVACAO = 7.0;
    private static final double MEDIA_REPROVACAO = 3.0;

    
    public Aluno(Aluno pedro){}

    public Aluno(String nome, String endereco, String cpf, String rg, int matricula, double notaP1, double notaP2, int faltas) {
        super(nome, endereco, cpf, rg);
        this.matricula = matricula;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.faltas = faltas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void ImprimeAluno() {
        super.imprimePessoa();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota P1: " + notaP1);
        System.out.println("Nota P2: " + notaP2);
        System.out.println("Faltas: " + faltas);
    }

    public double calculaMedia() {
        return (notaP1 + notaP2) / 2;

    }

    public void ImprimeFaltas() {
        System.out.println("Total de faltas: " + faltas);
    }

    public void resultado() {
        double media = calculaMedia();
        if (faltas > LIMITE_FALTAS) {
            System.out.println("Reprovado por faltas");
        } else if (media >= MEDIA_APROVACAO) {
            System.out.println("Aprovado");
        } else if (media < MEDIA_REPROVACAO) {
            System.out.println("Reprovado por nota");
        } else {
            System.out.println("Em exame");
        }
    }

}
