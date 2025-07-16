package com.walking.Lesson_42.AVL;

public class AVLTree {

    private Node root;

    public AVLTree() {

    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.left)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (getHeight(node.left) - getHeight(node.right) > 1) {
            //left heavy
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                //left left case
                //right rotate of node
                return rightRotate(node);
            }
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                //left right case
                //right rotate of node
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (getHeight(node.left) - getHeight(node.right) < -1) {
            //right heavy
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                //right right case
                //right rotate of node
                return leftRotate(node);
            }
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                //left right case
                //right rotate of node
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.left.right;

        c.right = p;
        t.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right)) + 1;
        c.height = Math.max(getHeight(c.left), getHeight(c.right)) + 1;

        return c;
    }


    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.value);

        display(node.left, " left child of " + node.value + " : ");
        display(node.right, " right child of " + node.value + " : ");
    }


    public class Node {
        private int value;
        private int height;
        private Node right;
        private Node left;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
