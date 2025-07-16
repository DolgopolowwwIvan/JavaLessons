package com.walking.Lesson_42.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = {5, 6, 4, 3, 8, 9, 1, 22, 12};
        tree.populate(nums);
        tree.display();
    }
}
