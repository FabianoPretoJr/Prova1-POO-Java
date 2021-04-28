package com.poo.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner intInput = new Scanner(System.in);
        Scanner doubleInput = new Scanner(System.in);

        try {
	        double divida, juros, remaining, parcelas;
	        int parcels;
	
	        System.out.print("Digite o valor da divida: ");
	        divida = doubleInput.nextDouble();
	
	        System.out.print("Digite a taxa de juros como no exemplo (Ex: 5% = 5): ");
	        juros = 1 + (doubleInput.nextDouble()/100);
	    
	        System.out.print("Digite o numero de parcelas: ");
	        parcels = intInput.nextInt();
	
	        remaining = divida;
	        parcelas = 0;
	        System.out.println("Mes\t|\tTotal\t\t|\tPrestacao\t|\tRestante");
	
	        for (int i = 0; i <= parcels; i++) {
	            System.out.printf("%3d\t|\tR$ %8.2f\t|\tR$ %8.2f\t|\tR$ %8.2f\n", i, divida, parcelas, remaining);
	            divida = remaining * juros;
	            parcelas = divida / (parcels - i);
	            remaining = divida - parcelas;
	        }
        }finally {
			intInput.close();
			doubleInput.close();
			
		}
    }
}