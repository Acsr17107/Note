package pro0324;

public class Exma09 {

	public static void main(String[] args) {
		Automobile pors = new Automobile();
		System.out.println(pors.getColor() + ", " + 
		pors.getSpeed() + ", " + pors.getSeatNum());
		
		Automobile benz = new Automobile("���", 0, 2);
		System.out.println(benz.getColor() + ", " + 
		benz.getSpeed() + ", " + benz.getSeatNum());
		
		Automobile iuAuto = new Automobile("������", 0, 4);
		System.out.println(iuAuto.getColor() + ", " + 
		iuAuto.getSpeed() + ", " + iuAuto.getSeatNum());
		
		iuAuto.upSpeed(400);
		System.out.println(iuAuto.getColor() + ", " + 
		iuAuto.getSpeed() + ", " + iuAuto.getSeatNum());
	}
}