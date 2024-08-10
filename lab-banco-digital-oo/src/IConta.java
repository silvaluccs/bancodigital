
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);

	void enviarPix(double valor, String chave;

	void receberPix(double valor);
	
	void imprimirExtrato();
}
