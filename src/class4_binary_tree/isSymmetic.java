package class4_binary_tree;
// 每个节点都要走一遍， 所以时间复杂度是O（n）。
public class isSymmetic {
    boolean isSymmetic (TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;          //base case 1
        else if (n2 == null || n2 == null) return false;    //base case 2
        else if (n1.value != n2.value) return false;        //base case 3
        else {
            return isSymmetic(n1.right, n2.left) && isSymmetic(n2.left, n1.right);
        }
    }
}
