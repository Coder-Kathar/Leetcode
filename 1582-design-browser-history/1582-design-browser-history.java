class BrowserHistory {
    
    Stack<String> back;
    Stack<String> front;
    String current;
    public BrowserHistory(String homepage) {
        back = new Stack<>();
        front = new Stack<>();
        current = homepage;
    }
    
    public void visit(String url) {
        back.push(current);
        front.clear();
        current = url;
    }
    
    public String back(int steps) {
        while(steps > 0 && !back.isEmpty())
        {
            front.push(current);
            current = back.pop();
            steps--;
        }
        return current;
    }
    
    public String forward(int steps) {
        while(steps > 0 && !front.isEmpty())
        {
            back.push(current);
            current = front.pop();
            steps--;
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */