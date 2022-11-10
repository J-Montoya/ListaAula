package Ejercicio4;

public class Profesor extends Persona{
    private String materia;


    public Profesor(){
        super();

        super.setEdad(OtrosMetodos.generarNumeroAleatorio(50,23));
        materia = Aula.listaMaterias[OtrosMetodos.generarNumeroAleatorio(2,0)];

    }

    public String getMateria() {
        return materia;
    }



    @Override
    public void disponibilidad() {

         int likelihood= OtrosMetodos.generarNumeroAleatorio(100, 0);

         if (likelihood < 20){
                super.setAsistencia(false);
         }else {
             super.setAsistencia(true);
         }
    }

}
