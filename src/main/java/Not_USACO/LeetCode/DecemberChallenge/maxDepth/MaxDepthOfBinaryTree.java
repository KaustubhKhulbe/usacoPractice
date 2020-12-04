package Not_USACO.LeetCode.DecemberChallenge.maxDepth;

import javax.swing.tree.TreeNode;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return search(root);
    }

    public int search(TreeNode root){



        if(root == null) return 0;

        if(root.getChildAt(0) == null && root.getChildAt(1) == null) return 1;

        return 1 + Math.max(search(root.getChildAt(0)), search(root.getChildAt(1)));
    }
}
