/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Eclip
 */
public class EVA1_5_Entrada_Salida {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        //1. Declaracion de Variables
        String apellidos;
        String nombres;
        int control;
        String carrera;
        int semestre;
        Scanner input = new Scanner (System.in);
        //; Fin de Instruccion en Java
        //2. Captura de Datos/Variables
        System.out.println("Introduce tus Apellidos");
        apellidos = input.nextLine();
        System.out.println("Introduce tus Nombres");
        nombres = input.nextLine();
        System.out.println("Introduce tu No.Control");
        control = input.nexInt();
        System.out.println("Introduce tu Carrera");
        carrera = input.nextLine();
        System.out.println("Introduce tu Semestre");
        semestre = input.nextInt();
        //Java es sensible a mayusculas y minusculas
        //Es decir: es diferente System que system
        //3. Mostrar los Datos Capturados
    }
}
