class twoStacks {
    int[] arr = new int[100];
    int top1, top2;

    twoStacks() {
        top1 = -1;
        top2 = 100;
    }

    // Function to push an integer into stack1.
    void push1(int x) {
        if (top1 + 1 < top2) {
            top1++;
            arr[top1] = x;
        }
        // else overflow (ignored as per GFG)
    }

    // Function to push an integer into stack2.
    void push2(int x) {
        if (top1 + 1 < top2) {
            top2--;
            arr[top2] = x;
        }
        // else overflow
    }

    // Function to pop an element from stack1.
    int pop1() {
        if (top1 >= 0) {
            int val = arr[top1];
            top1--;
            return val;
        }
        return -1; // stack empty
    }

    // Function to pop an element from stack2.
    int pop2() {
        if (top2 < 100) {
            int val = arr[top2];
            top2++;
            return val;
        }
        return -1; // stack empty
    }
}
