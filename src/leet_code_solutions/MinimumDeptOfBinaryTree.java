package leet_code_solutions;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class MinimumDeptOfBinaryTree {
    int val;

    TreeNode left;
    TreeNode right;
        public int minDepth(TreeNode root) {
            if(root == null){
                return 0;
            }
            LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
            LinkedList<Integer> counts = new LinkedList<Integer>();
            nodes.add(root);
            counts.add(1);
            while(!nodes.isEmpty()){
                TreeNode curr = nodes.remove();
                int count = counts.remove();
                    nodes.add(curr.left);
                    counts.add(count+1);
                }
                if(curr.right != null){
                    nodes.add(curr.right);
                    counts.add(count+1);
                }
                if(curr.left == null && curr.right == null){
                    return count;
                }
            }
            return 0;
        }
}
