package by.training.first_task_arrays.entity;

import java.util.Arrays;

public class CustomArray {
	private int[] array;

	public CustomArray(int... array) {
		this.array = array.clone();
	}

	public int[] getArray() {
		return array.clone();
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "CustomArray [array=" + Arrays.toString(array) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
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
		CustomArray other = (CustomArray) obj;
		return Arrays.equals(array, other.array);
	}
}
