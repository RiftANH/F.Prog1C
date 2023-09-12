/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Eclip
 */
public class EVA1_8_AREA_TRIANGULO {

    public static void main(String[] args) {
        double base;//double-->tipo de dato para numeros con parte decimal
        double altura;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Introducir base");
        base = input.nextDouble();
        System.out.println("Introducir altura");
        altura = input.nextDouble();
        area = base*altura/2;
        System.out.println("el area es:");
        System.out.println(area);
    }
}
