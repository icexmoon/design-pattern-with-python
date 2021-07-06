package pattern9.take_out_v4.src;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NodeIterator implements Iterator<Node> {
    // private Node root;
    private Stack<Node> stack = new Stack<Node>();

    public NodeIterator(Node node) {
        // this.root = node;
        this.stack.push(node);
    }

    @Override
    public boolean hasNext() {
        if (this.stack.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public Node next() {
        Node node = this.stack.pop();
        if (node != null && (!node.isLeaf())) {
            List<Node> children = node.getChildren();
            this.reverseInStack(children);
        }
        return node;
    }

    /**
     * 将给定的多个Node对象序列倒序压入堆栈
     * 
     * @param nodes
     */
    private void reverseInStack(List<Node> nodes) {
        Stack<Node> tempStack = new Stack<Node>();
        for (Node node : nodes) {
            tempStack.push(node);
        }
        while (!tempStack.isEmpty()) {
            Node node = tempStack.pop();
            this.stack.push(node);
        }
    }

}
