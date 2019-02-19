package class4_binary_tree;

public class IsIdentical {
    boolean isIdentical (TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        else if (n1 == null || n2 == null) return false;
        else if (n1.value != n2.value) return false;
        else {
            return isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right) || isIdentical(n1.left, n2.right) && isIdentical(n1.right, n2.left);

        }
    }
}
