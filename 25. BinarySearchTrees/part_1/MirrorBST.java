/*
Q. Mirror BST:
  - Write a program to build a mirror BST for a given binary search tree.
*/
public class MirrorBST{
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
    }
  }
  public static Node createMirror(Node root){
    if(root == null){
      return null;
    }
    Node leftMirror = createMirror(root.left);
    Node rightMirror = createMirror(root.right);
    root.left = rightMirror;
    root.right = leftMirror;
    return root;
    //TC: O(n)
  }
  public static void preOrder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }
  public static void main(String[] args){
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);  
    root.left.right = new Node(6);  
    root.right.right = new Node(11);  

    root = createMirror(root);
    preOrder(root);
    System.out.println();
  }
}

// java MirrorBST.java