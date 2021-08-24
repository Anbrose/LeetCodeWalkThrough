//https://leetcode.com/problems/symmetric-tree/

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return cmp(root.left, root.right);
    }

    static boolean cmp(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if ((a == null && b != null) || (b == null && a != null)) return false;
        return (isEq(a,b) && cmp(a.right, b.left) && (cmp(a.left, b.right)));
    }

    static boolean isEq(TreeNode a, TreeNode b){
        return a.val == b.val;
    }
}