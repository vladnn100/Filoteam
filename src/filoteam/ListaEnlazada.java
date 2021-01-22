package filoteam;

public class ListaEnlazada {
    public NodoLista cabecera;
    public int tamanio = 0;

    public ListaEnlazada() {
        this.cabecera = null;
    }

    public void agregarAlFinal(PlantaCafe especie){
        NodoLista nuevo = new NodoLista(especie);
        if (cabecera == null) {
            cabecera = nuevo;
        } else{
            NodoLista aux = cabecera;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        tamanio++;
    }
    public void listar(){
        if(cabecera != null) {
            NodoLista aux = cabecera;
            while(aux != null){
                System.out.print(aux.especieCafe.nombre  + "  ->  ");
                aux = aux.siguiente;
            }
            System.out.println();
        }
    }
    public String listar2() {
        String list = "";
        if(cabecera != null) {
            NodoLista aux = cabecera;
            while(aux != null){
                list = (list + aux.especieCafe.nombre + "  ->  ");
                aux = aux.siguiente;
            }
            
        }
        return ("Lista:  " + list);
    }
}
