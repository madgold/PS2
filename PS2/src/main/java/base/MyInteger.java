package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger() {
		
	}
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if (iValue % 2 == 1)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		for(int i=2;i < iValue;i++){
			if (iValue % i == 0)
				return false;
		}
		return true;

	}
	
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public static boolean isOdd(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}
	
	public static boolean isPrime(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	public boolean isEquals(int iValue) {
		if (this.iValue == iValue)
			return true;
		else
			return false;
	}

	public boolean isEquals(MyInteger n) {
		return isEquals(n.getiValue());
	}
	
	
}
