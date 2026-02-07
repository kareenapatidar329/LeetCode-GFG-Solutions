//time complexity O(n)
//space complexity O(1)

class Solution {
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node evenHead=null;
        Node evenTail=null;
        Node oddHead=null;
        Node oddTail=null;
        while(head != null){
            Node next = head.next;
            head.next=null;
            if(head.data%2==0){
                if(evenHead==null){
                    evenHead=head;
                    evenTail=head;
                }else{
                    evenTail.next=head;
                    evenTail=evenTail.next;
                }
            }else{
                if(oddHead==null){
                    oddHead=head;
                    oddTail=head;
                }else{
                    oddTail.next=head;
                    oddTail=oddTail.next;
                }
            }
            head=next;
        }
        if(evenHead==null){
            return oddHead;
        }
        evenTail.next=oddHead;
        return evenHead;
    }
}