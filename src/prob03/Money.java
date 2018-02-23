package prob03;

public class Money {

	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Money(Money obj) {
		this.amount += obj.amount;
	}

	public Object add(Money add) {
		Money temp = new Money(add);
		Money s = new Money(this.amount + temp.amount);
		return s;
	}

	public Object minus(Money sub) {
		Money temp = new Money(sub);
		Money s = new Money(this.amount - temp.amount);
		return s;
	}

	public Object multiply(Money mul) {
		Money temp = new Money(mul);
		Money s = new Money(this.amount * temp.amount);
		return s;
	}

	public Object devide(Money div) {
		Money temp = new Money(div);
		Money s = new Money(this.amount / temp.amount);
		return s;
	}

	@Override
	public String toString() {
		String s = String.valueOf(this.amount);
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
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
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

}
