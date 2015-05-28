import java.lang.*;
import java.util.*;
public class Solution{
	public int reverseBits(int n) {
        if(n>2147483647){
            System.out.println("error");
            return 0;
        }
        
        String s1 = Integer.toBinaryString(n);
       
        //if(s1.charAt(31)=='1'){
          //   System.out.println("error: reversing will make it negative number");
        //}
        StringBuilder str = null;
        System.out.println("hi");
       
        // filling up 0s if less than 32
        if(s1.length()<32){  
             str= this.fillZeros(s1,str,32);
        }else{
             str = new StringBuilder(s1);
        }
        System.out.print("input ");
        System.out.println(str);
       // until now all right
       //  swap  to reverse bits
       str=this.swap(str);
       System.out.print("after swap ");
       System.out.println(str);
       s1=str.toString();

      /* if(str.charAt(0)=='1'){
    	   str=this.convertToPositive(str);
       }*/
       System.out.print("converted to positive ");
       System.out.println(str);
       //int output = Integer.parseInt(s1);
       int output1= Integer.parseUnsignedInt(s1);
       return output1;
     
     }
     
    public StringBuilder convertToPositive(StringBuilder str){
        for(int i=0; i<str.length()-1; i++)
        {//find 2s complement technique
            if(str.charAt(i)=='1'){
                return str;
            }else{
                str.insert(i,'1');
            }
        }
        return str;
    }
    
    public StringBuilder swap(StringBuilder str){
       int j=31;
	   char temp=' ';
	   for(int i=0;i<=15;i++)
	   {
	            //simple swapping
	            temp = str.charAt(i); 
	            str.setCharAt(i,str.charAt(j));
	            str.setCharAt(j,temp); 
	            j--;
	   }
	   return str;
    }
    public StringBuilder fillZeros(String s1,StringBuilder str, int size){
        if(s1.length()<size){  
            int num = size - s1.length();
            char[] charArray = new char[num];
            Arrays.fill(charArray,'0');
            String s = new String(charArray);
            s=s.concat(s1);
            str = new StringBuilder(s);
        }else{
             str = new StringBuilder(s1);}
            return str;
    }
    public int binaryStringToInteger(String s){
        int j =0;
        int num = 0;
        //System.out.println(s.length());
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == '1')
            {
                num =  (num + (int)Math.pow(2,j) +1);
            }
            if(i==0){
            	System.out.println((int)Math.pow(2,j)+1);
            	System.out.println(num);
            }
            j++;
            
        }
        
       
        return num;
    }

public static void main(String[] args) {
    //ReverseBits r = new ReverseBits()
    Solution s = new Solution();
    int n = Integer.parseInt(args[0]);
 
    System.out.println(s.reverseBits(n));
}
}