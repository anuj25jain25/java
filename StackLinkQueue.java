class Stack
{
	int top;
	int[] arr ;

	Stack()
	{
		arr= new int[10];
		top=-1;
	}
	void push(int n)
	{
		if(top==arr.length-1)
		{	
			System.out.println("overflow");
		}
		
		else
		{
			top=top+1;
			//return (n);
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
		}
		else if(top==-2)
		{
			System.out.println("Unederflow");
		}
		else
		{
			top=top-1;
		}
	}
}
class Link
{
	Item start,nxt,temp;
	
	Link()
	{
		start = null;
		nxt = null;
		temp = null;
	}
	void add(int num)
	{
		Item refr=new Item();
		if(start==null)
		{
			start=refr;
			start.a=num;
			start.next=null;
			
		}
		else
		{	
			
			temp=start;
			nxt=refr;
			nxt.a=num;
			nxt.next=null;
			start.next=nxt;
		}
	}
	void del()
	{	Item del=new Item();
		if(start.next==null)
		{
			start=del;
		}
		else
		{
			nxt=del;
		}
	}
	void show()
	{
		System.out.println("\n element: "+start.a);
		System.out.println("\n element: "+nxt.a);
	}
	class Item
	{
		int a;
		Item next;
	}
}
class Queue
{
}
class Main
{
	public static void main(String[] arg)
	{
		Stack s=new Stack();
		s.push(2);
		s.push(5);
		s.push(10);
		s.push(1);
		System.out.println(s.top);
		System.out.println(s.arr);
		s.pop();
		System.out.println(s.top);
		Link l=new Link();
		l.add(10);
		l.add(20);
		l.add(1);
		l.show();
		l.del();
		l.show();
		
	}
}