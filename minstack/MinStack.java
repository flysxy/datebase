class MinStack {
    private Stack<Integer> items;
    private Stack<Integer> minstack;

    public MinStack() {
        items = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }


    public void push(int value) {
        if (items.isEmpty()) {
            minstack.push(value);
        } else {
            if (value <= minstack.peek())
                minstack.push(value);
        }
        items.push(value);
    }

    public void pop() {
        int value = items.pop();
        if (value == minstack.peek()) {
            System.out.println("minstack value: " + minstack.peek());
            minstack.pop();
        }
    }

    public int top() {
        items.peek();

    }

    public int getmin() {
        return minstack.peek();

    }
}