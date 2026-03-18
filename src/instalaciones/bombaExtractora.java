package instalaciones;

public class bombaExtractora extends InstalacionesPetroliferas{

    double produccionReal;
    double ciclosMin;


    // CONSTRUCTOR
    public bombaExtractora(String nombre, String ubicacion, double produccionDiaria, double ciclosMin) {
        super(nombre, ubicacion, produccionDiaria);
        this.ciclosMin = ciclosMin;
    }




    // METODOS

    @Override
    public void PreparaInstalacio() {
        System.out.println("----------------------------------------------");
        System.out.println("Accion: Activando ciclos de Bombeo...");
        System.out.println("----------------------------------------------");
    }

    @Override
    public double calculoProduccionReal() {
        produccionReal=produccionDiaria + (ciclosMin*4)-(ciclosMin/2);
        if (produccionReal < 0){
            produccionReal=0;
        }
        return  produccionReal;
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


}
