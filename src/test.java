import java.lang.*;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =Integer.toBinaryString(1);
		 StringBuilder str = null;
		if(s1.length()<32){  
	            int num = 32 - s1.length();
	            char[] charArray = new char[num];
	            Arrays.fill(charArray,'0');
	            String s = new String(charArray);
	            s=s.concat(s1);
	            str= new StringBuilder(s);
		System.out.println(str);
		System.out.println(str.length());
	}else{
		str= new StringBuilder(s1);
	}
			int j=31;
	        char temp=' ';
	        for(int i=0;i<=15;i++)
	        {
	            temp = str.charAt(i);
	      
	          //(char) s.charAt(j) = (char) s.charAt(i);
	            str.setCharAt(i,str.charAt(j));
	            str.setCharAt(j,temp); //s.charAt(i) = temp;
	            j--;
	        }
	        
	        System.out.println(str);
	        System.out.println(str.charAt(31));
	  
	        
}
}