package aula2;

	public class Pessoa {// atributos
		public String nome;
		public double cpf;
		public int rg;
		
		public Pessoa(String nomes, double cpfs, int rgs){//construtores
			this.nome = nomes;
			this.cpf = cpfs;
			this.rg = rgs;
			
		}
		@Override
			public String toString() {
		
				return nome+cpf+rg;			}
		
	

	
	}