/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_15;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // Create a Scanner
		int[] numeros = new int[10]; // Create an array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = input.nextInt();

		// Get distinct numbers
		int[] distinctNumbers = eliminateDuplicates(numeros);

		// Display the result
		System.out.print("Los números distintos son:");
		for (int e: distinctNumbers) {
			if (e > 0)
				System.out.print(" " + e);
		}
		System.out.println();
	}

	/** eleminateDuplicates returns a new array with duplicate values eliminated */
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i = 0;	// index distinctList
		for (int e: list) {
			if (linearSearch(distinctList, e) == -1) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
	}

	/** linearSearch */
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}
