package Mini3;

import Mini3.controlador.Controlador;
import Mini3.modelo.ModeloCandy;
import Mini3.vista.Vista1;
import Mini3.vista.VistaAddCandy;
import Mini3.vista.VistaDeleteCandy;
import Mini3.vista.VistaListCandies;
import Mini3.vista.VistaSearchCandy;
import Mini3.vista.VistaUpdateCandy;

public class Main{
    public static void main(String[] args){
        ModeloCandy mod = new ModeloCandy();
        
        Vista1 view = new Vista1();
        
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.starting();
        view.inicio(view);
    }
}