class Find {
    private Node tree;
    public static void main(String[] args) {
        System.out.println("binanry search tree: find"); 
    }
    public Node find(int value) {
        Node p = tree;
        while (p != null) {
            if (value < p.date) p = p.left;
            else if (value > p.date) p = p.right;
            else return p;
        }
        return null;   
    }
    public static class Node {
        private int date;
        private Node left;
        private Node right;
    }
    public Node(int date) {
        this.date = date;
    }
}