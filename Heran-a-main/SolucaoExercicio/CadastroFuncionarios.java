import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<FuncionarioAreaRisco> funcionariosAR;
    private ArrayList<Pesquisador> pesquisadores;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("A3212","Huguinho Pato",1890.0));
        funcionarios.add(new Funcionario("A3312","Zezinho Pato",3720.0));
        funcionarios.add(new Funcionario("A3412","Luizinho Pato",8940.0));
        funcionarios.add(new Funcionario("B9931","Lala Pata",4220.0));
        funcionarios.add(new Funcionario("B9932","Lele Pata",1283.0));
        funcionarios.add(new Funcionario("B9933","Lili Pata",12438.0));
        
        funcionariosAR.add(new FuncionarioAreaRisco("AR01", "Ze","Area01", 16200.0));
        funcionariosAR.add(new FuncionarioAreaRisco("AR02", "Amigo do Ze","Area14", 3990.0));
        funcionariosAR.add(new FuncionarioAreaRisco("AR03", "Prima do Ze","Area07", 12445.0));

        pesquisadores.add(new Pesquisador("P01","Arnaldo Pesq",12000,3));
        pesquisadores.add(new Pesquisador("P02","Cataldo Pesq",12000,2));
        pesquisadores.add(new Pesquisador("P03","Adroaldo Pesq",12000,1));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        funcionariosAR = new ArrayList<>();
        pesquisadores = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void cadastraFuncionario(FuncionarioAreaRisco funcionario){
        funcionariosAR.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        System.out.println("["+matricula+"]");
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }

    public FuncionarioAreaRisco recuperaPorMatriculaAR(String matricula){
        System.out.println("["+matricula+"]");
        for(FuncionarioAreaRisco func:funcionariosAR){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }

    public Pesquisador recuperaPorMatriculaPesq(String matricula){
        System.out.println("["+matricula+"]");
        for(Pesquisador pesq:pesquisadores){
            if (pesq.getMatricula().equals(matricula)){
                return pesq;
            }
        }
        return null;
    }
}