package Problem1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework - couldn't finish.
        List<List<Integer>> result = new ArrayList<>();
     /*   //I chose to use LinkedList since its the only one I knew.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            result.add((List<Integer>) temp.val);


            if(temp.left != null){
                queue.add(root.left);
            }else if(temp.right != null){
                queue.add(temp.right);
            }
        }

      */
        return result;  // place holder
    }
}
