# Copy List

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode node = head;
        RandomListNode newHead = null;
        RandomListNode newNode;
        while(node != null){
            newNode = new RandomListNode(node.label);
            if(newHead == null){
                newHead = newNode;
            }
            map.put(node, newNode);
            node = node.next;
        }
        for(RandomListNode nodes : map.keySet()){
            newNode = map.get(nodes);
            if(nodes.next != null){
                newNode.next = map.get(nodes.next);
            }
            if(nodes.random != null){
                newNode.random = map.get(nodes.random);
            }
        }
        return newHead;
    }
}
