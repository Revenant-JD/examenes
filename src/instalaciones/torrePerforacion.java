package instalaciones;

import interfaces.Revisable;

public class torrePerforacion extends InstalacionesPetroliferas  implements Revisable {
    double profundidadPerforacion;
    double produccionReal;

    public double getProduccionReal() {
        return produccionReal;
    }

    //CONSTRUCTOR
    public torrePerforacion(String nombre, String ubicacion, double produccionDiaria, double profundidadPerforacion) {
        super(nombre, ubicacion, produccionDiaria);
        this.profundidadPerforacion = profundidadPerforacion;
    }

    // METODOS
    @Override
    public double calculoProduccionReal() {
       produccionReal= produccionDiaria + (profundidadPerforacion/90)+(Math.sqrt(profundidadPerforacion));
        if (produccionReal < 0 ){
            produccionReal=0;
        }
        return produccionReal;
    }

    @Override
    public void PreparaInstalacio() {
        System.out.println("----------------------------------------------");
        System.out.println("Accion: Iniciando Perforacion Profunda");
        System.out.println("----------------------------------------------");
    }

    @Override
    public void mostrarResultado() {
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: " +getClass().getSimpleName());
        System.out.println("Ubicacion: "+ubicacion);
        System.out.println("Barriles: " +produccionReal);
        System.out.println("----------------------------------------------");
    }

    @Override
    public void revisarInstalacion() {
        System.out.println("La torre de Perforacion"+nombre+"esta siendo revisada");
    }
}
