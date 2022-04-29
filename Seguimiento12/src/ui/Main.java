package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.LinkedList;

public class Main {
	
	private BufferedReader bfr;
	private LinkedList list;
	private static boolean flag;
	
	public Main() {
		
		bfr = new BufferedReader(new InputStreamReader(System.in));
		list= new LinkedList();
		flag= true;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Main main = new Main();
		while(flag) {
			main.menu();
		}
		
		
	}
	
	public void menu() throws NumberFormatException, IOException {
		System.out.println("Menu:\n"+
				"1.Dar turno.\n"+
				"2.Mostrar turno\n"+
				"3.Pasar turno\n"+
				"4.Eliminar turno actual.\n"+
				"5.Salir.");
		
		int op = Integer.parseInt(bfr.readLine());
		
		while (op < 1 || op > 5) {
			System.out.println("Digitaste una opcion invalida, digita de nuevo:");
			op = Integer.parseInt(bfr.readLine());
		}
		switch(op) {
			case 1:
				System.out.println(list.add());
				break;
			case 2:	
				System.out.println(list.showTurn());
				break;
			case 3:	
				System.out.println(list.passTurn());
				break;
			case 4:	
				System.out.println(list.deleteTurn());
				break;
			case 5:	
				exit();
				break;
		}
	
	}

	private void exit() {
		flag=false;
	}

	
	
	
}
