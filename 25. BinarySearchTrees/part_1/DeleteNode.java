/*
Deleting a node may involve one of the following cases:
a. No child (leaf node):
  - Delete node & return null to parent
b. one child:
  - Delete node & replace with child node
c. two children:
  - Replace value with inorder successor & delete the node for inorder successor
*/
public class DeleteNode{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
    }
  }
  public static Node insert(Node root,int val){
    if(root == null){
      root = new Node(val);
      return root;
    }
    if(root.data > val){
      //left subtree
      root.left = insert(root.left, val);
    }else{
      //right subtree
      root.right = insert(root.right, val);
    }
    return root;
  }
  public static void inOrder(Node root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  public static Node delete(Node root,int val){
    if(root.data < val){
      root.right = delete(root.right, val);
    }else if(root.data > val){
      root.left = delete(root.left, val);
    }else{
      //voila
      //case 1 - leaf node (no child)
      if(root.left == null && root.right == null){
        return null;
      }

      //case 2 - single child
      if(root.left == null){
        return root.right;
      }else if(root.right == null){
        return root.left;
      }

      //case 3 - both children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;
  }
  private static Node findInorderSuccessor(Node root){
    while(root.left != null){
      root = root.left;
    }
    return root;
  }
  public static void main(String[] args){
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i=0; i<values.length; i++){
      root = insert(root,values[i]);
    }
    inOrder(root);
    System.out.println();
    root = delete(root, 1);
    inOrder(root);
    System.out.println();
  }
}

// java DeleteNode.java