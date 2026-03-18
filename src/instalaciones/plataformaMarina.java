package instalaciones;

import interfaces.Revisable;

public class plataformaMarina extends InstalacionesPetroliferas  implements Revisable {

    double produccionReal;
    double distaciaCosta;

    // CONSTRUCTOR
    public plataformaMarina(String nombre, String ubicacion, double produccionDiaria, double distaciaCosta) {
        super(nombre, ubicacion, produccionDiaria);
        this.distaciaCosta = distaciaCosta;
    }




    // METODOS

    @Override
    public void PreparaInstalacio() {
        System.out.println("----------------------------------------------");
        System.out.println("Accion: Estabilizando Plataforma Marina...");
        System.out.println("----------------------------------------------");
    }

    @Override
    public double calculoProduccionReal() {
    produccionReal=produccionDiaria+60-(distaciaCosta/6);
        if (produccionReal < 0){
            produccionReal=0;
        }
        return produccionReal;
    }
    @Override
    public void mostrarResultado() {
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: " +getClass().getSimpleName());
        System.out.println("Ubicacion: "+ubicacion);
        System.out.println("Barriles: "+produccionReal);
        System.out.println("----------------------------------------------");
    }
    @Override
    public void revisarInstalacion() {
        System.out.println("La Plataforma Marina "+nombre+" esta siendo revisada");
    }
}
