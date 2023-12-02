package programacion.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Curso> cursost1 = new ArrayList<>();
        Curso c1 = new Curso(1, "Conduccion", "12-08-2020", "Aprobado");
        Curso c2 = new Curso(2, "Medio ambiente", "25-01-2023", "Pendiente");

        cursost1.add(c1);
        cursost1.add(c2);

        Trabajador t1 = new Trabajador(1, "Jorge", "a", "a", "23", "dda", "adf", "daf", cursost1);


        t1.visualizarcursos();
        */


        Trabajador t1 = new Trabajador(1, "Jorge", "Palacios", "Grande", "12-03-1999", "Responsable de estacion", "Estacion", "aaaaa");

        Curso c1 = new Curso(1, "Curso de conduccion", "23-04-2022");
        Curso c2 = new Curso(2, "Sensibilizacion con el medio ambiente", "12-10-2020");

        t1.anadircurso(c1);
        t1.anadircurso(c2);

        Trabajador t2 = new Trabajador(2, "Lucia", "Rodriguez", "Arias", "01-08-2003", "Mantenimiento", "Movil", "ada");
        t2.anadircurso(c2);


        c1.cambiarSituacion(t1.listacursos.get(0), "Aprobado");
        c2.cambiarSituacion(t1.listacursos.get(1), "No superado");
        c1.cambiarSituacion(t2.listacursos.get(0), "Aprobado");

        System.out.println("Jorge");
        t1.visualizarcursos();

        System.out.println("Lucia");
        t2.visualizarcursos();




        SistemaPuntos p = new SistemaPuntos();
        Usuario u1 = new Usuario(1, "Daniel", "Garrido", "Ramirez", "05-01-1990", "danielgr@gmail.com", p);

        u1.verPuntos();
        u1.ganarPuntos(30);
        u1.ganarPuntos(20);
        u1.verPuntos();
        u1.intercambiarPuntos(15);
        u1.verPuntos();
        u1.intercambiarPuntos(45);
        u1.verPuntos();


        SistemaPuntos p2 = new SistemaPuntos();
        Viaje v1 = new Viaje(1, "20 minutos", "110/200");
        Viaje v2 = new Viaje(2, "40 minutos", "10/220");
        Viaje v3 = new Viaje(3, "15 minutos", "150/300");

        Usuario u2 = new Usuario(2, "Francisco", "Gonzalez", "Alvarez", "30-09-2007", "franciscoga@gmail.com", p2);
        u1.agregarViaje(v1);
        u1.agregarViaje(v2);
        u2.agregarViaje(v2);
        u2.agregarViaje(v3);

        u1.valorarViaje(v1, "Retraso de 10 minutos");
        u1.valorarViaje(v2, "Puntual");
        u2.valorarViaje(v2, "Puntual");
        u2.valorarViaje(v3, "Retraso de 30 minutos");

        System.out.println("Daniel");
        u1.verViajes();
        System.out.println("Francisco");
        u2.verViajes();
    }
}
