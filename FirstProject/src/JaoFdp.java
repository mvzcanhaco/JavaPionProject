public class JaoFdp {
	private String xingamento = "João Paulo filho da puta";
	private int quantidadeDeXingamentos;
	
	public JaoFdp(int quantidade) {
		this.quantidadeDeXingamentos = quantidade;
	}
	
	public void xingar(){
		for (int i = 0; i < this.quantidadeDeXingamentos; i++){
			System.out.println(this.xingamento);			
		}
		
		System.out.println("\nLegal! Você xingou o escroto do João " + quantidadeDeXingamentos + " vezes. Parabéns!");
	}
}
