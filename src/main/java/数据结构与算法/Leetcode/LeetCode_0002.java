package 数据结构与算法.Leetcode;

import 数据结构与算法.Leetcode.util.ListNode;

/** LeetCode0002: 两数相加
 *
 *  题目描述:
 *      给出两个"非空"的链表用来表示两个非负的整数。其中，它们各自的位数是按照"逆序"的方式存储的，并且它们的每个节点只能存储"一位"数字。
 *      如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *      您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *  示例：
 *      输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *      输出：7 -> 0 -> 8
 *      原因：342 + 465 = 807
 */
public class LeetCode_0002 {
    public static void main(String[] args) {
        // 定义l1
        ListNode l1 = new ListNode(2);
        ListNode l11 =new ListNode(4);
        ListNode l111 = new ListNode(3);
        l1.next =l11;
        l11.next = l111;

        // 定义l2
        ListNode l2 = new ListNode(2);
        ListNode l22 =new ListNode(4);
        ListNode l222 = new ListNode(3);
        l2.next =l22;
        l22.next = l222;

        ListNode l3 = addTwoNumbers(l1,l2);
        while (l3 != null){
            System.out.println(l3.val);
            l3 = l3.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        while(l1 != null || l2 != null || temp != 0){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + temp;
            temp = sumVal/10;
            p.next = new ListNode(sumVal%10);
            p = p.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return l3.next;
    }
}

