public class SLL {

	public SLL_Node head = null;
	public SLL_Node tail = null;
	public void add(Object data) {
		
		if(head==null) {
			SLL_Node newNode = new SLL_Node(data);                   // adding first element
			head = newNode;
			tail = newNode;
		}
		else  {           // adding to front node the first element
			SLL_Node newnode = new SLL_Node(data);
			newnode.setLink(head);
			head = newnode;
		}
	}
	public void delete(Object dataToDelete) {
		if(size()==1) {
			head = null;
			return;
		}
		while((Integer)head.getData()==(Integer)dataToDelete)
			head = head.getLink();
		SLL_Node temp = head;
		SLL_Node previous = null;
		while(temp != null) {
			if((Integer)temp.getData()==(Integer)dataToDelete) {
				previous.setLink(temp.getLink());
				temp=previous;
			}
			previous = temp;
			temp = temp.getLink();
		}
	}
	public boolean search(Object item) {
		boolean flag = false;
		if(head == null)
			System.out.print("Linked list empty.");
		else {
			SLL_Node temp = head;
			while(temp != null) {
				if(item == temp.getData()) 
					flag = true;
				temp = temp.getLink();
			}
		}
		return flag;
	}
	public void display() {
		SLL_Node current = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(current != null) {
			System.out.print(current.getData()+" ");
			current = current.getLink();
		}
	}
	public int size() {
		int count = 0;
		if(head == null) {
			System.out.println("Linked list is empty.");
		}
		else {
			SLL_Node temp = head;
			while(temp != null){
				count++;
				temp=temp.getLink();
			}
		}
		return count;
	}
}
