package bancoLitoral;

public enum ClienteTipoEnum {
	PERSONAL("Personal"), COMERCIAL("Comercial"), CONSTRUCCION("Construccion");

	private String descripcion;

	private ClienteTipoEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return descripcion;
	}
}
