import java.util.Scanner;

public class Dec {
	
	public static void Islem(){
		Scanner input=new Scanner(System.in);
		String[] words;
		String metin;
		String decmetin = "";
		char[] harf= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','y','z','x','w','q','1','2','3','4','5','6','7','8','9','0','+','-','*','/','.',',','%','!','?','ü','ö','ç','ð','ý','þ'};
		int frst = 0,lst = 0,result;
		boolean yon;

		System.out.print("Þifreyi giriniz: ");
		metin=input.nextLine().trim();
		metin=metin.toLowerCase();
		words=metin.split("<");

		for(int i=0;i<words.length;i=i+2) {
			result=Integer.parseInt(words[i+1]);
			
			if(result%2==0) {
				yon=true;
			}
			else {
				yon=false;
			}

			int resultindis=0;
			for(int a=0;a<words[i].length();a++) {
				 for(int j=0;j<harf.length;j++) {
					 if(yon) {
						 if(words[i].charAt(a)==harf[j]) {
							 resultindis=j+result;
							 if(resultindis>harf.length-1) {
								 resultindis=resultindis-harf.length;
								 decmetin=decmetin+harf[resultindis];
							 }
							 else {
								 decmetin=decmetin+harf[resultindis];
							 }
						 }
					 }else {
						 if(words[i].charAt(a)==harf[j]) {
							 resultindis=j-result;
							 if(resultindis<0) {
								 resultindis=resultindis+harf.length;
								 decmetin=decmetin+harf[resultindis];
							 }
							 else {
								 decmetin=decmetin+harf[resultindis];
							 }
						 }
					 }
				 }
			}
			
			decmetin+=" ";
			
		}
		
		System.out.println(decmetin);
		
	}

}
