package fr.esisar.calculatrice.operations.binaires;

public abstract class abstractOperationBinaire implements OperationBinaire {

	/**
	 * Deux instances sont considérées égales si elles appartiennent à la même
	 * classe.
	 *
	 * @param obj l'objet à comparer.
	 * @return {@code true} si l'objet appartient à la même classe, sinon
	 *         {@code false}.
	 */
	@Override
	public boolean equals(Object obj) {
		return obj != null && this.getClass() == obj.getClass();
	}

	/**
	 * Le hashCode est basé sur la classe, garantissant que toutes les instances
	 * d'une même opération ont le même hashCode.
	 *
	 * @return le hashCode basé sur la classe.
	 */
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
