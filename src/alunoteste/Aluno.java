package alunoteste;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, String curso, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double mediaAluno() {
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;
    }

    public void alunoAprovado() {
        if (mediaAluno() >= 6) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    public void printAluno() {
        System.out.println(
                "\nNome: " + nome +
                        "\nMatricula: " + matricula +
                        "\nCurso: " + curso +
                        "\nMédia: " + mediaAluno());
    }

}
