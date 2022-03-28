package interfaces;
import entities.Entrada;
import entities.Tipo;
import java.time.Duration;
import java.time.LocalDate;

public interface Ientrada {
	Entrada crearEntrada(Tipo tipoEntrada,Duration duracion,LocalDate fecha);
}
