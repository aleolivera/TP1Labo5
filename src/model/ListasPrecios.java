package model;

import java.util.ArrayList;
import java.util.ListIterator;
import entities.Precio;
import entities.Tipo;

public class ListasPrecios {
	/*
	 El array que tiene todos los precios estaria formado asi
	 
	 |     TIPO EVENTO      |      TIPO ENTRADA      | IMPORTE
	 | id=1 nombre=recital  | id=1 nombre='generales'| 800
	 | id=1 nombre=recital  | id=2 nombre='VIP'      | 1500
	 | id=2 nombre=teatro   | id=1 nombre='fijo'     | 1350.50
	 | id=3 nombre=infantil | id=1 nombre='menor'    | 250
	 | id=3 nombre=infantil | id=2 nombre='mayor'    | 500
	 | id=4 nombre=deporte  | id=1 nombre='futbol'   | 300
	 | id=4 nombre=deporte  | id=2 nombre='rugby'    | 450
	 | id=4 nombre=deporte  | id=3 nombre='jockey'   | 380
	 
	 */
	
	private ArrayList<Precio> entradasPrecios= new ArrayList<Precio>();
	
	public ListasPrecios() {
		entradasPrecios.add(new Precio(new Tipo(1,"recital"),new Tipo(1,"generales"),800));
		entradasPrecios.add(new Precio(new Tipo(1,"recital"),new Tipo(2,"vip"),1500));
		entradasPrecios.add(new Precio(new Tipo(2,"teatro"),new Tipo(1,"fijo"),1350.5));
		entradasPrecios.add(new Precio(new Tipo(3,"infantil"),new Tipo(1,"menor"),250));
		entradasPrecios.add(new Precio(new Tipo(3,"infantil"),new Tipo(2,"mayor"),500));
		entradasPrecios.add(new Precio(new Tipo(4,"deporte"),new Tipo(1,"futbol"),300));
		entradasPrecios.add(new Precio(new Tipo(4,"deporte"),new Tipo(2,"rugby"),450));
		entradasPrecios.add(new Precio(new Tipo(4,"deporte"),new Tipo(3,"jockey"),380));
	}

	public ArrayList<Precio> getEntradasPrecios() {
		return entradasPrecios;
	}

	public void setEntradasPrecios(ArrayList<Precio> entradasPrecios) {
		this.entradasPrecios = entradasPrecios;
	}
	
	public double getImporte(Tipo tipoEvento, Tipo tipoEntrada) {
		ListIterator<Precio> iterator = entradasPrecios.listIterator();
		while(iterator.hasNext()) {
			Precio p= iterator.next();
			if(p.getTipoEntrada().getId()==tipoEntrada.getId() && p.getTipoEvento().getId()==tipoEvento.getId()) {
				return p.getImporte();
			}
		}
		return -1;
	}
	/*
	public double getEntradaRecital(Tipo tipoEntrada) {
		ListIterator<Precio> iterator = entradasPrecios.listIterator();
		while(iterator.hasNext()) {
			Precio p= iterator.next();
			if(p.getTipoEntrada().getId()==tipoEntrada.getId() && p.getTipoEvento().getId()==1) {
				return p.getImporte();
			}
		}
		return -1;
	}
	
	public double getEntradaTeatro() {
		return entradasPrecios.get(2).getImporte();
	}
	
	public double getEntradaInfantiles(Tipo tipoEntrada) {
		ListIterator<Precio> iterator = entradasPrecios.listIterator();
		while(iterator.hasNext()) {
			Precio p= iterator.next();
			if(p.getTipoEntrada().getId()==tipoEntrada.getId() && p.getTipoEvento().getId()==3) {
				return p.getImporte();
			}
		}
		return -1;
	}
	
	public double getEntradaDeporte(Tipo tipoEntrada) {
		ListIterator<Precio> iterator = entradasPrecios.listIterator();
		while(iterator.hasNext()) {
			Precio p= iterator.next();
			if(p.getTipoEntrada().getId()==tipoEntrada.getId() && p.getTipoEvento().getId()==4) {
				return p.getImporte();
			}
		}
		return -1;
	}
	*/
}
