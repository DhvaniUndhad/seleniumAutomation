package co.selenium.eclips;

public class PracticeString {

	public static void main(String[] args) {
		
		
		String str = "Dhvani Undhad";
		String newS = "";	
		int arry[] = {2,4,5,7,9};
		int sum=0;
		for(int i= str.length()-1; i>=0;i--){
			
			newS = newS+ str.charAt(i);
		}
		for(int j =0; j<arry.length; j++){
			sum =sum+ arry[j];
			
		}
		System.out.println(newS);
		System.out.println(sum);
	}

}
