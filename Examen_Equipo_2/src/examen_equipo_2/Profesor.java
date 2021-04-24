package examen_equipo_2;

import javax.swing.JOptionPane;

public class Profesor {

    //Variables para la super clase profesor
    private String Nombre, sexo;
    private String Apellido;
    private String Institucion;
    private String Area;
    private int Edad;

    //Constructor
    public Profesor(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    //Constructor
    public Profesor(String Institucion, String Area, int Edad) {
        this.Institucion = Institucion;
        this.Area = Area;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public String getArea() {
        return Area;
    }

    public int getEdad() {
        return Edad;
    }

    public void salida() {
        JOptionPane.showMessageDialog(null, "Nombre del docente: " + Nombre + " " + Apellido);
    }

    public void salida(String sexo) {
        this.sexo = sexo;
        JOptionPane.showMessageDialog(null, "Tiene: " + Edad + " años."
                + "\nSexo: " + sexo
                + "\nInstitución: " + Institucion
                + "\nArea: " + Area);

    }

}
