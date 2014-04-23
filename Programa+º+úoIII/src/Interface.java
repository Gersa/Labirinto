public class Interface {
	public static void main(String[] args) {
		// chama os metodos que iniciam o progama.
		Labirinto labirinto = new Labirinto();
		labirinto.carregarLabirinto();
		labirinto.mostrarLabirinto(labirinto.gravarDadosLabirinto());
			System.out.println("");
		}
	}
