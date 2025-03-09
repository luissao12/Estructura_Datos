/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercico1;

import java.util.Scanner;

/**
 *
 * @author martin
 */
public class Materia {

    Scanner scan = new Scanner(System.in);
    double Notas[][] = new double[2][3];

    void agregar() {
        System.out.println("Registro Notas: ");
        for (int i = 0; i < Notas.length; i++) {
            for (int j = 0; j < Notas[i].length; j++) {
                System.out.println((i + 1) + " estudiante \ndigite " + (j + 1) + "nota :");
                Notas[i][j] = scan.nextDouble();

            }
        }
    }

    void mostrar() {
        System.out.println("NOTA  1/ NOTA  2/NOTA  3");
        for (int i = 0; i < Notas.length; i++) {
            for (int j = 0; j < Notas[i].length; j++) {

                System.out.print(Notas[i][j] + "/    ");
            }
            System.out.println("");
        }
    }

    void Promedio() {
        System.out.println("PROMEDIO POR ESTUDIANYE");
        double promedio = 0, suma = 0;
        for (int i = 0; i < Notas.length; i++) {
            for (int j = 0; j < Notas[i].length; j++) {
                suma = suma + Notas[i][j];
            }
            promedio = suma / 3;
            System.out.println(" Promedio del etudiante: "+promedio);
            suma =0;
        }
    }

    void menu() {
        int opc = 0;
        do {
            System.out.print(""" 
                            \n**MENU DE OPCIONES****
                           ___________________________ 
                         
                            1. llenar arreglo
                            2. Listar arreglo
                            3. Buscar cedula
                            4. Salir
                            
                            Digite una opcion:
                            """);
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    this.agregar();
                    break;
                case 2:
                    this.mostrar();
                    break;
                case 3:
                    this.Promedio();
                    break;
            }
        } while (opc != 4);
    }
}
