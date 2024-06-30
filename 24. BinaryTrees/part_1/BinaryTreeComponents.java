/*
Q1. print height in a binary tree.
Q2. print node counts in a binary tree.
Q3. find sum of nodes of a binary tree.
Q4. find diameter of a binary tree.
*/

public class BinaryTreeComponents{
  static class Node{
    int data;
    Node left,right;
    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public static int height(Node root){
    if(root == null){
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }
  public static int countNodes(Node root){
    if(root == null){
      return 0;
    }
    int leftCount = countNodes(root.left);
    int rightCount = countNodes(root.right);
    return leftCount + rightCount + 1;
  }
  public static int nodeSum(Node root){
    if(root == null){
      return 0;
    }
    int leftSum = nodeSum(root.left);
    int rightSum = nodeSum(root.right);
    return leftSum + rightSum + root.data;
  }
  //approach 1
  public static int findDiameter(Node root){
    if(root == null){
      return 0;
    }
    int leftDiam = findDiameter(root.left);
    int leftHt = height(root.left);
    int rightDiam = findDiameter(root.right);
    int rightHt = height(root.right);
    int selfDiam = leftHt + rightHt + 1;
    return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    //TC: O(n^2)
  }
  //approach 2
  static class Info{
    int diam, ht;
    public Info(int diam,int ht){
      this.diam = diam;
      this.ht = ht;
    }
  }
  public static Info diameter(Node root){
    if(root == null){
      return new Info(0,0);
    }
    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);
    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
    int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    return new Info(diam, ht);
    //TC: O(n)
  }
  public static void main(String[] args){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    // System.out.println("height of Binary tree: "+height(root));
    // System.out.println("Node counts: "+countNodes(root));
    // System.out.println("Sum of nodes: "+nodeSum(root));
    // System.out.println("Diameter: "+diameter(root));
    System.out.println("Diameter: "+diameter(root).diam);
  }
}

/*
      1
     / \
    2   3
   / \ / \
  4  5 6  7

*/

// java BinaryTreeComponents.java