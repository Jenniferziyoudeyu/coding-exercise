package class4_binary_tree;
//时间复杂度 要把每个node都走一次，所以 Time = O(n);
public class isBalanced {
     public boolean isBalanced (TreeNode root) {
         if (root == null) return true;
         int notBalanced = getHeight(root.left) - getHeight(root.right);
         if (Math.abs(notBalanced) > 1) return false;
         return isBalanced(root.left) && isBalanced(root.right);
     }

     int getHeight (TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
    }

}
