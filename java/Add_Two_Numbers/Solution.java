/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 
        //stores sum of the lists
        ListNode result = new ListNode(0);
        ListNode temp = result;

        //check if empty
        if(l1 == null) {return l2;}
        if(l2 == null) {return l1;}

        int carry = 0;

        //loop over until end reached
        while(l1 != null || l2 != null){
            
            temp.val += addNum(l1,l2);

            if(temp.val >= 10){
                temp.val -= 10;
                carry = 1;
            } else {carry = 0;}

            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;


            if((l1 == null && l2 == null) && carry == 0){
                break;
            }

            temp.next = new ListNode(carry);
            temp = temp.next;

        }

        return result;
    }

    static int addNum(ListNode l1, ListNode l2){
       
        if(l1 == null){
            return l2.val;
        } else if(l2 == null){
            return l1.val;
        }

        return (l1.val + l2.val);
    }


}