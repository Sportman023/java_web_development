package by.training.pre_task_numbers.base;

public class CustomNumber implements Comparable<CustomNumber>{
	private double value;
	
	public CustomNumber(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "CustomNumber [value=" + value + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		//if null???
        return Double.hashCode(value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomNumber other = (CustomNumber) obj;
		return value == other.getValue();
	}
	@Override
	public int compareTo(CustomNumber customNumber) {
		return Double.compare(value, customNumber.getValue());
	}

}
