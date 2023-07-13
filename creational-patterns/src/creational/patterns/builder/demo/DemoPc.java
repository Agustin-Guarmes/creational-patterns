/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.patterns.builder.demo;

import creational.patterns.builder.builderPc.ManualBuilder;
import creational.patterns.builder.builderPc.PcBuilder;
import creational.patterns.builder.director.Director;
import creational.patterns.builder.entidad.Computadora;
import creational.patterns.builder.entidad.ManualPc;
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
        
       
        do{
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
        System.out.println("Desea crear otra pc? Ingrese 1 \n salir Ingrese 3");
        op = scan.nextInt();
        }while(op!=3);
        
        
    }
}
