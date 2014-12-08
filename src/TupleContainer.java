import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TupleContainer implements Cloneable {

	Container X, Y, Z;

	public TupleContainer(int x, int y, int z) {
		super();
		this.X = new Container(x, 0);
		this.Y = new Container(y, y);
		this.Z = new Container(z, z);
	}

	public TupleContainer(Container x, Container y, Container z) {
		super();
		this.X = x;
		this.Y = y;
		this.Z = z;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((X == null) ? 0 : X.hashCode());
		result = prime * result + ((Y == null) ? 0 : Y.hashCode());
		result = prime * result + ((Z == null) ? 0 : Z.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TupleContainer other = (TupleContainer) obj;
		if (X == null) {
			if (other.X != null)
				return false;
		} else if (!X.equals(other.X))
			return false;
		if (Y == null) {
			if (other.Y != null)
				return false;
		} else if (!Y.equals(other.Y))
			return false;
		if (Z == null) {
			if (other.Z != null)
				return false;
		} else if (!Z.equals(other.Z))
			return false;
		return true;
	}

	@Override
	public TupleContainer clone() {
		TupleContainer temp = new TupleContainer(X.clone(), Y.clone(),
				Z.clone());
		return temp;
	}

	@Override
	public String toString() {
		return "TupleContainer [X=" + X + ", Y=" + Y + ", Z=" + Z + "]";
	}

	public Collection<TupleContainer> MixUpContainers() {
		ArrayList<TupleContainer> collection = new ArrayList<TupleContainer>();
		Container tempContainerX, tempContainerY, tempContainerZ;

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerX.pour(tempContainerY);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerY.pour(tempContainerX);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerY.pour(tempContainerZ);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerZ.pour(tempContainerY);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerX.pour(tempContainerZ);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		tempContainerX = X.clone();
		tempContainerY = Y.clone();
		tempContainerZ = Z.clone();
		tempContainerZ.pour(tempContainerX);
		collection.add(new TupleContainer(tempContainerX, tempContainerY,
				tempContainerZ));

		HashSet<TupleContainer> hashSet = new HashSet<TupleContainer>();
		hashSet.addAll(collection);
		collection.clear();
		collection.addAll(hashSet);

		return collection;

	}

}
