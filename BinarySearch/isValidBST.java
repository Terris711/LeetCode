package BinarySearch;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class isValidBST {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public boolean isValidBST( TreeNode root, long minVal, long maxVal) {
            // If the node is empty ==> true
            if ( root == null) return true;

            // root node is out of bound ==> false
            if (root.val >= maxVal || root.val <= minVal) return false;
            return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val,maxVal);
        }
}
