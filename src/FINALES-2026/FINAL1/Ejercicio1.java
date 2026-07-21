package FINALES.FINAL1;

public class Ejercicio1 {

    //A

    // hashing separado con incremento
    //m=3, rp=2, rs =1 y rho de diseño =1,05
    // ingresar 8 numero(1,12,23,34,45,56,76,87)

    // h(x) x mod M

    //h(1) 1 mod 3 = 1
    //0 -> -
    //1 -> 1
    //2 -> -

    //1/6=  0,16 rho temp
    //-----------------------------
    //h(12) 12 mod 3 = 0
    //0 -> 12
    //1 -> 1
    //2 -> -
    //2/6=  0,33 rho temp
    //------------------------
    //h(23) 23 mod 3 = 2
    //0 -> 12
    //1 -> 1
    //2 -> 23
    //3/6=  0,50 rho temp
    //--------------------------
    //h(34) 34 mod 3 = 1
    //0 -> 12
    //1 -> 1 -> 34
    //2 -> 23
    //4/6 = 0,66 rho temp
    //--------------------------
    //h(45) 45 mod 3 = 0
    //0 -> 12 -> 45
    //1 -> 1 -> 34
    //2 -> 23
    //5/6 = 0,83 rho temp
    //--------------------------
    //h(56) 56 mod 3 = 2
    //0 -> 12 -> 45
    //1 -> 1 -> 34
    // 2 -> 23-> 56
    //6/6 = 1 rho temp
    //--------------------------
    //h(76) 76 mod 3 = 1
    //0 -> 12 -> 45
    //1 -> 1 -> 34 ->[OVF->76]
    //2 -> 23-> 56
    //7/6 = 1,16 rho temp -> supera el rho, se agrega un bucket porque es lineal y se hace un split en bucket=0

    //    12 mod 4 = 0  → ¿es igual a 3? NO → se queda en bucket 0
    //    45 mod 4 = 1  → ¿es igual a 3? NO → se queda en bucket 0
    //    Resultado: bucket 0 sigue teniendo [12, 45], bucket 3 queda vacío

    //0 -> 12 -> 45
    //1 -> 1 -> 34 ->[OVF->76]
    //2 -> 23-> 56
    //3->
    // 7/8 = 0,875 rho temp

    //--------------
    // h(87) 87 mod 4 = 3
    //0 -> 12 -> 45
    //1 -> 1 -> 34 ->[OVF->76]
    //2 -> 23-> 56
    //3-> 87
    // 8/8 = 1 rho temp


    //B


    //Dispersión perfecta

    //Definición: Es cuando la función hash asigna cada clave a un bucket distinto, sin que se produzca ninguna colisión.
    //    Ejemplo:
    //Con M=5 y h(x) = x mod 5, insertando {5, 11, 22, 33, 44}:
    //h(5)=0, h(11)=1, h(22)=2, h(33)=3, h(44)=4
    //Cada clave cae en un bucket diferente → no hay colisiones → dispersión perfecta.

    //Dispersión pura

    //Definición: Es cuando no se usa un área de overflow separada; si un bucket está ocupado, el elemento se ubica en otro bucket primario libre de la misma tabla (por ejemplo con sondeo lineal).
    //Ejemplo:
    //Con M=5 y h(x) = x mod 5, usando sondeo lineal:
    //    Insertar 10 → h(10)=0 → bucket 0 libre → entra en bucket 0
    //    Insertar 15 → h(15)=0 → ocupado → bucket 1 libre → entra en bucket 1
    //    Insertar 20 → h(20)=0 → ocupado → bucket 1 ocupado → bucket 2 libre → entra en bucket 2
    //    El 15 y el 20 no quedan en el bucket que indica su hash, sino en el siguiente bucket primario libre de la tabla.
}



