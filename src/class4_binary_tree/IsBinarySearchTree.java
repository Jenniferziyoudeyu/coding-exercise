package class4_binary_tree;
/*
需要满足的条件是 L < root && R > root

          root          root范围在正无穷到负无穷之间 【-inf，+inf】
         /   \
        L     R         L的范围在负无穷到root之间，不包括root【-inf，root）
       / \   / \        R的范围在root到正无穷之间，不包括root （root，+inf】
      D   E F   G       D【-inf，L）， E （L，root）
                        ...
 */

public class IsBinarySearchTree {
    boolean isBST (TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.value <= min || root.value >= max)
            return false;

        return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
    }
}
