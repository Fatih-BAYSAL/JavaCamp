package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü!");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar yükseldi!");
		}else {
			System.out.println("Dolar eşittir!");
		}
		
		
		String[] krediler = {"Hızlı Kredi","Mutlu Emekli Kredisi","Konut Kredisi","Çiftçi Kredisi","Msb Kredisi","Meb Kredisi"};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		for(int i =0; i <krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		
		
		
	}

}
