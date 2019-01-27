package project03;

public class Text {
		public static void main(String[] args) {
			MyNode node1=new MyNode(1);
			MyNode node2=new MyNode(2);
			MyNode node3=new MyNode(3);
			MyNode node4=new MyNode(4);
			
			node1.append(node2).append(node3).append(node4);
			System.out.println(node1.next().next().next().getData());
			node1.show();
			System.out.println();
			node3.removeNextNode();
			node1.show();
			System.out.println();
			node2.insert(new MyNode(5));
			node3.insert(new MyNode(6));
			node1.show();
		}
}
