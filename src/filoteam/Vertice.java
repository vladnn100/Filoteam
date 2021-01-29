package filoteam;

import java.util.HashMap;

/**
 * classe que representa um vertice e suas conex�es (sucessores e antecessores)
 */
public class Vertice {

	private String nombreVertice; // Nome de identifica��o do vertice
	private PlantaCafe plantaCafe;
	private int id;
	private HashMap<Vertice, Arista> adjacentes = new HashMap<Vertice, Arista>();
	private String datos; // Dados adicionais que podem ser inseridos para
							// algoritmos personalizados

	public Vertice(PlantaCafe plantacafe, int id) {
		this.plantaCafe = plantacafe;
		this.nombreVertice = plantacafe.getNombre();
		this.id = id;
		datos = "";
	}

	public void adicionarArista(Arista aresta, Vertice destino) {
		if (!Grafo.exists(destino))
			System.out.println("Vertice no mapeado.");
		else if (!adjacentes.containsKey(destino))
			adjacentes.put(destino, aresta);
		else
			System.out.println("Arista ya existe.");
	}

	public void removerArista(Vertice vertice) {
		if (!adjacentes.containsKey(vertice)) {
			System.out.println("Vertice no mapeado.");
			return;
		}
		adjacentes.remove(vertice);
	}

	public void setNombreVertice(String vertice) {
		this.nombreVertice = vertice;
	}

	public String getNombreVertice() {
		return nombreVertice;
	}

	public HashMap<Vertice, Arista> getAdyacentes() {
		return adjacentes;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public String toString() {
		return nombreVertice + "-" + id;
	}
}
