package filoteam;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * classe que implementa o algoritmo de caminho de custo minimo de dikstra
 */
public class Dijkstra {

	public HashMap<Vertice, Integer> vertices = new HashMap<Vertice, Integer>();

	private Grafo grafo;
	private ArrayList<Vertice> grafoVertices;

	public Dijkstra(Grafo grafo) {
		this.grafo = grafo;
	}

	public int caminoCostoMinimo(Vertice inicial, Vertice destino) {
		grafoVertices = grafo.vertices();
		for (int i = 0; i < grafo.orden(); i++) { // inicializacao da lista
			vertices.put(grafoVertices.get(i), Integer.MAX_VALUE);
		}

		vertices.put(inicial, 0); // vertice inicial = 0

		int peso, pesoVertice;
		Vertice auxVertice;
		HashMap<Vertice, Arista> aristas = null;
		Object[] adjacentes;
		do {
			auxVertice = getMenor();
			auxVertice.setDatos("CERRADO");
			aristas = auxVertice.getAdyacentes();
			adjacentes = auxVertice.getAdyacentes().keySet().toArray();

			pesoVertice = vertices.get(auxVertice);
			for (int i = 0; i < aristas.size(); i++) {
				peso = aristas.get(adjacentes[i]).getPeso();
				//System.out.println("adj: " + vertices.get((Vertice)adjacentes[i]));

				if ((pesoVertice + peso) < vertices.get((Vertice)adjacentes[i])) {
					vertices.put((Vertice) adjacentes[i], pesoVertice + peso);
				}
			}

		} while (isCerrado() == false);

		return vertices.get(destino);

	}

	/**
	 * retorna o vertice com menor caminho anotado
	 */
	private Vertice getMenor() {
		Integer menor = Integer.MAX_VALUE;
		Integer aux;
		Vertice vertMenor = null;

		for (int i = 0; i < grafo.orden(); i++) {
			aux = vertices.get(grafoVertices.get(i));
			if (aux <= menor && grafoVertices.get(i).getDatos().equals("") == true) {
				menor = aux;
				vertMenor = grafoVertices.get(i);
			}
		}

		return vertMenor;
	}

	/**
	 * retorna true se o algoritmo ja fechou todos os vertices
	 */
	private boolean isCerrado() {
		for (int i = 0; i < grafo.orden(); i++) {
			if (!grafoVertices.get(i).getDatos().equals("CERRADO")) {
				return false;
			}
		}
		return true;
	}

}
