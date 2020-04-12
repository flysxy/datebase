class Insert {
    private Node tree;
    public void insert(int date) {
        if (tree == null) {
            tree = new Node(date);
            return;
        }
        Node p = tree;
        while (p != null) {
            if (date > p.date) {
                if (p.right == null) {
                    p.right = new Node(date);
                    return;
                }
                p = p.right;
            } else {
                if (p.left == null) {
                    p.left = new Node(date);
                    return;
                }
                p = p.left;
            }
        }
    }

    public static Node {
        private int date;
        private Node left;
        private Node right;
    }

    public Node(int date) {
        this.date = date;
    }
}