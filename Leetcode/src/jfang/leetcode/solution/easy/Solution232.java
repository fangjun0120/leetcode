package jfang.leetcode.solution.easy;

import java.util.Stack;

/**
 * Implement Queue using Stacks
 * [ popStack <-- tail-xxxxx-head --> pushStack ]
 *
 * Created by jfang on 3/14/2016.
 */
public class Solution232 {
    private Stack<Integer> pushStack = new Stack<Integer>();
    private Stack<Integer> popStack = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        while (popStack.size() != 0) {
            pushStack.push(popStack.pop());
        }
        pushStack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while (pushStack.size() != 0) {
            popStack.push(pushStack.pop());
        }
        popStack.pop();
    }

    // Get the front element.
    public int peek() {
        while (pushStack.size() != 0) {
            popStack.push(pushStack.pop());
        }
        return popStack.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (popStack.size() == 0 && pushStack.size() == 0);
    }
}
