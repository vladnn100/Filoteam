package filoteam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.List;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        /*String REPORTE_BORBON = "Reporte_Borbon.txt";
        String REPORTE_TIPICA = "Reporte_Tipica.txt";
        String REPORTE_CATURRA = "Reporte_Caturra.txt";
        String REPORTE_CRUCES = "Reporte_Cruces.txt";

        File Fborbon = new File(REPORTE_BORBON);
        File Ftipica = new File(REPORTE_TIPICA);
        File Fcaturra = new File(REPORTE_CATURRA);
        File Fcruces = new File(REPORTE_CRUCES);
        PrintWriter pw_borbon = new PrintWriter(new FileWriter(Fborbon));
        PrintWriter pw_tipica = new PrintWriter(new FileWriter(Ftipica));
        PrintWriter pw_caturra = new PrintWriter(new FileWriter(Fcaturra));
        PrintWriter pw_cruces = new PrintWriter(new FileWriter(Fcruces));
        //Creacion de Array Unidimensional de Listas    
        ListaEnlazada[] especies = new ListaEnlazada[3];
        //Creacion de Array Bidimensional 
        Arreglo bid= new Arreglo(3,4);
        //Mostrar experimentos
        bid.Mostrar();
        //Creación de Plantas
        Tipica tipica = new Tipica();
        Borbon borbon = new Borbon();
        MundoNovo mundoNovo = new MundoNovo();
        Caturra caturra = new Caturra();
        Catuai catuai = new Catuai();
        //Cruce de plantas
        PlantaCafe hibrido1 = borbon.cruzar(tipica);
        PlantaCafe hibrido2 = hibrido1.cruzar(caturra);
        //Asignación de plantas puras al array
        especies[0] = new ListaEnlazada();
        especies[1] = new ListaEnlazada();
        especies[2] = new ListaEnlazada();
        especies[0].agregarAlFinal(tipica);
        especies[0].agregarAlFinal(hibrido1);
        especies[0].agregarAlFinal(hibrido2);
        especies[1].agregarAlFinal(borbon);
        especies[1].agregarAlFinal(hibrido1);
        especies[1].agregarAlFinal(hibrido2);
        /*especies[2].agregarAlFinal(caturra);
        especies[2].agregarAlFinal(hibrido2);*/
        //Mostrar listas de especies
        /*especies[0].listar();
        especies[1].listar();
        especies[2].listar();
        //Filas Secuenciales Puras
        pw_borbon.println(borbon.getInfo());
        pw_tipica.println(tipica.getInfo());
        pw_caturra.println(caturra.getInfo());
        //Filas Secuenciales Puras
        pw_cruces.println(hibrido1.getInfo());
        pw_cruces.println(hibrido2.getInfo());
        //Creación de Pila
        Pila expedientes = new Pila();
        expedientes.apilar(Fborbon);
        expedientes.apilar(Ftipica);
        expedientes.apilar(Fcaturra);
        expedientes.apilar(Fcruces);
        expedientes.cima();
        expedientes.mostrar();
        expedientes.desapilar();
        expedientes.desapilar();
        expedientes.mostrar();
        //Creacion de Cola
        Cola colaCruce = new Cola();
        colaCruce.encolar(mundoNovo);
        colaCruce.encolar(catuai);
        colaCruce.encolar(caturra);
        colaCruce.imprimir();
        System.out.println("\nLuego de desencolar");
        colaCruce.desencolar();
        colaCruce.imprimir();
        System.out.println("\nCima: ");
        System.out.println(colaCruce.cima().getNombre());
        //Creación de Árboles
        Arabica arabica = new Arabica();
        ArbolGeneral<PlantaCafe> arbolGeneracional = new ArbolGeneral<PlantaCafe>(arabica);
        arbolGeneracional.insertar(arabica, tipica);
        arbolGeneracional.insertar(arabica, borbon);
        arbolGeneracional.insertar(tipica, mundoNovo);
        arbolGeneracional.insertar(borbon, mundoNovo);
        arbolGeneracional.insertar(mundoNovo, catuai);
        arbolGeneracional.insertar(borbon, caturra);
        arbolGeneracional.insertar(caturra, catuai);
        System.out.print("Preorden: "); arbolGeneracional.preOrden(arbolGeneracional.raiz);
        System.out.println("");
        System.out.print("Postorden: "); arbolGeneracional.postOrden(arbolGeneracional.raiz);
        System.out.println("");
        System.out.print("Inorden: "); arbolGeneracional.inOrden(arbolGeneracional.raiz);
        System.out.println("\n");
        System.out.print("Preorden: ");System.out.print(arbolGeneracional.preOrden2(arbolGeneracional.raiz) );
        //System.out.println("\n");
        //System.out.print("Postorden: ");System.out.print(arbolGeneracional.postOrden2(arbolGeneracional.raiz) );
        //System.out.println("\n");
        //System.out.print("Inorden: ");System.out.print(arbolGeneracional.inOrden2(arbolGeneracional.raiz) );
        //Cerrando buffers de escritura
        pw_borbon.close();
        pw_tipica.close();
        pw_caturra.close();
        pw_cruces.close();*/
      
        Grafo grafo = new Grafo();
		// // Exemplos de grafos
		// // Grafo Completo
		// System.out.println("Ejemplo de Grafo Completo: ");
		// Vertice cafe1 = new Vertice("cafe1");
		// Vertice cafe2 = new Vertice("cafe2");
		// Vertice cafe3 = new Vertice("cafe3");

		// grafo.adicionarVertice(cafe1);
		// grafo.adicionarVertice(cafe2);
		// grafo.adicionarVertice(cafe3);
		
		System.out.println("----------------------------------------------------\n");
		System.out.println("Ejemplo de Grafo Conexo 2: ");
		// grafo.conecta(cafe1, cafe2, new Arista(10));
		// Vertice arabica = new Vertice("arabica");
		// Vertice borbon = new Vertice("borbon");
		// Vertice catuai = new Vertice("catuai");
		// Vertice caturra = new Vertice("caturra");
		// Vertice tipica = new Vertice("tipica");
		// Vertice borbon2 = new Vertice("borbon2");
		// Vertice catuai2 = new Vertice("catuai2");
		// Vertice caturra2 = new Vertice("caturra2");
	    // Vertice tipica2 = new Vertice("tipica2");
		// Vertice borbon3 = new Vertice("borbon3");
		Vertice arabica = new Vertice(new Arabica(), 1);
		Vertice borbon = new Vertice(new Borbon(), 1);
		Vertice catuai = new Vertice(new Catuai(), 1);
		Vertice caturra = new Vertice(new Caturra(), 1);
		Vertice tipica = new Vertice(new Tipica(), 1);
		Vertice borbon2 = new Vertice(new Borbon(), 2);
		Vertice catuai2 = new Vertice(new Catuai(), 2);
		Vertice caturra2 = new Vertice(new Caturra(), 2);
                Vertice tipica2 = new Vertice(new Tipica(), 2);
		Vertice borbon3 = new Vertice(new Borbon(), 3);

		grafo.adicionarVertice(arabica);
		grafo.adicionarVertice(borbon);
		grafo.adicionarVertice(catuai);
		grafo.adicionarVertice(caturra);
		grafo.adicionarVertice(tipica);
		grafo.adicionarVertice(borbon2);
		grafo.adicionarVertice(catuai2);
		grafo.adicionarVertice(caturra2);
		grafo.adicionarVertice(tipica2);
		grafo.adicionarVertice(borbon3);
		
		grafo.conecta(arabica, catuai, new Arista(4));
		grafo.conecta(catuai, borbon, new Arista(5));
		grafo.conecta(catuai, caturra, new Arista(8));
		grafo.conecta(tipica, caturra, new Arista(5));
		grafo.conecta(borbon2, caturra, new Arista(4));
		grafo.conecta(borbon2, borbon3, new Arista(2));
		grafo.conecta(tipica, catuai2, new Arista(5));
		grafo.conecta(borbon2, catuai2, new Arista(3));


		Dijkstra dijkstra = new Dijkstra(grafo);
		dijkstra.caminoCostoMinimo(arabica, tipica2);
		System.out.println(dijkstra.vertices.values());
		System.out.println(dijkstra.vertices.keySet());
    }
}
