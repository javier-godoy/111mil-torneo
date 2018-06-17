package ar.com.rjgodoy.plan111mil.torneo.modelo;

import java.util.Objects;

public abstract class Entity {

	protected abstract Object getId();

	@Override
	public int hashCode() {
		Object id = getId();
		return 31 + 7 * ((id == null) ? 0 : id.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		return Objects.equals(this.getId(), other.getId());
	}

}
