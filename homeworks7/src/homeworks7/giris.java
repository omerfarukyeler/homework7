package homeworks7;

import java.util.Arrays;
import java.util.Scanner;

public class giris {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("5 adet urun kazandiniz !!!");
		
		System.out.println("lutfen almak istediginiz 5 adet urun giriniz ");
		System.out.println("lutfen 1.urunu giriniz");		
		String urun1 =  scan.nextLine();
		System.out.println("lutfen 2.urunu giriniz");
		String urun2 =  scan.nextLine();
		System.out.println("lutfen 3.urunu giriniz");
		String urun3 =  scan.nextLine();
		System.out.println("lutfen 4.urunu giriniz");
		String urun4 =  scan.nextLine();
		System.out.println("lutfen 5.urunu giriniz");
		String urun5 =  scan.nextLine();	
		
		array obj1 = new array();
		
		obj1.deneme1(urun1, urun2, urun3, urun4, urun5);
		
		
		
		//alfabetik sıraya gore yazdırma
		
		/*String myArray[] = {urun1, urun2 ,urun3,urun4,urun5};
		
		Arrays.sort(myArray);
		
		System.out.println(Arrays.toString(myArray));*/
		
		//urunu degistirme ve arama 
		
		String myArray[] = {urun1, urun2 ,urun3,urun4,urun5};
		
		myArray[3]= "telefon";
		
		
		Arrays.sort(myArray);
		
		System.out.println(Arrays.toString(myArray));
		
		System.out.println(Arrays.binarySearch(myArray, "telefon"));  
		
		if (Arrays.binarySearch(obj1.deneme1(urun1, urun2, urun3, urun4, urun5),"telefon")>=0) {
			System.out.println("Degisiklik yaptiginiz urun listeye eklenmistir." + obj1.deneme1(urun1, urun2, urun3, urun4, urun5)[3]);
		}
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	
		
        
	
		
		
		
		
		
				
		
		
		
		
		
		
	}
		
		
	
		
	


