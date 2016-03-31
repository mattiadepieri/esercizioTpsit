
public class Materia {
	private String nome;
	private int classe;
	private int durata;
	
	/**
	 * metodo costruttore.
	 */
	public Materia() {
	}
	/**
	 * Metodo che ritorna il nome dell'oggetto richiamato.
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo che cambia il nome dell'oggetto richiamato con il parametro immesso.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
