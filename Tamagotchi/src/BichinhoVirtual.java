import javax.swing.JOptionPane;

public class BichinhoVirtual {

	private String nome;
	private double statusEstomago, saude; 
	private int idade, tamanhoEstomago;

	BichinhoVirtual(){
		
	}

        void novoBichinho(){
            this.nome = JOptionPane.showInputDialog("Qual o nome do Bichinho?");
		setIdade(0);
		setEstomago(100);
		setSaude(100);
		mostraResumo();
        }
        
	void setNome(String nome) {
		this.nome = nome;
	}

	String getNome() {
		return this.nome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	int getIdade() {
		return this.idade;
	}

	void setEstomago(int tamanhoEstomago) {
		this.tamanhoEstomago = tamanhoEstomago;
	}

	double getEstomago() {
		return this.tamanhoEstomago;
	}

	void setSaude(double saude) {
		// Valores variam de 0 a 100 (%)
		this.saude = saude;
	}

	double getSaude() {
		return this.saude;
	}

	void comer(double alimento) {
		// recebe um double alimento que preenche um espa�o vazio no tamanhoEstomago.

		if (this.statusEstomago < this.tamanhoEstomago) {
			if ((alimento + this.statusEstomago) > this.tamanhoEstomago) {
				this.statusEstomago = this.tamanhoEstomago;
			} else {
				this.statusEstomago += alimento;
			}
		} else {
			JOptionPane.showMessageDialog(null, nome + " est� com a barriga cheia!");
		}
	}

	void digestao (int digerido){
		this.statusEstomago -= digerido;
	}

	void mostraResumo (){
		JOptionPane.showMessageDialog(null, 
				"Nome: " + nome +
				"\nIdade: " + idade +
				"\nSaúde: " + saude +
				"\nTamanho do estômago: " + tamanhoEstomago +
				"\nStatus do estômago: " + statusEstomago);


	}
}
