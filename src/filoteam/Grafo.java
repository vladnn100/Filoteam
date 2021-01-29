package filoteam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

/**
 * classe que representa um grafo generico
 */
public class Grafo {

	private static ArrayList<Vertice> vertices;
	private ArrayList<Vertice> clausuraTransitiva, yaVisitados, arbolVisitado;
	public Grafo() {
		vertices = new ArrayList<Vertice>();
	}

	// Opera��es b�sicas em grafos
	public void adicionarVertice(Vertice vertice) {
		if (!vertices.contains(vertice)) {
			vertices.add(vertice);
			return;
		}
		System.out.println("Valor de vertice ja existente no grafo! -> "
				+ vertice.toString());
	}

	public void removerVertice(Vertice vertice) {
		if (vertices.contains(vertice)) {
			vertices.remove(vertice);
			for (Vertice vAdj : vertice.getAdyacentes().keySet())
				vertice.removerArista(vAdj);
		}
		System.out.println("Valor de vertice inv�lido! -> "
				+ vertice.toString());
	}

	public void conecta(Vertice v1, Vertice v2, Arista aresta) {
		if (!v1.getAdyacentes().containsKey(v2)){
			v1.adicionarArista(aresta, v2);
			v2.adicionarArista(aresta, v1);	
		}
		else
			System.out.println("Aresta " + v1.toString() + "-" + v2.toString() + "j� existe.");
		
	}

	public void desconecta(Vertice v1, Vertice v2) {
		if (v1.getAdyacentes().containsKey(v2)) {
			v1.removerArista(v2);
			v2.removerArista(v1);
		}
		else 
			System.out.println("N�o � poss�vel remover aresta inexistente.");
	}

	public int orden() {
		return vertices.size();
	}

	public ArrayList<Vertice> vertices() {
		return vertices;
	}

	public Vertice unVertice() {
		Random random = new Random();
		return vertices.get(random.nextInt(vertices.size()));
	}

	public Set<Vertice> adyacentes(Vertice v) {
		return v.getAdyacentes().keySet();
	}

	public int grado(Vertice v) {
		return v.getAdyacentes().size();
	}

	// A��es derivadas
	private boolean isRegular() {

		int grado = grado(vertices.get(0));
		int grauTestado;
		for (Vertice v : vertices) {
			grauTestado = grado(v);
			if (grauTestado != grado)
				return false;
		}
		return true;
	}
	
	private boolean isCompleto() {
		
		int n =  orden() - 1;
		for (Vertice v : vertices) {
			if (grado(v) != n)
				return false;
		}
		return true;
	}
	
	private ArrayList<Vertice> clausuraTransitiva(Vertice v) {
		clausuraTransitiva =  new ArrayList<Vertice>();
		yaVisitados =  new ArrayList<Vertice>();
		return busquedaCerradaTransitiva(v);
	}
	
	private ArrayList<Vertice> busquedaCerradaTransitiva(Vertice v) {
		yaVisitados.add(v);
		for (Vertice vAdj : adyacentes(v)) {
			if (!yaVisitados.contains(vAdj))
				busquedaCerradaTransitiva(vAdj);
			if (!clausuraTransitiva.contains(vAdj))
				clausuraTransitiva.add(vAdj);
		}
		return clausuraTransitiva;
	}
	
	private boolean isConexo() {
		
		boolean valorVerdade = false;
		for (Vertice v : vertices) {
			if (clausuraTransitiva(v).size() == orden())
				valorVerdade = true;
			else {
				valorVerdade = false;
				break;
			}
		}
		return valorVerdade;
	}
	
	private boolean isArbol() {
		Vertice v = unVertice();
		arbolVisitado = new ArrayList<Vertice>();
		return (isConexo() && !hayCiclo(v, v));
	}

	private boolean hayCiclo(Vertice v, Vertice vAnterior) {
		
		if (arbolVisitado.contains(v))
			return true;
		
		arbolVisitado.add(v);
		for (Vertice vAdj : adyacentes(v)) {
			if (vAdj != vAnterior)
				if (hayCiclo(vAdj, v))
					return true;
		}
			
		return false;
	}
	
	// M�todos auxiliares
	public String toString() {
		return vertices.toString();
	}
	
	public String toString_info() 
	{
		String ret = "";
		ret += "Grafo\n";
		ret += "Vertices: \n";
		for ( Vertice v : vertices) ret += "\t" + v + "\n";
		ret += "Aristas: \n";
		for ( Vertice v : vertices ) ret += "\t" + v + " -> " + adyacentes(v).toString() + "\n";
		ret += "Orden: \n" + "\t" + orden() + "\n";
		ret += "Grado:  \n";
		for ( Vertice v : vertices) ret += "\t" + v + " -> "+ grado(v) + "\n";
		ret += "Regular: \n" + "\t" + isRegular() + "\n";
		ret += "Completo: \n" + "\t" + isCompleto() + "\n";
		ret += "Conexo: \n" + "\t" + isConexo() + "\n";
		ret += "Arbol: \n" + "\t" + isArbol() + "\n";
		ret += "Clausura Transitiva: \n";
		for ( Vertice v : vertices ) ret += "\t" + v + " -> " + clausuraTransitiva(v).toString() + "\n";
		
		return ret;
	}
	
	public static boolean exists(Vertice v) {
		if (vertices.contains(v)) 
			return true;
		return false;
	}

}
