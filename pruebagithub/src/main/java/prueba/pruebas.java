/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author ivan
 */
public class pruebas {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
                System.out.println("Números pares del 1 al 100");
		byte numero;
		numero = 1;
		while (numero<=100) {
			if (numero%2==0) {
				System.out.println(numero);
			}
			numero++;
		}
			
	}
}
