package Not_USACO.LeetCode.DecemberChallenge.maxDepth;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return search(root);
    }

    public int search(TreeNode root){

        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        return 1 + Math.max(search(root.left), search(root.right));
    }
}
