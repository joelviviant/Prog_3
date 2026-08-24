package FINAL4;

public class Ejercicio2 {

    // Suma actual > X → imposible volver atrás porque los elementos son naturales.
    //Suma actual = X → encontramos solución, terminamos ese camino.
    //Suma actual + suma de todos los restantes < X → aunque tomemos todos, no alcanzamos X.
    //Tomar un elemento hace superar X → esa rama puede podarse.


    //b)
    //La poda Alfa-Beta permite reducir la cantidad de nodos evaluados en un árbol de juegos
    //sin modificar el resultado del algoritmo Minimax. MAX busca maximizar el valor y MIN busca minimizarlo.

    //                               MAX
    //                          /           \
    //                        MIN            MIN
    //                      /    \         /    \
    //                    MAX    MAX     MAX    MAX
    //                    / \     / \     / \    / \
    //                   3   5   6   9   1   2  8   7

   // primero se evalúa la rama izquierda: MAX(3,5)=5 y MAX(6,9)=9, por lo que MIN(5,9)=5; entonces en la raíz se tiene α=5.
   // Al evaluar la rama derecha, se obtiene MAX(1,2)=2, por lo que el nodo MIN tiene β=2. Como β ≤ α (2 ≤ 5),
   // se puede podar el otro hijo de MIN, que contiene las hojas 8 y 7, ya que MIN nunca permitirá que esa rama produzca un
   // valor mayor que 5 para MAX. Finalmente, el valor de la raíz es MAX(5,2)=5.
}
