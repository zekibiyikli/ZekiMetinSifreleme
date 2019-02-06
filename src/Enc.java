import java.util.Scanner;

public class Enc {

	public static void Islem(){
		Scanner input=new Scanner(System.in);
		String[] words;
		String metin;
		String encmetin = "";
		char[] harf= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','y','z','x','w','q','1','2','3','4','5','6','7','8','9','0','+','-','*','/','.',',','%','!','?','ü','ö','ç','ð','ý','þ'};
		int frst = 0,lst = 0,result;
		boolean yon;
		
		System.out.print("Þifrelenecek metni giriniz: ");
		metin=input.nextLine().trim();
		metin=metin.toLowerCase();
		words=metin.split(" ");
		
		for(int i=0;i<words.length;i++) {
			char firstvalue=words[i].charAt(0);
			char lastvalue=words[i].charAt(words[i].length()-1);
			
			for(int a=0;a<harf.length;a++) {
				if(harf[a]==firstvalue) {
					frst=a;
				}
			}
			for(int a=0;a<harf.length;a++) {
				if(harf[a]==lastvalue) {
					lst=a;
				}
			}

			result=Math.abs((frst-lst));
			
			if(result%2==0) {
				yon=true;
			}else {
				yon=false;
			}

			int resultindis=0;
			for(int a=0;a<words[i].length();a++) {
				 for(int j=0;j<harf.length;j++) {
					 if(yon) {
						 if(words[i].charAt(a)==harf[j]) {
							 resultindis=j-result;
							 if(resultindis<0) {
								 resultindis=harf.length+resultindis;
								 encmetin=encmetin+harf[resultindis];
							 }
							 else {
								 encmetin=encmetin+harf[resultindis];
							 }
						 }
					 }else {
						 if(words[i].charAt(a)==harf[j]) {
							 resultindis=j+result;
							 if(resultindis>harf.length-1) {
								 resultindis=resultindis-harf.length;
								 encmetin=encmetin+harf[resultindis];
							 }
							 else {
								 encmetin=encmetin+harf[resultindis];
							 }
						 }
					 }
				 }
			}
			encmetin+="<"+result+"<";
		}
		
		System.out.println(encmetin);
	}
}
