package class4_binary_tree;

public class BinaryTreeTriverse {
     void preorder (TreeNode root) {
        if (root == null) return;
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    void inorder (TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    void postorder (TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }
}
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    //构造体
    TreeNode (int value) {
        this.value = value;
    }
}
