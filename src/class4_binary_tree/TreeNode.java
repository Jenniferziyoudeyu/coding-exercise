package class4_binary_tree;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    //初始化 从无到有 先准备原料 先做treeNode 先不管left和right
    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}
