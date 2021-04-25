package examen_equipo_2;

import javax.swing.JOptionPane;

public class Alumno extends Profesor {

    //Variables extra para la clase alumno
    private int NumControl, MatCursando, MatAprob, MatReprob, S, N;
    private float Calif, Total;
    String opc = "";

    //Constructor Herencia
    public Alumno(String Nombre, String Apellido) {

        super(Nombre, Apellido);

    }

    //Constrcutor Herencia 
    public Alumno(String Institucion, String Area, int Edad) {

        super(Institucion, Area, Edad);

    }

    //Metodo
    public void DatosDesempeño(int NumControl) {

        this.NumControl = NumControl;
    }

    //Metodo sobrecarga
    public void DatosDesempeño() {
        int NumAlum=7;
        System.out.println("El numero de estudiante que quiere es: "+NumAlum);
        for(int i=0;i<=NumAlum;i++){
        do {

            opc = JOptionPane.showInputDialog(null, "                     ----- Datos Academicos -----"
                    + "\nA. Ingresar numero de materias y calcular promedio"
                    + "\nB.  Salir"
                    + "\nIngrese una opción: ");

            switch (opc) {
                case "a":
                case "A":
                    MatCursando = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese el numero de materias"
                            + "\n que cursa el alumno"));

                    if (MatCursando > 0 & MatCursando <= 10) {
                        MatAprob = Integer.parseInt(JOptionPane.showInputDialog(null, "De las " + MatCursando + " materias"
                                + "que cursa el alumno, ¿cuantas aprobo?."
                                + "\n"
                                + "\nSe considerara el resto como reprobadas"));
                        MatReprob = MatCursando - MatAprob;

                        for (int i = 1; i <= MatAprob; i++) {
                            S = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calificaciones en orden"));

                            Total = Total + S;

                        }
                        Calif = Total / MatCursando;
                        JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + Calif, "", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No estoy para bromas", "", JOptionPane.ERROR_MESSAGE);
                        N++;
                        if(N>=3){
                            JOptionPane.showMessageDialog(null, "Ya cometiste "+N+" errores, deja de jugar", "", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;
                case "b":
                case "B":
                    JOptionPane.showMessageDialog(null, "Que tenga un buen dia");
            }

        } while (!opc.equalsIgnoreCase("B"));

    }
    }

    public void Salida() {

        JOptionPane.showMessageDialog(null, "Nombre del alumno: " + getNombre() + " " + getApellido());
    }

    public void Salida(String Sexo) {
        JOptionPane.showMessageDialog(null, "Tiene: " + getEdad() + " años."
                + "\nSexo: " + Sexo
                + "\nInstitución: " + getInstitucion()
                + "\nArea: " + getArea());
    }

}
