package FINAL4;

public class Ejercicio1 {

    //a) ¿Qué es hashing particionado y para qué se utiliza?
    //El hashing particionado divide el espacio de claves en particiones y utiliza una función de hash
    //para determinar en qué partición se encuentra cada registro. La idea es que, dada una clave,
    //podamos calcular rápidamente qué partición consultar, evitando recorrer toda la estructura.
    //Se utiliza principalmente para realizar búsquedas exactas de registros por una clave.

    //b) ¿Es apto para realizar búsquedas incompletas?
    //No es adecuado para búsquedas incompletas, porque el hashing está diseñado principalmente para encontrar una clave exacta.


    //                          Hashing particionado	    Grid-File
    //Búsqueda exacta	        Muy eficiente	            Eficiente
    //Búsqueda por rango	    Poco adecuado	            Adecuado
    //Búsqueda incompleta	    Poco adecuada	            Más adecuada
    //Organización	            Según función hash	        Según rangos de valores
    //Uso típico	            Buscar una clave exacta	    Consultas multidimensionales y por rangos

}
