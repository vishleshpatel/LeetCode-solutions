import java.util.*;
public class MinStack {
	  
	    class Node{
	    	int value;
	    	Node bottomNext;
	    
	    	public Node(int val){
	    		this.value =val;
	    	}
	    }
	    
	    Node top;
	    Stack<Integer> min = new Stack<Integer>();
	  
	    public void push(int x) {
	       Node n = new Node(x);
	       
	        if(top == null){
	            top = n;
	            min.push(x);
	        }else{ 
	            Node temp = top;
	            top = n;
	            top.bottomNext = temp;
	           
	            if(x<=min.peek()){
	                min.push(x);
	            }
	         }
	        }
	    

	    public Node pop() {
	    	Node n = top;
	    	if(min.peek()!=null){
	    		int num1=min.peek();
	    	
	    		if(n.value==num1){
	    			int num= min.pop();
	        }}
	    	top = top.bottomNext;
	    	return n;
	    }

	    public int top() {
	    return top.value;
	    }

	    public int getMin() {
	        if(min.peek()!=null){
	            return min.peek();                
	        }else{
	            return 0;
	        }

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack m =new MinStack();
		m.push(2);m.push(0);m.push(3);m.push(0);
		System.out.println(m.getMin());
		System.out.println(m.pop().value);
		System.out.println(m.getMin());
		System.out.println(m.pop().value);
		System.out.println(m.getMin());
		System.out.println(m.pop().value);
		System.out.println(m.getMin());
	}

}
