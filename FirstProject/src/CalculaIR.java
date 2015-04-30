public class CalculaIR {
    private double salario;
    private double inss;

    public CalculaIR(double salario) {
        this.salario = salario;
        CalculaINSS calculainss = new CalculaINSS(salario);
        this.inss = calculainss.valorINSS();
    }
    
    public double irMensal(){
        double redutor;
        double valorIR;
        this.salario = this.salario - this.inss;
        
        if (this.salario > 4463.81){
            redutor = 826.15;
            valorIR = (this.salario * 0.275) - redutor;
        } else if (this.salario > 3572.43){
            redutor = 602.96;
            valorIR = (this.salario * 0.225) - redutor;
        } else if (this.salario > 2679.29){
            redutor = 335.03;
            valorIR = (this.salario * 0.15) - redutor;
        } else if (this.salario > 1787.77){
            redutor = 134.08;
            valorIR = (this.salario * 0.075) - redutor;
        } else
            valorIR = 0;
        
        return valorIR;
    }
    
    public String toString(){
    	return "Seu salário: " + this.salario + "\n" +
    	"INSS mensal: " + this.inss + "\n" +
    	"Imposto de renda mensal: " + irMensal();
    }
}
