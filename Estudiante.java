package Ejercicio4;

public class Estudiante extends  Persona{
    private int nota;

    public Estudiante(){
        super();

        nota = OtrosMetodos.generarNumeroAleatorio(10, 0);
        super.setEdad(OtrosMetodos.generarNumeroAleatorio(15,12));
    }

    public int getNota() {
        return nota;
    }

    @Override
    public void disponibilidad() {
        int likelihood= OtrosMetodos.generarNumeroAleatorio(100, 0);

        if (likelihood < 50){
            super.setAsistencia(false);
        }else {
            super.setAsistencia(true);
        }
    }

    public String toString(){
        return "Nombre: "+ super.getNombre()+" , Sexo: "+super.getSexo()+" , Edad: "+super.getEdad()+" , Nota: "+nota;
    }

}
