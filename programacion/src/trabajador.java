package programacion.src;

public class trabajador {
    private String nombre;
    private String apellidos;
    private int fecha_nacimiento;
    private String puesto;
    private String localizacion;
    private String descripcion;

    // metodos de la clase

    public trabajador(String nombre,String apellidos,
                      int fecha_nacimineto, String puesto,
                      String localizacion,String descripcion){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fecha_nacimiento=fecha_nacimineto;
        this.puesto=puesto;
        this.localizacion=localizacion;
        this.descripcion=descripcion;

    }
    public void mostrarperfil(){
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(fecha_nacimiento);
        System.out.println(puesto);
        System.out.println(localizacion);

    }
    public void modificardatos(String new_nombre,String new_apellidos,
                               int new_fecha_nacimineto, String new_puesto,
                               String new_localizacion,String new_descripcion){
        this.nombre=new_nombre;
        this.apellidos=new_apellidos;
        this.fecha_nacimiento=new_fecha_nacimineto;
        this.puesto=new_puesto;
        this.localizacion=new_localizacion;
        this.descripcion=new_descripcion;
    }
    public void visualizarcursos(){

    }
    public void añadircurso(){

    }
    public void borrarcurso(){

    }



    public static void main(String[] args) {

    }
}
