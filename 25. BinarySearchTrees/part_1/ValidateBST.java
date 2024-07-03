/*
Q. Validate BST:
a. approach 1: compare with left & right side
b. approach 2: check if max value in left subtree < node and min value in right subtree > node
*/
public class ValidateBST{
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
  public static boolean isValidBST(Node root, Node min, Node max){
    if(root == null){
      return true;
    }
    if(min != null && root.data <= min.data){
      return false;
    }
    else if(max != null && root.data >= max.data){
      return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
  }
  public static void main(String[] args){
    int values[] = {81,1,5,3,2,6,10,8,11,14};
    Node root = null;
    for(int i=0; i<values.length; i++){
      root = insert(root,values[i]);
    }
    inOrder(root);
    System.out.println();
    if(isValidBST(root,null,null)){
      System.out.println("valid");
    }else{
      System.out.println("not valid");
    }      
  }
}

// java ValidateBST.java