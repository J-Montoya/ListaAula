package Ejercicio4;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private boolean asistencia;


    private final String[] nombres_masculinos = {"Matias", "Lautaro", "Enrique", "Lorenzo", "Alfonso", "Rodrigo", "Guillermo"};
    private final String[] nombres_femeninos = {"Maria", "Laura", "Erica", "Saray", "Luisa", "Veronica", "Gabriela"};

    //------------------
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public boolean isAsistencia(){
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Persona(){

        //*********************************
        // Conseguir el sexo de la persona (Estudiante/Persona)

        if (OtrosMetodos.generarNumeroAleatorio(1, 0) == 0){
            sexo = "Masculino";
        }else{
            sexo = "Femenino";}

        //**************************************
        // Consiguiendo el nombre del (Estudiante/Persona)

        if (sexo == "Masculino"){
            nombre= nombres_masculinos[OtrosMetodos.generarNumeroAleatorio(6,0)];
        }
        else if(sexo == "Femenino"){
            nombre=nombres_femeninos[OtrosMetodos.generarNumeroAleatorio(6,0)];
        }

        disponibilidad();


    }

    public void disponibilidad() {

    }

}
