
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String choice;
		boolean deger=true;
		
		while(deger) {
			System.out.print("1-�ifreleme\n2-�ifre ��zme\n\nL�tfen ��lem se�iniz:");
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
				System.out.println("Hatal� i�lem yapt�n�z.");
			}
		}
	}

}
