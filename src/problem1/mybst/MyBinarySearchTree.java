package problem1.mybst;
import problem1.node.TreeNode;


public class MyBinarySearchTree {
    public static StringBuilder preOrderString;
    public TreeNode root;
    public int c = 0;

    public MyBinarySearchTree() {
        this.root = null;
        preOrderString =   new StringBuilder();
    }

    public static void pre(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderString.append(root.getValue() + "   ");
        pre(root.getLeft());
        pre(root.getRight());
    }

    public TreeNode addService(final TreeNode treeRoot, final int addValue) {
        if (treeRoot == null) {
            return new TreeNode(addValue);
        }
        if (addValue < treeRoot.getValue()) {
            treeRoot.setLeft(addService(treeRoot.getLeft(), addValue));
        } else if (addValue == treeRoot.getValue()) {
            return treeRoot;
        } else {
            treeRoot.setRight(addService(treeRoot.getRight(), addValue));
        }

        return treeRoot;
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    public void post(TreeNode root) {
        if (root == null) {
            return;
        }
        post(root.getLeft());
        post(root.getRight());
        System.out.print(root.getValue() + "   ");
    }

}
