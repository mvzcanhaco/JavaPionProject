public class JaoFdp {
	private String xingamento = "Jo�o Paulo filho da puta";
	private int quantidadeDeXingamentos;
	
	public JaoFdp(int quantidade) {
		this.quantidadeDeXingamentos = quantidade;
	}
	
	public void xingar(){
		for (int i = 0; i < this.quantidadeDeXingamentos; i++){
			System.out.println(this.xingamento);			
		}
		
		System.out.println("\nLegal! Voc� xingou o escroto do Jo�o " + quantidadeDeXingamentos + " vezes. Parab�ns!");
	}
}
