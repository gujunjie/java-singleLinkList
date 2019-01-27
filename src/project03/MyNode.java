package project03;


public class MyNode {
    
	
	private int data;
	private MyNode nextNode;
	
	public MyNode(int data)
	{
		this.data=data;
	}
	
	
	//对下个节点进行追加
	public MyNode append(MyNode node)
	{
		MyNode currentNode=this;//定义局部变量指向当前节点
		
		while(true)
		{   
			//如果当前节点的下个节点为空，也就是为单链表的最后一个节点
			if(currentNode.next()==null)
			{
				break;
			}
			currentNode=currentNode.next();//否则指向当前节点的下一个节点
		}
		currentNode.nextNode=node;
		return this;
	}
	
	//返回下一个节点
	public MyNode next()
	{
		return this.nextNode;
	}
	
	
	
	
	public int getData()
	{
		return data;
	}
	
	//显示所有的节点
	public void show()
	{
		MyNode currentNode=this;
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+ " ");
			currentNode=currentNode.nextNode;
		}
		
	}
	
	//删除当前节点的下一个节点
	public void removeNextNode()
	{
		this.nextNode=this.next().next();
	}
	
	//插入节点(仅限中间和尾部情况)
	public void insert(MyNode node)
	{
		node.nextNode=this.next();
		this.nextNode=node;
	
	}
	
}
