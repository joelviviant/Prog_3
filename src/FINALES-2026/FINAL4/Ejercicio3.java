package FINAL4;

public class Ejercicio3 {
    //COLA= A;
    //VISITADOS= ;

    //SACO A
    //VISITADOS=A;
    //COLA = E , D , B

    //SACO = E
    //VISITADOS= A,E;
    //COLA = D , B

    //SACO =D
    //VISITADOS=A,E,D;
    //COLA = B,C

    //SACO B
    //VISITADOS =A,E,D,B;
    //COLA= C;

    //SACO =C
    //VISITADOS =A,E,D,B,C;


    //B
    //b) ¿Es posible o no aplicar el algoritmo de Dijkstra desde el nodo B?Justifique.
    //        Respuesta: Sí, es posible.Justificación:Condición de aplicabilidad:
    //        La restricción principal para aplicar Dijkstra es que el grafo no posea aristas
    //        con pesos negativos ni ciclos negativos. En este grafo, todos los pesos son estrictamente
    //        positivos ($1, 2, 6, 10$).Desconexión del nodo F: Que un nodo sea inalcanzable (como F)
    //        no invalida el algoritmo. Dijkstra simplemente finalizará asignándole una distancia infinita ($\infty$) a F,
    //        mientras calcula correctamente el camino mínimo hacia todos los nodos alcanzables desde B (como A, D, E y C).

    //C
    //Utilidad del algoritmo de Dijkstra:
    //Sirve para encontrar el camino mínimo desde un nodo origen hacia todos los demás nodos de un grafo ponderado
    //con pesos no negativos.
    //
    //Clase de algoritmos a la que pertenece:Pertenece a la clase de algoritmos ávidos (Greedy).

    //Caracteristicas:
    //Toma de decisiones locales.
    //Sin retroceso.
    //Eficiencia.
    //Optimalidad.

    //D
    //A ->(E, 2), (D, 6), (B, 6)
    // B-> (A, 6), (D, 10), (C, 6)
    // C->(no tiene aristas salientes)
    // D->(no tiene aristas salientes)
    // E-> (D, 1)
    // F->(nodo aislado, no tiene aristas)

    //E)

    import java.util.ArrayList;
import java.util.List;

    public class Grafo {
        private int numVertices;
        private List<List<Integer>> adj;

        public Grafo(int numVertices) {
            this.numVertices = numVertices;
            adj = new ArrayList<>();
            for (int i = 0; i < numVertices; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void agregarArista(int origen, int destino) {
            adj.get(origen).add(destino);
        }

        public boolean esAciclico() {
            int[] estado = new int[numVertices]; // 0: No visitado, 1: Visitando, 2: Visitado

            for (int i = 0; i < numVertices; i++) {
                if (estado[i] == 0) {
                    if (tieneCicloDFS(i, estado)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean tieneCicloDFS(int u, int[] estado) {
            estado[u] = 1;

            for (int v : adj.get(u)) {
                if (estado[v] == 1) {
                    return true;
                }
                if (estado[v] == 0 && tieneCicloDFS(v, estado)) {
                    return true;
                }
            }

            estado[u] = 2;
            return false;
        }
    }



}
