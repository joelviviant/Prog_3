package FINALES.PARCIAL3;

public class Ejercicio3 {
    //Hashing lineal  h(x)= x mod M
    // Pd = 1,7

    //0->27->12
    //1->4->16->91
    //2->

    //m=3, f=0

    //INGRESAR 8
    //8 mod 3 = 2

    //0->27->12
    //1->4->16->91
    //2->8

    //pdcarga= 6/3 = 2

    //se reordena el buffer 0 ya que ahi esta la frontera=0

    //27 mod 6 = 2
    //12 mod 6 =

    //0->12
    //1->4->16->91
    //2->8
    //3->27

    //p de carga 1,5
    //f =1


    //INGRESAR EL 6

    //6 mod 3= 0

    //0->12->6
    //1->4->16->91
    //2->8
    //3->27

    //p de carga 1,75
    //REORDENAMOS EL BUCKET 1 F=1

    //4 mod 6 = 4
    //16 mod 6 = 4
    //91 mod 6 =1

    //0->12->6
    //1->91
    //2->8
    //3->27
    //4->4->16

    //p de carga =1,4 , f=2



}
