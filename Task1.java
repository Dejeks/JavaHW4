package org.example.Homework.HW4;

public class Task1 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static void printReverse(Node node) {
        if (node == null)
            return;

        printReverse(node.next);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        // 0_o Не знаю, как еще можно обойти условие без использования массивов
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Начальный список:");
        printList(head);

        System.out.println("\nОбратный список:");
        printReverse(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
