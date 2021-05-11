package modele;

public class beann {
	private int num; 

	public beann() {
		setNum(0);
		}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public static double aleatoir(String n) {
		return(( Math.random() * Double.parseDouble (n))); 
	
		
		
	}
	

}
