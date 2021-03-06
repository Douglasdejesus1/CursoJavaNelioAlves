package entities;

public class Funcionarios {

	private Integer id;
	private String nome;
	private Integer ch;
	private Double valorhora;
	public Funcionarios(Integer id, String nome, Integer ch,  Double valorhora) {
		
		this.id = id;
		this.ch = ch;
		this.nome = nome;
		this.valorhora = valorhora;
	}
	public Integer getCh() {
		return ch;
	}
	public void setCh(Integer ch) {
		this.ch = ch;
	}
	public Double getValorhora() {
		return valorhora;
	}
	public void setValorhora(Double valorhora) {
		this.valorhora = valorhora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	
	public double salario() {
		return ch*valorhora;
	
	}
	public String toString() {
		return id+", "+nome+", R$"+String.format("%.2f",salario());
	}

}
