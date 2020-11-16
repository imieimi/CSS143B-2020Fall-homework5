package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static TreeNode<Integer> insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        if(root == null){
            return new TreeNode(valToInsert);
        }
        if(valToInsert < root.val){
            root.left = insert(root.left, valToInsert);
        }else{
            root.right = insert(root.right, valToInsert);
        }
        return root;
    }
}
