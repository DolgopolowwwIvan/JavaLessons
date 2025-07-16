package com.walking.Lesson_42.BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want enter left of " + node.value + "? (true/false)") ;
        boolean left = scanner.nextBoolean();
        scanner.nextLine();

        if (left) {
            System.out.println("Enter the value of the left of " + node.value + ":");
            int value = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        scanner.nextLine(); // Очистка буфера

        if (right) {
            System.out.println("Enter the value of the right of " + node.value + ":");
            int value = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if (null == node){
            return;
        }
        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for (int i = 0; i < level -1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }


}
