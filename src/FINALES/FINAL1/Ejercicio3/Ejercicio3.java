package FINALES.FINAL1.Ejercicio3;

import java.util.Comparator;
import java.util.List;

public class Ejercicio3 {

    public int greedy (List<Factura> facturas){
        facturas.sort(Comparator.comparing(Factura::getCalorias).reversed());
        int facturasComidas = 0;
        int total = 0;
        for (Factura factura : facturas) {
            total += factura.getCalorias() * (int) Math.pow(2, facturasComidas);
            facturasComidas++;
        }
        System.out.println(facturas);
        return total ;
    }
}
