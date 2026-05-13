package LinkedLists;

import java.util.LinkedList;

public class Linked {
    static void main() {
        // *******************************************************
        // LinkedList =  Nodes are in 2 parts (data + address)
        //                        Nodes are in non-consecutive memory locations
        //                        Elements are linked using pointers

        //    advantages?
        //    1. Dynamic Data Structure (allocates needed memory while running)
        //    2. Insertion and Deletion of Nodes is easy. O(1)
        //    3. No/Low memory waste

        //    disadvantages?
        //    1. Greater memory usage (additional pointer)
        //    2. No random access of elements (no index [i])
        //    3. Accessing/searching elements is more time consuming. O(n)

        //    uses?
        //    1. implement Stacks/Queues
        //    2. GPS navigation
        //    3. music playlist
        // *******************************************************

        /*LinkedList<String> linkedLikeStack = new LinkedList<>();
        linkedLikeStack.push("A");
        linkedLikeStack.push("B");
        linkedLikeStack.push("C");
        linkedLikeStack.push("D");
        linkedLikeStack.push("E");
        linkedLikeStack.pop();
        System.out.println(linkedLikeStack);*/

        LinkedList<String> linkedLikeQueue = new LinkedList<>();
        linkedLikeQueue.offer("A");
        linkedLikeQueue.offer("B");
        linkedLikeQueue.offer("C");
        linkedLikeQueue.offer("D");
        linkedLikeQueue.offer("F");
//        linkedLikeQueue.poll();
        linkedLikeQueue.add(4, "E");
        linkedLikeQueue.remove("E");
        linkedLikeQueue.indexOf("F");

        System.out.println(linkedLikeQueue);

        System.out.println(linkedLikeQueue.peekFirst());
        System.out.println(linkedLikeQueue.peekLast());

        linkedLikeQueue.addFirst("0");
        linkedLikeQueue.addLast("G");

        String first = linkedLikeQueue.removeFirst();
        String last = linkedLikeQueue.removeLast();

        System.out.println(linkedLikeQueue);
    }
}
