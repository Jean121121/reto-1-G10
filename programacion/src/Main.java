package programacion.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursost1 = new ArrayList<>();
        Curso c1 = new Curso(1, "Conduccion", "12-08-2020", "Aprobado");
        Curso c2 = new Curso(2, "Medio ambiente", "25-01-2023", "Pendiente");

        cursost1.add(c1);
        cursost1.add(c2);

        Trabajador t1 = new Trabajador(1, "Jorge", "a", "a", "23", "dda", "adf", "daf", cursost1);


        t1.visualizarcursos();



    }
}
