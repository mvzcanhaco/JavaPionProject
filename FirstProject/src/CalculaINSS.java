public class CalculaINSS {
    private double salario;
    private final double teto = 513.01;
    
    public CalculaINSS(double salario) {
        this.salario = salario;
    }
    
    public double valorINSS(){
        if (this.salario > 4663.75){
            return teto;
        } else if(this.salario > 2331.88){
            return this.salario * 0.11;
        } else if(this.salario > 1399.12){
            return this.salario * 0.09;
        } else
            return this.salario * 0.08;
    }
}
