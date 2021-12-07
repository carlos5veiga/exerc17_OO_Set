package entities;

import java.util.Objects;

public class Matricula {
	
	private Integer codigo;
	private Character curso;
	
	public Matricula() {
	}

	public Matricula(Integer codigo, Character curso) {
		this.codigo = codigo;
		this.curso = curso;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Character getCurso() {
		return curso;
	}

	public void setCurso(Character curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
}
