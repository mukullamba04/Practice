package trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	int data;
	Node left, right;
	public Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}
	
	public void inorderTraversal_Recursive(Node root)
	{
		if(root.left!=null)
			inorderTraversal_Recursive(root.left);
		System.out.print(root.data + " ");
		if(root.right!=null)
			inorderTraversal_Recursive(root.right);
	}
	
	public void postTraversal_Recursive(Node root)
	{
		if(root.left!=null)
			postTraversal_Recursive(root.left);
		if(root.right!=null)
			postTraversal_Recursive(root.right);
		System.out.print(root.data + " ");
	}
	
	public void preTraversal_Recursive(Node root)
	{
		System.out.print(root.data + " ");
		if(root.left!=null)
			preTraversal_Recursive(root.left);
		if(root.right!=null)
			preTraversal_Recursive(root.right);
	}
	
	public int height(Node root)
	{
		int height = 0;
		if(root==null)
			return height;
		else 
		{
			height = 1;
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			int sizeOfQ = q.size();
			while(sizeOfQ>0)
			{
				sizeOfQ--;
				Node out = q.poll();
				if(out.left!=null)
					q.add(out.left);
				if(out.right!=null)
					q.add(out.right);
				if(sizeOfQ==0)
				{
					sizeOfQ = q.size();
					if(sizeOfQ>0)
						height++;
				}
			}
			return height;
		}
		
	
		
	}
	
	public void levelOrder_Recursive(Node root)
	{
		int height = this.height(root);
		int localCounter = 1;
		List<Node> levelX = new LinkedList<>();
		for(int count = 1; count <= localCounter && localCounter!=height ;)
		{
			if(root.left!=null || root.right!=null)
			{
				count++;
				//root.left.data
			}
		}
	}
	
	public void levelOrder_Iterative(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		if(root!=null)
		{	
			queue.add(root);
			while(!queue.isEmpty())
			{
				Node local = queue.poll();
				System.out.print(local.data + " ");
				if(local.left!=null) //------
				queue.add(local.left);
				
				if(local.right!=null)//------
				queue.add(local.right);
			}
		}
	}
	
	
	public void levelWiseOrder_Iterative(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		if(root!=null)
		{	
			queue.add(root);
			int elements = queue.size();
			int level = 1;
			System.out.print("\n Level "+level + ": ");
			while(elements-- > 0)
			{
				Node local = queue.poll();
				System.out.print(local.data + " ");
				if(local.left!=null)
					queue.add(local.left);
				
				if(local.right!=null)
					queue.add(local.right);
				
				if(elements==0)
				{
					elements = queue.size();
					if(elements>0)	
						System.out.print("\n Level "+ ++level + ": ");
				}
			}
		}
	}

	
	public void reverseLevelWiseOrder_Iterative(Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		Deque<Node> stack = new ArrayDeque<>();
		
		if(root!=null)
		{	
			queue.add(root);
			int elements = queue.size();
			int level = 1;
			System.out.print("\n Level "+level + ": ");
			while(elements-- > 0)
			{
				Node local = queue.poll();
				//System.out.print(local.data + " ");
				stack.push(local);
				if(local.left!=null)
					queue.add(local.left);
				
				if(local.right!=null)
					queue.add(local.right);
				
				if(elements==0)
				{
					while(stack.peek()!=null)System.out.print(stack.pop().data + " ");
					
					elements = queue.size();
					if(elements>0)	
						System.out.print("\n Level "+ ++level + ": ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(4);
		bt.root.left = new Node(2);
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(3);
		bt.root.right = new Node(6);
		bt.root.right.left = new Node(5);
		bt.root.right.right = new Node(7);

		int activities = 0;
		System.out.print(++activities + ".Height of Tree\t-> "+ bt.height(bt.root));
		
		System.out.print("\n" + ++activities + ".Inorder\t\t-> ");bt.inorderTraversal_Recursive(bt.root);
		
		System.out.print("\n" + ++activities + ".Preorder\t-> ");bt.preTraversal_Recursive(bt.root);
		
		System.out.print("\n" + ++activities + ".Postorder\t-> ");bt.postTraversal_Recursive(bt.root);
		
		System.out.print("\n" + ++activities + ".Level Order\t-> ");bt.levelOrder_Iterative(bt.root);
		
		System.out.print("\n" + ++activities + ".Level-wise level Order-> ");bt.levelWiseOrder_Iterative(bt.root);
		
		System.out.print("\n" + ++activities + ".Reverse Level-wise level Order-> ");bt.reverseLevelWiseOrder_Iterative(bt.root);
		
		System.out.print("\n" + ++activities + ".Level Order\t-> ");bt.levelOrder_Recursive(bt.root);
		
		
	}
}
