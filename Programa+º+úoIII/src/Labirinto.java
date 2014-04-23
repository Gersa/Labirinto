import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto extends Posicao {
	private static final String FILE = "C:\\Users\\Gersã\\Documents\\Labirinto\\labirinto.txt";
	Posicao posicao[][];

	public void carregarLabirinto() {
// lê o arquivo de texto definindo altura e largura do labirinto nos get e set.
		int altura = 1;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(FILE));
			String linha = in.readLine();
			while (linha != null) {
				altura++;
				setAltura(altura);
				setLargura(linha.length() +1);
				linha = in.readLine();
			}
			in.close();

		} catch (IOException e) {
			Execoes.erroCarregarLabirinto(
					"[ERRO] Problema ao carregar o arquivo", e);
		}
	}
	// grava a posição dos caracteres no vetor 
	public Posicao[][] gravarDadosLabirinto() {
		this.posicao = new Posicao[getLargura()][getAltura()];
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(FILE));
			String linha = in.readLine();
			int j = 0;
			for (int i = 0; i < getAltura() -1; i++) {
				posicao[j][i] = new Posicao();
				posicao[j][i].setj(i);
				
				for (j = 0; j < getLargura()-1; j++) {
					posicao[j][i] = new Posicao();
					posicao[j][i].setj(i);
					posicao[j][i].setElemento(linha.charAt(i));
					posicao[j][i].setElemento(linha.charAt(j));
				}
				linha = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return posicao;
	}
	//imprime o labirinto com suas posições
	public boolean mostrarLabirinto(Posicao posicao[][]) {
		for (int y = 0; y < getAltura() - 1; y++) {
			for (int x = 0; x < getLargura() - 1; x++) {
				System.out.print(posicao[x][y].getElemento());
			}
			System.out.print("\n");
		}
		return true;
	}
}