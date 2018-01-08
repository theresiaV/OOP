/*Contoh OOP*/

class LaptopFull extends Komputer implements MyInterface
{	 
	 public void iHidupkan(){
		 System.out.println("This computer is on");
	 }
	 
	 public void iMatikan(){
		 System.out.println("This computer is off");
	 }
	 
	 public static void main(String[] args){
		 MyInterface obj = new LaptopFull();
		 obj.iHidupkan();
		 obj.iMatikan();
		 
		 Komputer komp = new Komputer();
		 Komputer kompu = new Komputer();
	
		 System.out.println("Merk : " + komp.getDMerk());
		 System.out.println("Price : " + komp.getDPrice());
		
		 kompu.DisplaySpesifikasi("Lenovo",3000);
		 komp.DisplaySpesifikasi("ASUS","i7",1000);
	 }
}