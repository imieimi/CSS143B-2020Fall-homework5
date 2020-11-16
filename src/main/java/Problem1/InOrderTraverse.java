package Problem1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();

        TreeNode current = root;
        while(current != null){
            stack.push(current);
            current = current.left;
        }
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            result.add((Integer) temp.val);
            temp = temp.left;

            while(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
        }
        return result;  // place holder

    }
}
