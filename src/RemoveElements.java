
public class RemoveElements {

	  public ListNode removeElements(ListNode head, int val) {
	        ListNode node = head;
	        if(head==null){return null; }
	        if(head.next==null){
	            if(head.val==val){return null;}
	            else{return head;}
	        }
	        
	        while(node!=null){
	            if(node.val==val){
	                if(node.next==null){ node=null; continue;}
	                else{node.val=node.next.val;node.next=node.next.next;}
	                node=node.next;
	            }else{
	                node=node.next;
	                continue;
	            }
	        }
	        return head;
	    }
	  
	 public static void main(String args[]) {
		 ListNode head = new ListNode(1);
		 head.next=new ListNode(1);
		 
		 RemoveElements r= new RemoveElements();
		 System.out.println(r.removeElements(head, 1).val);
		 
		
	}
}
