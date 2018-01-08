//Contoh OOP

public class Komputer{
	private String merk;
	private String tipeProcessor;
	private int price;
	
	//constuctor
	Komputer(){
		this.merk = "ASUS";
		this.price = 3000;
	}
	
	Komputer(String mr,String tp,int pr){
		this.merk = mr;
		this.tipeProcessor = tp;
		this.price = pr;
	}
	
	//encapsulation
	public String getDMerk(){
		return merk;
	}
	
	public int getDPrice(){
		return price;
	}
	
	//overload
	public void DisplaySpesifikasi(String m,int p){
		System.out.println("Merk Laptop : " + m + " & price " + price);
	}
	
	//overload
	public void DisplaySpesifikasi(String m, String tp,int p){
		System.out.println("Spesification : Merk " + m + ",tipe processor " + tp + " & price " + p);
	}
}
