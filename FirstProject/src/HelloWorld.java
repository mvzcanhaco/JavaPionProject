
public class HelloWorld {
	   public static void main(String[] args) {

		     System.out.println("Hello World! AEEEE CARALHO");
		     
		     // construtor da classe = 20. Coloque aqui a quantidade de vezes que o João será xingado
		     JaoFdp teste = new JaoFdp(20);
		     
		     teste.xingar();
		     
		     //brincadeira mais séria
		     System.out.print("\n");
		     CalculaIR calculoImposto = new CalculaIR(3000);
		     System.out.println(calculoImposto);
		     
		     System.out.print("\n");
		     
		     ResolucaoTela resolucao = new ResolucaoTela();
		     System.out.println(resolucao);
		   }

}
