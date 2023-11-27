public class AlunoController {

    private Aluno model;
    private AlunoView view;

    public AlunoController(Aluno model, AlunoView view){
        this.model = model;
        this.view = view;
    }

    public void setNomeDoAluno(String nome){
        model.setNome(nome);
    }
    public void setMatriculaDoAluno(String matricula){
        model.setNome(matricula);
    }

    public String getNomeDoAluno(){
        return model.getNome();
    }
    public int getMatriculaDoAluno(){
        return model.getMatricula();
    }

    public void updateView(){
        view.exibeInfosDoAluno(model.getNome(), model.getMatricula());
    }

}
