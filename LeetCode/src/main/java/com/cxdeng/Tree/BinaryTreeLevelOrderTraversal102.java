package com.cxdeng.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {

    /*
     *           1
     *        /     \
     *       2       3
     *     /   \   /   \
     *    4     5 6     7
     * */

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            int curLevelSize = queue.size();

            for (int i = 0; i < curLevelSize; i++) {
                TreeNode node = queue.poll();
                curLevel.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(curLevel);
        }

        return res;
    }

}
