package studio7;

public class Die {
	private int n;
	
	public Die (int initn) {
		n = initn;
	}
	public int randomNum() {
		int randomNum = (int) (Math.random()*n) + 1;
		return randomNum;
	}
	public static void main(String[] args) {
		Die roll1 = new Die (10);
		System.out.println(roll1.randomNum());
	}
}
