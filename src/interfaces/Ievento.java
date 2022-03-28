package interfaces;

import java.time.Duration;
import java.time.LocalDate;

import entities.Entrada;
import entities.Tipo;

public interface Ievento {
	Entrada crearEntrada(Tipo tipoEntrada,Duration duracion,LocalDate fecha);
}
