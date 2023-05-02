package CastingProblems;

public class reverseNumber {

	public static void main(String[] args) {
    int num = 12345;
    char ch;
    String revNum = "";
    String oriNum = Integer.toString(num);
    
    for(int i=0;i<oriNum.length();i++)
    {
    	ch= oriNum.charAt(i);
    	revNum= ch + revNum;
    }
    System.out.println(revNum);
		
	}

}
