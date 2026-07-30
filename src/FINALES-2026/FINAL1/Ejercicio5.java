public class Ejercicio5 {


   // a) Describa la estructura y para qué y en qué casos se utiliza.
//
   // Hashing particionado divide el archivo en particiones (buckets) usando una función hash.
    // Se utiliza para almacenar y recuperar registros rápidamente por clave exacta, especialmente en archivos grandes.
//
   // b) ¿Es apto para realizar búsquedas incompletas? Justifique.
//
   // No. Porque el hash depende de la clave completa. Si la clave está incompleta, no se puede calcular el bucket correspondiente
    // y habría que recorrer varias particiones.
//
// c) ¿La estructura GridFile posee algunas ventajas respecto a Hashing Separado? Enumérelas.
//
   // Permite búsquedas parciales.
   // Crece dinámicamente sin reorganizar todo el archivo.
   // Reduce el desperdicio de espacio.
   // Maneja mejor los desbordes (overflow).
}
