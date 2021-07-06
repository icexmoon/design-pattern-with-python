package pattern9.take_out_v4.src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Node implements Iterable<Node> {
    private LinkedList<Node> children = new LinkedList<>();
    private Node parent = null;

    public boolean removeFromParent() {
        if (parent != null) {
            return parent.removeChild(this);
        }
        return false;
    }

    public boolean removeChild(Node child) {
        if (children.remove(child)) {
            child.parent = null;
            return true;
        }
        return false;
    }

    public void addChild(Node child) {
        children.add(child);
        child.parent = this;
    }

    public boolean isLeaf() {
        if (children.size() == 0) {
            return true;
        }
        return false;
    }

    public List<Node> getChildren(){
        return this.children;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

}
