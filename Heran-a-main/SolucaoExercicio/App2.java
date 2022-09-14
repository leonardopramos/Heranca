import java.util.ArrayList;

public class App2 {
    
    public static void imprimeFuncionario(Funcionario f){
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salario: " + f.getSalarioLiquido());
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        
        FuncionarioAreaRisco fr = new FuncionarioAreaRisco("2202321", "Alexandre", "Cadeirante", 9999999.0);
        System.out.println(fr);

        Pesquisador ps = new Pesquisador("39042230", "Fabricio", 5748.0, 5);
        System.out.println(ps);

        FuncionarioComum f = new FuncionarioComum("23423534", "Roberto", 1500.0);

        imprimeFuncionario(f);
        imprimeFuncionario(ps);

        ArrayList<Funcionario> lst = new ArrayList<>();

        lst.add(fr);
        lst.add(ps);
        lst.add(f);
        lst.add(new Funcionario("239048092", "Marcelo", 23905834));

        for(Funcionario fn: lst){
            imprimeFuncionario(fn);
        }
    }
}
