public class BinaryTree {
	Node root;
	Node insert(Node node,int data)
	{
		if(node==null)
		{
			node=new Node(data);
			return node;
		}
		else if(data>node.data)
		{
			node.right=insert(node.right,data);
			node=balance(node);
		}
		else
		{
			node.left=insert(node.left,data);
			node=balance(node);
		}
		return node;
	}
	void inorder(Node node)
	{
		if(node==null)
			return ;
		
		System.out.print(node.data);
		inorder(node.left);
		inorder(node.right);
	}
	int max(int d1,int d2)
	{
		return (d1>d2)?d1:d2;
	}
	int height(Node node)
	{
		if(node==null)
			return 0;
		int l=0,r=0;
		l=max(height(node.left),height(node.right));
		return l+1;
		
	}
	int diff(Node node)
	
	{
		if(node==null)
			return 0;
		return(height(node.left)-height(node.right));
	}
	Node llrotation(Node node)
	{
		
		Node temp=node.left;
		node.left=temp.right;
		temp.right=node;
		return temp;
	}
	Node rrrotation(Node node)
	{
		Node temp=node.right;
		node.right=temp.left;
		temp.left=node;
		return temp;
	}
	Node lrrotation(Node node)
	{
		Node temp=node.left;
		temp.left=rrrotation(temp.right);
		return  llrotation(node);
		
		
	}
	Node rlrotation(Node node)
	{
		Node temp=node.right;
		temp.right=llrotation(temp.left);
		return rrrotation(node);
	}
	Node balance(Node node)
	{
		int b=diff(node);
		System.out.println(b +"m");
		if(b>1)
		{
			if(diff(node.left)>0)
			{
				node=llrotation(node);
			}
			else
				node=lrrotation(node);
		}
		if(b<-1)
		{
			if(diff(node.right)<0)
			{
				node=rrrotation(node);
			}
			else
			{
				node=rlrotation(node);
			}
		}
		return node;
	}
public static void main(String arg[])
{
	BinaryTree t=new BinaryTree();
	Node root=null;
	root=t.insert(root,1);
	root=t.insert(root, 2);
	root=t.insert(root, 3);
	root=t.insert(root, 4);
	root=t.insert(root, 5);
	t.inorder(root);
	int h=t.diff(root);
	//System.out.println(h);
}
}
