
public class BinarySearchTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }
        else{
            Node current = root, parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    public Node minNode(Node root) {
        if (root.left != null) {
            return minNode(root.left);
        }
        else{
            return root;
        }
    }

    public Node deleteNode(Node node, int value) {
        if (node == null) {
            return null;
        }
        else{
            if(value < node.data) {
                node.left = deleteNode(node.left, value);
            }
            else if(value > node.data) {
                node.right = deleteNode(node.right, value);
            }
            else{
                if(node.left == null && node.right == null) {
                    node = null;
                }
                else if(node.left == null) {
                    node = node.right;
                }
                else if(node.right == null) {
                    node = node.left;
                }
                else{
                    Node temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }

    public void inorderTraversal(Node node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (node.left != null) {
                inorderTraversal(node.left);
            }
            System.out.print(node.data + " ");
            if (node.right != null) {
                inorderTraversal(node.right);
            }
        }
    }
public void postorderTraversal(Node node){
        if(root==null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
      System.out.print(node.data+"->");
}
    public void preorderTraversal(Node node){
        if(root==null){
            return;

        }
        System.out.print(node.data+"->");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public static Node searchInBst(Node root, int target){
        if(root==null){
            return null;
        }
        else if(root.data==target){
            return root;
        }
        else if(root.data<target){
            return searchInBst(root.left,target);
        }
        return searchInBst(root.right,target);
    }
//    public static Node search(Node root,int target){
//        if(root.data==target||root==null){
//            return root;
//        }
//        else if(target>root.data){
//            return search(root.right,target);
//        }
//        else{
//            return search(root.left,target);
//        }
//    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(60);
        tree.insert(10);
        tree.insert(90);

        System.out.println("Binary search tree after insertion:");
        tree.inorderTraversal(tree.root);

        Node deletedNode = null;

        deletedNode = tree.deleteNode(tree.root, 90);
        System.out.println("\nBinary search tree after deleting node 90:");
        tree.inorderTraversal(tree.root);

        deletedNode = tree.deleteNode(tree.root, 30);
        System.out.println("\nBinary search tree after deleting node 30:");
        tree.inorderTraversal(tree.root);

        deletedNode = tree.deleteNode(tree.root, 50);
        System.out.println("\nBinary search tree after deleting node 50:");
        tree.inorderTraversal(tree.root);
        Node temp=searchInBst(tree.root,30);
        System.out.println(temp.data);
    }
}
/*// Binary Search Tree operations in Java

class BinarySearchTree {
  class Node {
    int key;
    Node left, right;

    public Node(int item) {
      key = item;
      left = right = null;
    }
  }

  Node root;

  BinarySearchTree() {
    root = null;
  }

  void insert(int key) {
    root = insertKey(root, key);
  }

  // Insert key in the tree
  Node insertKey(Node root, int key) {
    // Return a new node if the tree is empty
    if (root == null) {
      root = new Node(key);
      return root;
    }

    // Traverse to the right place and insert the node
    if (key < root.key)
      root.left = insertKey(root.left, key);
    else if (key > root.key)
      root.right = insertKey(root.right, key);

    return root;
  }

  void inorder() {
    inorderRec(root);
  }

  // Inorder Traversal
  void inorderRec(Node root) {
    if (root != null) {
      inorderRec(root.left);
      System.out.print(root.key + " -> ");
      inorderRec(root.right);
    }
  }

  void deleteKey(int key) {
    root = deleteRec(root, key);
  }

  Node deleteRec(Node root, int key) {
    // Return if the tree is empty
    if (root == null)
      return root;

    // Find the node to be deleted
    if (key < root.key)
      root.left = deleteRec(root.left, key);
    else if (key > root.key)
      root.right = deleteRec(root.right, key);
    else {
      // If the node is with only one child or no child
      if (root.left == null)
        return root.right;
      else if (root.right == null)
        return root.left;

      // If the node has two children
      // Place the inorder successor in position of the node to be deleted
      root.key = minValue(root.right);

      // Delete the inorder successor
      root.right = deleteRec(root.right, root.key);
    }

    return root;
  }

  // Find the inorder successor
  int minValue(Node root) {
    int minv = root.key;
    while (root.left != null) {
      minv = root.left.key;
      root = root.left;
    }
    return minv;
  }

  // Driver Program to test above functions
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(8);
    tree.insert(3);
    tree.insert(1);
    tree.insert(6);
    tree.insert(7);
    tree.insert(10);
    tree.insert(14);
    tree.insert(4);

    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("\n\nAfter deleting 10");
    tree.deleteKey(10);
    System.out.print("Inorder traversal: ");
    tree.inorder();
  }
} */
