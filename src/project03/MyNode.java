package project03;


public class MyNode {
    
	
	private int data;
	private MyNode nextNode;
	
	public MyNode(int data)
	{
		this.data=data;
	}
	
	
	//���¸��ڵ����׷��
	public MyNode append(MyNode node)
	{
		MyNode currentNode=this;//����ֲ�����ָ��ǰ�ڵ�
		
		while(true)
		{   
			//�����ǰ�ڵ���¸��ڵ�Ϊ�գ�Ҳ����Ϊ����������һ���ڵ�
			if(currentNode.next()==null)
			{
				break;
			}
			currentNode=currentNode.next();//����ָ��ǰ�ڵ����һ���ڵ�
		}
		currentNode.nextNode=node;
		return this;
	}
	
	//������һ���ڵ�
	public MyNode next()
	{
		return this.nextNode;
	}
	
	
	
	
	public int getData()
	{
		return data;
	}
	
	//��ʾ���еĽڵ�
	public void show()
	{
		MyNode currentNode=this;
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+ " ");
			currentNode=currentNode.nextNode;
		}
		
	}
	
	//ɾ����ǰ�ڵ����һ���ڵ�
	public void removeNextNode()
	{
		this.nextNode=this.next().next();
	}
	
	//����ڵ�(�����м��β�����)
	public void insert(MyNode node)
	{
		node.nextNode=this.next();
		this.nextNode=node;
	
	}
	
}
