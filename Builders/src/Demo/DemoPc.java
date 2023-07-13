/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import BuilderPc.ManualBuilder;
import BuilderPc.PcBuilder;
import Directores.Director;
import Entidad.Computadora;
import Entidad.ManualPc;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class DemoPc {
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        int op;
        Director director = new Director();
        PcBuilder builder = new PcBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();
        
        
        Computadora pc ;
        ManualPc manual;
        
        System.out.println("Ingrese una opcion de pc");
        System.out.println("1-pcGamer \n2-pc Oficina");
        op = scan.nextInt();
        
        if(op == 1){
            director.crearPcGamer(builder);
            director.crearPcGamer(manualBuilder);
            pc = builder.getResult();
            manual = manualBuilder.getResult();
            
            
        }else{
            director.crearPcOficina(builder);
            director.crearPcOficina(manualBuilder);
            pc = builder.getResult();
            manual = manualBuilder.getResult();
        }
        
        System.out.println("Tipo de pc: "+pc.getTipo());
        System.out.println(manual.print());
        
    }
   
    
}
