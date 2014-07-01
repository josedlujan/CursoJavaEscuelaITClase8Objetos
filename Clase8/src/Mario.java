
public class Mario extends Heroe{
	String color;
	
	public Mario(){
		this.vida=3;
		this.genero="Heroe";
		this.color="rojo";
		System.out.println("Mario esta creado con 3 vidas");
	}
	
	
	public Mario(String nombre){
		this.vida=2;
		this.genero="Heroe";
		this.color="rojo";
		System.out.println("Mario esta creado con 2 vidas");
	}
	
	protected void finalize() throws Throwable{
		try {
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("acabando");
			super.finalize();
		}
	}
	
	
}
