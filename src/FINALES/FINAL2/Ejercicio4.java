package FINALES.FINAL2;

public class Ejercicio4 {
    //o->16->20
    //1->5->13->25
    //2->6
    //3->43->47

  //  p de diseño es =2,3
  //  m=4
  // f=0


  //INGRESAR 40
  //  40 mod 4 =0

    //o->16->20->40
    //1->5->13->25
    //2->6
    //3->43->47

    //  p de carga es =2,25
    //  m=4
    // f=0


    //INGRESAR 33

    //33 mod 4 = 1
    //o->16->20->40
    //1->5->13->25->33
    //2->6
    //3->43->47

    //  p de carga es =2,5 (supera el p de diseño, reordeno el buffer =0)
    //  m=4
    // f=0

//    para reordenar m=5
//    h(x) x mod m
    //16 mod 5 =1
    //20 mod 5 =0
    // 40 mod 5 =0


    //0 → 20 → 40
    //1 → 5 → 13 → 25 → 33 → 16
    //2->6
    //3->43->47
    //4->

    //  p de carga es =2
    //  m=5
    // f=1



    //INGRESAR 24
    //  24 mod 4 =0
    // 24 mod 5 = 4

    //0 → 20 → 40
    //1 → 5 → 13 → 25 → 33 → 16
    //2->6
    //3->43->47
    //4->24

    //  p de carga es =2,2
    //  m=5 use la h(x) x mod m+1, porq por la primer fomrula el resultado es menor a f
    // f=1

    //INGRESAR

    //  50 mod 4 =2

    //0 → 20 → 40
    //1 → 5 → 13 → 25 → 33 → 16
    //2->6 -> 50
    //3->43->47
    //4->24

//    p de carga= 2,4 reordenamos el bucket 1 ya que f=1
//    x mod m+1 = x mod 6


    // 5 mod 6= 5, 13 mod 6 = 1, 25 mod 6 = 1, 33 mod 6 = 3, 16 mod 6 =4

    //0 → 20 → 40
    //1 →  13 → 25
    //2->6 -> 50
    //3->43->47->33
    //4->24->16
    //5->5->

//    p de carga= 2
//    f=2




}
