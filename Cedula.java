/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class Cedula {
    int personas[]=new int[5];
    Scanner sc = new Scanner(System.in);
    
    
    void agregar(){
        System.out.println("REGISTRANDO CEDULAS");
        int cedu;
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Digite el numero de la cedula: ");
            cedu=sc.nextInt();
            personas[i]=cedu;
            
          
        }
        System.out.println("Datos gurdados!");
    }
     void listar(){
        System.out.println("LISTANDO CEDULAS");
        for (int i = 0; i < personas.length; i++) {
   
                System.out.print(personas[i]+"-");
                
          
           
        }
    }
    void listarMayores(){
        System.out.println("LISTANDO CEDULAS MAYORES");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i]>5000000){
                System.out.println(personas[i] );
                
            }else
            System.out.println("No hay cedulas mayores a 5000000!");
        }
    }
    void buscar(){
        
        int bandera =0;
        System.out.println("BUSCAR CEDULA: ");
        System.out.println("Digite la cedula a buscar:");
        int cedulaBuscar = sc.nextInt(); 
        int cedulaGuardada=0;
        
        for (int i = 0; i < personas.length; i++) {
            cedulaGuardada=personas[i];
            if(cedulaBuscar == cedulaGuardada){
                bandera=1;
                System.out.println("Cedula encontrada!");
            }
        }
            if (bandera==0) {
              System.out.println("cedula no encontrada...");
       }
        
    }
    void menu(){
         int opcion;
        do {
            System.out.println("""
                           \n*****MENU DE OPCIONES*****
                           --------------------------
                           1. Rgistrar cedula
                           2. Listar cedula
                           3. listar cedula mayores
                           4. buscar cedula
                           
                           Digite una opcion:
                           """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.agregar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.listarMayores();
                    break;
                case 4:
                    this.buscar();
                    break;

            }
        } while (opcion!=4);
    }
    
}
