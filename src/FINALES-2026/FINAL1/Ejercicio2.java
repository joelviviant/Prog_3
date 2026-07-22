public class Ejercicio2 {

    //Arrancando desde B
    //B->A = 6
    //B->D = 10

    //PADRE DE A Y D = B

    //TOMAMOS A
    //A->D =6 =12 X
    //A->B = 6=12 X
    //A->E = 2= 8 OK

    //PADRE DE E= A

    //TOMAMOS D

    //D-> C = 6

    //PADRE DE C = D

    //TOMAMOS E

    //E->D = 1 OK

    //PADRE DE D = E

//    B → B = 0
//    B → A = 6
//    B → E = 8
//    B → D = 9
//    B → C = 15
//    B → F = ∞


    //DKJISTRA SIRVE PARA ENCONTRAR EL CAMINO MAS CORTO ENTRE UN VERTICE Y TODOS LOS DEMAS


    //B)
   // Utilidad del algoritmo de Dijkstra:
   // El algoritmo de Dijkstra se utiliza para encontrar el camino más corto desde un vértice origen hacia
    // todos los demás vértices de un grafo ponderado, siempre que los pesos de las aristas sean no negativos.
   // ¿A qué clase de algoritmos pertenece?
   // Pertenece a la clase de los algoritmos voraces (Greedy o algoritmos codiciosos).

    //C
//    A → (B,6), (D,6), (E,2)
//
//    B → (A,6), (D,10)
//
//    C → (B,6)
//
//    D → (C,6)
//
//    E → (D,1)


   //         |||||||||  A |  B |  C |  D |  E |
   //         | **A** |  0 |  6 |  ∞ |  6 |  2 |
   //         | **B** |  6 |  0 |  ∞ | 10 |  ∞ |
   //         | **C** |  ∞ |  6 |  0 |  ∞ |  ∞ |
   //         | **D** |  ∞ |  ∞ |  6 |  0 |  ∞ |
   //         | **E** |  ∞ |  ∞ |  ∞ |  1 |  0 |
//

}
