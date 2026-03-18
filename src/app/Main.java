package app;

import instalaciones.InstalacionesPetroliferas;
import instalaciones.bombaExtractora;
import instalaciones.plataformaMarina;
import instalaciones.torrePerforacion;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<InstalacionesPetroliferas> lista = new ArrayList<>();
InstalacionesPetroliferas[] instalaciones ;
InstalacionesPetroliferas i1 = new torrePerforacion("Torre Norte","Texas",20,200);
InstalacionesPetroliferas i2 = new plataformaMarina("Plataforma Atlantico","Texas",20,200);
InstalacionesPetroliferas i3 = new bombaExtractora("Bomba Yacimiento-12","Texas",20,200);
InstalacionesPetroliferas i4 = new torrePerforacion("Torre Delta","Texas",20,200);

lista.add(i1);
lista.add(i2);
lista.add(i3);
lista.add(i4);
double suma=0;
for (InstalacionesPetroliferas i: lista){
i.ejecutarProceso();
    suma +=  i.calculoProduccionReal();
}
        System.out.println("Total = " +suma);


}





        }

