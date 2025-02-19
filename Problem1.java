//TC : O(n)
//SC : O(n)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q= new LinkedList();
        q.add(root);
        while( !q.isEmpty()){
            int size =q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if (i==size-1) {
                    result.add(node.val);
                }
                if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            }
            
        }
        return result;
    }
}