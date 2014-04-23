public class Posicao {
	//guarda as posiçoes
	private int i;
	private int j;
	private char elemento;
	private int altura;
	private int largura;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int geti() {
		return i;
	}

	public void seti(int i) {
		this.i = i;
	}

	public int getj() {
		return j;
	}

	public void setj(int j) {
		this.j = j;
	}

	public char getElemento() {
		return elemento;
	}

	public void setElemento(char elemento) {
		this.elemento = elemento;
	}
}