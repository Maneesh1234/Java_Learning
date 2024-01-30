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
        //ListNode l=new ListNode();
        ListNode head=null, t=null;
        int h=0, sumVal=0;
        while(l1!=null || l2 !=null || h>0){
            if(l1!=null && l2!=null){
                sumVal=l1.val+l2.val+h;
                l1=l1.next; l2=l2.next;
            }
            else if (l1!=null && l2==null){
                sumVal=l1.val+h;
                l1=l1.next; 
            }
            else if (l1==null && l2!=null){
                sumVal=l2.val+h;
                l2=l2.next; 
            }
            else {
                sumVal=h;
            }
           
            int rem=sumVal%10;
            if(head ==null){
                ListNode newHead=new ListNode(rem);
                head=newHead;
                t=newHead;
            }
            else{
                ListNode newHead=new ListNode(rem);
                t.next=newHead;
                t=t.next;
            }
            h=sumVal/10;
            
           
            

        }
    return head;   
    }
}
