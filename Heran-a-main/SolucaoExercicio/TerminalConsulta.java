import java.util.Scanner;

public class TerminalConsulta {
    private CadastroFuncionarios cadastro;

    public TerminalConsulta() {
        cadastro = new CadastroFuncionarios();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Entre a matricula do funcionario (0=fim): ");
            String matricula = s.nextLine();
            if (matricula.equals("0")){
                break; // Quebra o while
            }
            Funcionario func = cadastro.recuperaPorMatricula(matricula);
            System.out.println("----------");
            if (func == null) {
                FuncionarioAreaRisco far = cadastro.recuperaPorMatriculaAR(matricula);
                if (far == null){
                    Pesquisador pesq = cadastro.recuperaPorMatriculaPesq(matricula);
                    if (pesq == null){
                        System.out.println("Funcionario nao encontrado !!");
                    }else{
                        System.out.println(pesq);
                    }
                }else{
                    System.out.println(far);
                }
            }else{
                System.out.println(func);
            }
            System.out.println("Digite qualquer tecla para continuar.\n");
            s.nextLine();
        }
        s.close();
    }
}