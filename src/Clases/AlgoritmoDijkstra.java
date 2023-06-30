package Clases;

import static Ventanas.Inicio.PintarFiguras;
import static Ventanas.Inicio.jPanel1;
import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Jose H Elel
 */
public class AlgoritmoDijkstra {

    private final DatosGraficos arboles;
    private int subTope;
    private Nodo Nodoauxiliar = null;
    private double auxiliarAumulado; // es un acumulado auxiliar
    private double subtotalAcomulado;
    private final Nodo nodo[];
    private final int tope;
    private int Origen;
    private final int nodoFinal;
    private final ArrayList<String> nodosRecorridos;
    

    public AlgoritmoDijkstra(DatosGraficos arboles, int tope, int permanente, int nodoFin) {
        this.arboles = arboles;
        this.tope = tope;
        this.nodo = new Nodo[tope];
        this.Origen = permanente;
        this.nodoFinal = nodoFin;
        this.nodosRecorridos = new ArrayList<>();

    }

    public double getAcumulado() {
        return nodo[nodoFinal].getAcumulado();
    }

    public int getNombre() {
        return nodo[nodoFinal].getNombre();
    }

    public void dijkstra() {
        for (int i = 0; i < tope; i++) // creacion del vector nodo del tamaño del numero de nodos pintados 
        {
            nodo[i] = new Nodo();
        }
        String nom[] = {"Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali"};
            jPanel1.paint(jPanel1.getGraphics());
            PintarFiguras(tope, arboles);
            PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(Origen), 
                    arboles.getCordeY(Origen), null, Color.GREEN); // pinta de color el nodo de Origen

            nodo[Origen].setVisitado(true);
            nodo[Origen].setNombre(Origen);

            do {
                subtotalAcomulado = 0;
                auxiliarAumulado = 2000000000; // lo igualamos a esta cifra ya q el acomulado de los nodos, a la que nunca sera mayor 
                nodo[Origen].setEtiqueta(true);
                for (int j = 0; j < tope; j++) {
                    if (arboles.getmAdyacencia(j, Origen) == 1) {
                        subtotalAcomulado = nodo[Origen].getAcumulado() + arboles.getmCoeficiente(j, Origen);
                        
                        if (subtotalAcomulado <= nodo[j].getAcumulado() && nodo[j].isVisitado() == true && nodo[j].isEtiqueta() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        } else if (nodo[j].isVisitado() == false) {
                            nodo[j].setAcumulado(subtotalAcomulado);
                            nodo[j].setVisitado(true);
                            nodo[j].setNombre(j);
                            nodo[j].setPredecesor(nodo[Origen]);
                        }
                    }
                }
                
                //Encontrando Camino mas corto
                for (int i = 0; i < tope; i++) { // buscamos cual de los nodos visitado tiene el acomulado menor par escogerlo como camino
                    if (nodo[i].isVisitado() == true && nodo[i].isEtiqueta() == false) {
                        if (nodo[i].getAcumulado() <= auxiliarAumulado) {
                            Origen = nodo[i].getNombre();
                            auxiliarAumulado = nodo[i].getAcumulado();
                        }
                    }
                }
                subTope++;
            } while (subTope < tope + 1);

            Nodoauxiliar = nodo[nodoFinal];
            
            //Pintando caminos recorridos
            while (Nodoauxiliar.getPredecesor() != null) {
                PintanrDibujos.pinta_Camino(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()),
                        arboles.getCordeY(Nodoauxiliar.getNombre()),
                        arboles.getCordeX(Nodoauxiliar.getPredecesor().getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getPredecesor().getNombre()), Color.BLUE);
                
                PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                        arboles.getCordeX(Nodoauxiliar.getNombre()), 
                        arboles.getCordeY(Nodoauxiliar.getNombre()), null, Color.BLUE);
                Nodoauxiliar = Nodoauxiliar.getPredecesor();
                //Añadir nombres de los departamentos al arreglo de los nodos recorridos
                nodosRecorridos.add(nom[Nodoauxiliar.getNombre()]);
                
                //System.out.println("Nodo recorrido: " + Nodoauxiliar.getNombre());   // Imprimir nodo recorrido
            }//fin de while Recorriendo caminos
            
    //añadientdo el nombre del nodo final al arreglo
            
            PintanrDibujos.seleccionNodo(jPanel1.getGraphics(), 
                    arboles.getCordeX(nodoFinal), 
                    arboles.getCordeY(nodoFinal), null, Color.RED);//Pintando Nodo del destino
           
    }
    public ArrayList<String> imprimirNodosRecorridos()
    {
        return nodosRecorridos;
    }

}
