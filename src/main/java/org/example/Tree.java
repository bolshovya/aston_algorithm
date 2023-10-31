package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Tree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(8,
                new BinaryTree(9,
                        new BinaryTree(17,
                                new BinaryTree(18), null),
                        new BinaryTree(27, null, null)),
                new BinaryTree(15,
                        new BinaryTree(23,
                                new BinaryTree(45, null, null)),
                        new BinaryTree(31, null, null)));

        System.out.println("Сумма узлов: " + sumInDepth(tree));

        System.out.println("Сумма узлов: " + sumInWidth(tree));
    }

    static class BinaryTree {
        private int value;

        private BinaryTree left;

        private BinaryTree right;

        public BinaryTree(int value, BinaryTree left, BinaryTree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree left) {
            this.value = value;
            this.left = left;
        }

        public int getValue() {
            return value;
        }

        public BinaryTree getLeft() {
            return left;
        }

        public BinaryTree getRight() {
            return right;
        }
    }

    public static int sumInDepth(BinaryTree tree) {
        int sum = 0;
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(tree);

        while (!stack.isEmpty()) {
            BinaryTree node = stack.pop();
            sum = sum + node.getValue();

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        return sum;
    }

    public static int sumInWidth(BinaryTree tree) {
        int sum = 0;
        Deque<BinaryTree> queue = new LinkedList<>();
        queue.addLast(tree);

        while (!queue.isEmpty()) {
            BinaryTree node = queue.pop();
            sum = sum + node.getValue();

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        return sum;
    }
}
