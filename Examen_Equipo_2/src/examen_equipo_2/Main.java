/* Integrantes:
 * Carlos Alberto Guardado Uribe
 * Edgar Eduardo Zamarrón Gaytán
 * Cesar Osvaldo Márquez Rodríguez
 * Ivan Samuel Corona Álvarez
 */
package examen_equipo_2;


public class Main {

   
    public static void main(String[] args) {
        
        
        Profesor Profesor1 = new Profesor("Juana", "Garcia");
        Profesor Profesor2 = new Profesor("ITCH II", "Ing. Sistemas Computacionales", 26);
        Profesor1.salida();
        Profesor2.salida("Mujer");
        
        
        Alumno Alumno1 = new Alumno("Elmer", "Homero");
        Alumno Alumno2 = new Alumno("ITCH II", "Ing. Sistemas Computacionales", 18);
        
        
        Alumno1.Salida();
        Alumno2.Salida("Hombre");
        Alumno1.DatosDesempeño(20550382);
        Alumno1.DatosDesempeño();
        
    }
    
}
