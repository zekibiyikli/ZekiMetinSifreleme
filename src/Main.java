
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String choice;
		boolean deger=true;
		
		while(deger) {
			System.out.print("1-Þifreleme\n2-Þifre Çözme\n\nLütfen Ýþlem seçiniz:");
			choice=input.nextLine();

			
			if(choice.equals("1")) {
				Enc.Islem();
				deger=false;
				
			}
			else if(choice.equals("2")) {
				Dec.Islem();
				deger=false;
			}
			else {
				System.out.println("Hatalý iþlem yaptýnýz.");
			}
		}
	}

}
