package class4_binary_tree;
/*
Get the list of keys in a given binary search tree in a given range[min, max] in ascending order, both min and max are inclusive.

Examples

        5

      /    \

    3        8

  /   \        \

 1     4        11

get the keys in [2, 5] in ascending order, result is  [3, 4, 5]

Corner Cases

What if there are no keys in the given range? Return an empty list in this case.
How is the binary tree represented?

We use the level order traversal sequence with a special symbol "#" denoting the null node.

For Example:

The sequence [1, 2, 3, #, #, 4] represents the following binary tree:

    1

  /   \

 2     3

      /

    4
 */


public class PrintBSTKeys {
    void PrintRange (TreeNode root, int k1, int k2) {
        if (root == null) return;
        if (root.value > k1) {
            PrintRange(root.left, k1, k2);
        }
        if (root.value >= k1 && root.value <= k2) {
            System.out.println(root.value);
        }
        if (root.value < k2) {
            PrintRange(root.right, k1 , k2);
        }
    }
}
