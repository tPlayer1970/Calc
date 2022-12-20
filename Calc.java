import java.util.*;

class Roman {
		
		
		enum MyNumber {
			I(1),
			II(2),
			III(3),
			IV(4),
			V(5),
			VI(6),
			VII(7),
			VIII(8),
			IX(9),
			X(10);
		private final int value;
		MyNumber (final int newValue) {
			value = newValue;
			}
		public int getValue() { return value;}; 
		
		}
	 	
		Roman (String[] RarrStrResult) { 
			System.out.println("RomaCalc is working...");
			MyNumber firstMyNumber = MyNumber.valueOf(RarrStrResult[0]);
			MyNumber secondMyNumber = MyNumber.valueOf(RarrStrResult[2]);
			int result = 0;
			if (RarrStrResult[1].equals("*")) { result = firstMyNumber.getValue()*secondMyNumber.getValue();};
			if (RarrStrResult[1].equals("+")) { result = firstMyNumber.getValue()+secondMyNumber.getValue();};
			if (RarrStrResult[1].equals("-")) { result = firstMyNumber.getValue()-secondMyNumber.getValue();};
			if (RarrStrResult[1].equals("/")) { result = firstMyNumber.getValue()/secondMyNumber.getValue();};
			if (result > 1) {System.out.println(this.intToRoman(result));} else {System.out.println("Exception !!!!");System.exit(0);};

			System.exit(0);
			}
			
		String intToRoman(int number)   	
			{  

			String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
			String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
			String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
			return hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + units[number % 10];  
			}  
    
	}
		
			
public class Calc {
	
		public static void main(String[] args) {
			System.out.println("Working..");
			Scanner sc = new Scanner(System.in);
			String inPut = sc.nextLine();
			String[] arrStrResult = new String[2];
			arrStrResult = inPut.split("((?<=\\+)|(?=\\+))|((?<=\\*)|(?=\\*))|((?<=\\-)|(?=\\-))|((?<=\\/)|(?=\\/))");
			if (arrStrResult.length > 3) {
								System.out.println("Overflow");
								System.exit(0);
							} ;
			int firstNumber = 0;
			int secondNumber = 0; 
			try {
				firstNumber = Integer.parseInt(arrStrResult[0]);}

			catch  (Exception e) { 
				Roman roman = new Roman(arrStrResult); };
			secondNumber = Integer.parseInt(arrStrResult[2]);
			
			/* System.out.println(firstNumber);
			System.out.println(secondNumber);
			 System.out.println(arrStrResult[1]);*/

			if (arrStrResult[1].equals("+")) {System.out.println(firstNumber+secondNumber);};
			if (arrStrResult[1].equals("*")) {System.out.println(firstNumber*secondNumber);}; 
			if (arrStrResult[1].equals("-")) {System.out.println(firstNumber-secondNumber);};
			if (arrStrResult[1].equals("/")) {System.out.println(firstNumber-secondNumber);}; 			
		}
	 	
}
