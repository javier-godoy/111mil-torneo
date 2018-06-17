package ar.com.rjgodoy.plan111mil.torneo.modelo;

public enum EstadoInscripcionEnum {

	INGRESADA(1), PRE_APROBADA(2), APROBADA(3), RECHAZADA(4);

	private final Integer id;

	private EstadoInscripcionEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static EstadoInscripcionEnum fromId(int id) {
		switch (id) {
		case 1:
			return INGRESADA;
		case 2:
			return PRE_APROBADA;
		case 3:
			return APROBADA;
		case 4:
			return RECHAZADA;
		default:
			throw new IllegalArgumentException();
		}
	}
}
