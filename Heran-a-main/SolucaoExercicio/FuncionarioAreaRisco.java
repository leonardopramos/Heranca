public class FuncionarioAreaRisco extends Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String categoriaRisco;
    
    public FuncionarioAreaRisco(String matricula, String nome, String categoriaRisco,double salarioBruto){
        super (matricula, nome, salarioBruto);
        this.categoriaRisco = categoriaRisco;
    }
    public String getCategoriaRisco(){
        return this.categoriaRisco;
    } 

    @Override
    public double getImpRenda(){
        double adicional = (super.getSalarioBruto() - getINSS())*0.25;
        double novoSB = super.getSalarioBruto() + adicional;
        if (novoSB <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = novoSB - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }
    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Categoria de risco: " + getCategoriaRisco() + "\n";
        aux += "--------------";
        return aux;

    }
}