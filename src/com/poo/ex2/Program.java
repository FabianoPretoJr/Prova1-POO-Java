package com.poo.ex2;

import java.util.ArrayList;
import java.util.Scanner;

import com.poo.ex2.models.Point;

public class Program {
	public static void main(String args[]) {
        int total = 0;
        double coordinateX, coordinateY;
        ArrayList<Point> points = new ArrayList<Point>();

        Scanner intInput = new Scanner(System.in);
        Scanner doubleInput = new Scanner(System.in);
        
        try {
	        do {
	            System.out.print("Digite o numero de pontos a serem coletados: ");
	            total = intInput.nextInt();
	        } while (total < 0);
	
	        for (int i = 0; i < total; i++) {
	            System.out.printf("Digite a coordenada 'X' do ponto %d: ", i + 1);
	            coordinateX = doubleInput.nextDouble();
	
	            System.out.printf("Digite a coordenada 'Y' do ponto %d: ", i + 1);
	            coordinateY = doubleInput.nextDouble();
	
	            points.add(new Point(coordinateX, coordinateY));
	        }
	
	        System.out.println("Exibindo quadrantes dos pontos coletados...");
	
	        for (int i = 0; i < points.size(); i++) {
	            Point point = points.get(i);
	            System.out.printf("P%d: %s\n", i + 1, point.getTextQuadrant());
	        }
        }finally {
        	intInput.close();
            doubleInput.close();
		}
        
    }
}
