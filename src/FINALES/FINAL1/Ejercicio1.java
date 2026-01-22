package FINALES.FINAL1;

public class Ejercicio1 {

    // hashing separado con incremento
    //m=3, rp=2, rs =1 y rho de diseño =1,05
    // ingresar 8 numero(1,12,23,34,45,56,76,87)

    // h(x) x mod M+rs
    //1 mod 4= 1, 12 mod 4 = 0, 23 mod 4 =3 (no existe ese bucket, entonces uso x mod M) 23 mod 3=2

    //
    //0->12
    //1->1
    //2->23

    //INGRESAR 34

    // 34 mod 4 = 2

    //0->12
    //1->1
    //2->23->34

    //rho=1,3, supera entonces hago el split del bucket f=0
    //12 mod (2M)=
    //0->12
    //1->1
    //2->23->34
    //3->

    //P DE CARGA=1
    //F=1

    //Ingresar 45

    //45 mod (M+rs=5)=0

    //0->12->45
    //1->1
    //2->23->34
    //3->

    //p de carga = 1,25 hay que hacer un split en la f=1
    //1 mod 6=1
    //0->12->45
    //1->1
    //2->23->34
    //3->
    //4->
    //p de carga=1
    //f=2

    //INGRESAR EL 56
    //56 mod (M+rs=6)=2

    //0->12->45
    //1->1
    //2->23->34->56
    //3->
    //4->

    //rho=1,2 supera entonces hago el split del bucket f=2
    //23 MOD 6
    //34 MOD 6
    //56 mod 6

    //0->12->45
    //1->1
    //2->56
    //3->34
    //4->
    //5->23

    //f=3
    //rs=4

    //Ingresar el 67
    //67 mod (M+rs=7)=4

    //0->12->45
    //1->1
    //2->56
    //3->34
    //4->67
    //5->23
    //rho=1,16 supera el 1,05
    //f=3
    //rs=4

    //split en el bucket 3
    //34 mod 12=4

    //0->12->45
    //1->1
    //2->56
    //3->
    //4->67
    //5->23
    //6->
    //7->
    //8->
    //9->
    //10->34
    //11->
    //12->

    //f=1
    //rs=1
    //rho=0,58


    //INGRESAR EL 78

    //78 MOD 7=1

    //0->12->45
    //1->1->78
    //2->56
    //3->
    //4->67
    //5->23
    //6->
    //7->
    //8->
    //9->
    //10->34
    //11->
    //12->

//    RS=1
//    F=1
//    RHO=0,66


}
