
public class Pesquisador extends Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private int catEsp;
    
    public Pesquisador(String matricula, String nome, double salarioBruto,int catEsp){
        super(matricula, nome, salarioBruto);
        if (catEsp < 0 || catEsp > 3){
            catEsp = 1;
        }
        this.catEsp = catEsp;
    }
    public int getCatEsp(){
        return catEsp;
    }

    public void setCatEsp(int catEsp){
        if (catEsp < 1 || catEsp > 3){
            return;
        }else{
            this.catEsp = catEsp;
        }
    }
    @Override
    public double getSalarioLiquido(){
        double aux = super.getSalarioBruto() - getINSS() - getImpRenda();
        switch(this.catEsp){
            case 1:
              aux = aux * 1.05;
              break;
            case 2:
              aux = aux * 1.2;
              break;
            case 3:
              aux = aux * 1.3;
              break;
        }
        return aux;
    }
    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Saláio líquido: "+ this.getSalarioLiquido() + "\n";
        aux += "-------------" + "\n";
        return aux;
    }
}