package alunoteste;

import java.util.ArrayList;
import java.util.List;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Taris", "20210011", "STI", 6, 6.0, 5.0);
        Aluno a2 = new Aluno("Maria", "20210012", "STI", 8, 9, 4.5);

        List<Aluno> alunosList = new ArrayList<Aluno>();
        alunosList.add(a1);
        alunosList.add(a2);

        Turma t = new Turma();
        t.setNome("STI31");
        t.setAlunos(alunosList);

        System.out.println("Nome da Turma: " + t.getNome() + "\n\nAlunos: ");

        for (Aluno a : alunosList) {
            a.printAluno();
            a.alunoAprovado();
        }

    }

}
