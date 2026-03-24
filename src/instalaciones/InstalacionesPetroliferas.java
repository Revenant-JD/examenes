package instalaciones;

public abstract class InstalacionesPetroliferas {
   protected String nombre;
   protected String ubicacion;
   protected double   produccionDiaria;



    public InstalacionesPetroliferas(String nombre, String ubicacion, double produccionDiaria) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.produccionDiaria = produccionDiaria;
    }

    public void  PreparaInstalacio(){

       System.out.println("INSTALACION DEFECTO");
   }
   public double calculoProduccionReal(){
       System.out.println("PRODUCCION POR DEFECTO");
       return produccionDiaria;
   }

    public   void  mostrarResultado(){
        System.out.println("RESULTADO POR DEFECTO");
    }

     public final void ejecutarProceso(){
            PreparaInstalacio();
            calculoProduccionReal();
            mostrarResultado();



    }

}
