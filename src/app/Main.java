package app;

import instalaciones.InstalacionesPetroliferas;
import instalaciones.bombaExtractora;
import instalaciones.plataformaMarina;
import instalaciones.torrePerforacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
InstalacionesPetroliferas[] instalaciones ;
InstalacionesPetroliferas i1 = new torrePerforacion("Torre Norte","Texas",20,200);
InstalacionesPetroliferas i2 = new plataformaMarina("Plataforma Atlantico","Texas",20,200);
InstalacionesPetroliferas i3 = new bombaExtractora("Bomba Yacimiento-12","Texas",20,200);
InstalacionesPetroliferas i4 = new torrePerforacion("Torre Delta","Texas",20,200);
i1.ejecutarProceso();
i2.ejecutarProceso();
i3.ejecutarProceso();
i4.ejecutarProceso();

}





        }

