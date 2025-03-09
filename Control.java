/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup;

import fup.Computador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Fernando
 */
public class Control {

    Scanner sc = new Scanner(System.in);
    ArrayList lista = new ArrayList();

    void Registrar() {
        System.out.println("REGISTRANDO PCs");
        System.out.println("Digite el numero de PCs a registrar");
        int num_computadores = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num_computadores; i++) {
            System.out.println("Marca: ");
            String marca = sc.next();
            System.out.println("Serial: ");
            int serial = sc.nextInt();

            //creo el objeto
            Computador objeto = new Computador();
            objeto.setMarca(marca);
            objeto.setSerial(serial);

            //agrego a la lista
            lista.add(objeto);
        }

        System.out.println("PC registrado!");

    }

    void listar() {
        System.out.println("PCs");
        System.out.println("MARCA / SERIAL");
        for (int i = 0; i < lista.size(); i++) {
            Computador pcRecuperado = (Computador) lista.get(i);
            System.out.println(pcRecuperado.getMarca() + " / "
                    + pcRecuperado.getSerial());
        }
    }

    void buscarPC_serial() {
        System.out.println("BUSCANDO PC POR SERIAL");
        System.out.println("Serial: ");
        int serialBuscado = sc.nextInt();
        boolean bandera = false;
        for (int i = 0; i < lista.size(); i++) {
            Computador pcRecuperado = (Computador) lista.get(i);
            //comparo
            if (pcRecuperado.getSerial() == serialBuscado) {
                System.out.println("marca: " + pcRecuperado.getMarca());
                System.out.println("serial: " + pcRecuperado.getSerial());
                bandera = true;
            }

        }
        if (bandera == false) {
            System.out.println("PC NO encontrado!! ");
        }
    }

    void buscarPC_marca() {
        System.out.println("BUSCANDO PC POR MARCA");
        System.out.print("MARCA: ");
        String marcaBuscada = sc.next();
        int bandera = 0;
        for (int i = 0; i < lista.size(); i++) {
            Computador pcRecuperado = (Computador) lista.get(i);

            if (pcRecuperado.getMarca().equals(marcaBuscada)) {
                System.out.println("MARCA / SERIAL");
                System.out.print(pcRecuperado.getMarca() + " / " + pcRecuperado.getSerial());
                bandera = 1;
            }
        }
        if (bandera == 0) {
            System.out.println("PC NO encontrado!!");
        }
    }

    void menu() {
        int opcion;
        do {
            System.out.println("""
                           \n*****MENU DE OPCIONES*****
                           --------------------------
                           1. Rgistrar  PCs
                           2. Lisstar   PCs
                           3. Buscar PC por serial
                           4. Buscar PC por marca
                           5. Sair
                           Digite una opcion:
                           """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.Registrar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.buscarPC_serial();
                    break;
                case 4:
                    this.buscarPC_marca();
                    break;
                case 5:
                    System.out.println("SALIENDO......");
                    break;
            }
        } while (opcion != 5);
    }
}
