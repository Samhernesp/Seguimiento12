package model;

public class LinkedList {
	
	private Node first;
	private Node last;
	private Node actualTurn;
	private int size;

	public LinkedList() {
		
	}
	public String add() {
		size++;
		String s = "";
		if(size>50) {
			s="No se pueden crear más turnos";
		}else {
				Node newNode = new Node();
			if (first == null) { 
				first = newNode;
				last = newNode;
				first.setNext(last);
				last.setNext(first);
				first.setPrev(last);
				last.setPrev(first);
				actualTurn=newNode;
				first.setValue(1);
				last.setValue(1);
			} else {
				last.setNext(newNode);
				newNode.setPrev(last);
				int temp= last.getValue();
				last = newNode;
				last.setValue(temp+1);
				last.setNext(first);
			}
			s="Turno creado con exito";
		}
		
		return s;
	}
	
	public String showTurn() {
		String s="";
		if(first==null) {
			s="No se han creado turnos aun";
		}else {
			int turn=actualTurn.getValue();
			s="El turno actual es: " + turn;
		}
		
		return s;
	}
	
	public String passTurn() {
		String s="";
		if(first==null) {
			s="No se han creado turnos aun";
		}else {
			actualTurn.setPass();
			Node temp=actualTurn;
			if(actualTurn.getPass()==3) {
				deleteTurn();
			}
			actualTurn = temp.getNext();
		}
		return s;
		
	}
	
	public String deleteTurn() {
		String s="";
		if(first==null) {
			s="No se han creado turnos aun";
		}else {
				Node temp= actualTurn;
			if(actualTurn.equals(first) && actualTurn.equals(last)) {
				first=null;
				last=null;
				actualTurn=null;
			}else if(actualTurn.equals(first)) {
				first=temp.getNext();
			}else if(actualTurn.equals(last)) {
				last=temp.getPrev();
			}else {
				temp.getNext().setPrev(temp.getPrev());
				temp.getPrev().setNext(temp.getNext());
				actualTurn=temp.getNext();
			}
			
			size--;
		
		}
		
		return s;
		
	}


}
