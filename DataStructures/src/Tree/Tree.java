package Tree;

public class Tree {
    private class Node
    {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
    private Node root;

    public void insert(int value)
    {
        Node newNode = new Node(value);
        if(root==null)
        {
            root = newNode;
            return;
        }
        Node currentNode = root;
        while (true)
        {
            if(currentNode.value > value)
            {
                if(currentNode.leftChild == null)
                {
                    currentNode.leftChild = newNode;
                    break;
                }
                else
                    currentNode = currentNode.leftChild;
            }
            else
            {
                if(currentNode.rightChild == null)
                {
                    currentNode.rightChild = newNode;
                    break;
                }
                else
                    currentNode = currentNode.rightChild;
            }
        }
    }

    public boolean find(int value)
    {
        if(root == null)
        {
            return false;
        }
        if(root.value == value)
        {
            return true;
        }
        var currentNode = root;
        while (currentNode != null)
        {
            if(value < currentNode.value)
            {
                currentNode = currentNode.leftChild;
            }
            else if(value > currentNode.value)
            {
                currentNode = currentNode.rightChild;
            }
            else
                return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
