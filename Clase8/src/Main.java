
public class Main {
	public static void main(String[] argumentos){
		Mario mario = new Mario("juanito");
		//mario.caminar();
		
		try {
			mario.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
