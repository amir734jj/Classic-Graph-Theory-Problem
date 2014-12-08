public class Container implements Cloneable {

	int Size;
	int currentVolume;

	public Container(int Size, int Volume) {
		super();
		this.Size = Size;
		this.currentVolume = Volume;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int Size) {
		this.Size = Size;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public boolean isEmpty() {
		if (this.getCurrentVolume() == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (this.getCurrentVolume() == this.getSize())
			return true;
		else
			return false;
	}

	public void pour(Container container) {
		while (!container.isEmpty()) {
			if (this.getCurrentVolume() + 1 <= this.getSize()
					&& container.getCurrentVolume() - 1 >= 0) {
				this.setCurrentVolume(this.getCurrentVolume() + 1);
				container.setCurrentVolume(container.getCurrentVolume() - 1);
			} else
				return;
		}
	}

	@Override
	public Container clone() {
		Container tempContainer = new Container(this.getSize(),
				this.currentVolume);
		return tempContainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Size;
		result = prime * result + currentVolume;
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
		Container other = (Container) obj;
		if (Size != other.Size)
			return false;
		if (currentVolume != other.currentVolume)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "< Capacity: " + this.getSize() + " , Current Volume: "
				+ this.getCurrentVolume() + " >";
	}

}
