public class Teste {
    public static void main(String[] args) {

        Aluno model = recuperaAlunoDoDB();
        AlunoView view = new AlunoView();
        AlunoController controller = new AlunoController(model, view);

        controller.updateView();
    }

    private static Aluno recuperaAlunoDoDB(){
        Aluno aluno = new Aluno();
        aluno.setNome("Sam");
        aluno.setMatricula(123);
        return aluno;
    }
}