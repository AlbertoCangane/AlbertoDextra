package aula2;

public class Ponto {
	
	double x =  0.0;
	double y;
	
	public Ponto(double  coordX, double coordY){
		this.y = coordX;
		this.x = coordY;
	}
	
	public Ponto (double coordX){
		y = coordX;
		y = 0;
	}
	public void deslocar (double deltax, double deltay){
		x +=deltax;
		y +=deltay;
	}
	public void zerar(){
		x=0;
		y=0;
	}
	//exemplo de metodo de retorno

	public boolean isYMenorQueZero(){
		if (y < 0)
			return true;
		return false;
	}
}
