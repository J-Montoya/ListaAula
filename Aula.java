package Ejercicio4;

public class Aula {

    private int id;
    private final int numMaxEstudiantes = 20;
    private String materia;
    private Estudiante[] estudiantes;
    private Profesor profesor;
    public static String[] listaMaterias = {"Matematicas", "Filosofia", "Fisica"};


    public Aula(){

        id = 1;

        //También se podría escribir profesor = new Profesor();
        profesor= new Profesor();

        estudiantes= new Estudiante[numMaxEstudiantes];
        crearAlumno();
        materia = Aula.listaMaterias[OtrosMetodos.generarNumeroAleatorio(2,0)];

    }
    private void crearAlumno(){
        for (int i=0;i < estudiantes.length;i++){
            estudiantes[i] = new Estudiante();
        }
    }

    private boolean asistenciaAlumnos(){
        int cuentaAsistencias = 0;
        for (int i = 0; i<estudiantes.length; i++){
            if (estudiantes[i].isAsistencia()){
                cuentaAsistencias++;
            }
        }

        System.out.println("Hay "+ cuentaAsistencias+" alumnos");

        if (cuentaAsistencias < ( (int)((estudiantes.length)/2) )){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean darClase(){
        if (!profesor.isAsistencia()){
            System.out.println("El profesor no está disponible, no se puede ver clase");
            return false;
        }else if (!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no coinciden");
            return false;
        }else if (!asistenciaAlumnos()){
            System.out.println("Hay menos del 50% en la asistencia de los estudiantes");
            return false;
        }
        else {
            System.out.println("Se cumplen todas las condiciones para dar clase");
            return true;
        }
    }

    public void notas() {

        if (darClase() == true){

        int aprobados = 0;
        int aprobadas = 0;
        for (int i = 0; i < estudiantes.length; i++) {


                if (estudiantes[i].getNota() >= 5){
                    if (estudiantes[i].getSexo() == "Masculino"){
                        aprobados++;
                    }
                    else {
                        aprobadas++;
                    }
                    System.out.println(estudiantes[i].toString());
                }
            }

            System.out.println("Hay "+ aprobados+" chicos y "+aprobadas+" chicas que han aprobado hasta ahora");

        }
    }
}
