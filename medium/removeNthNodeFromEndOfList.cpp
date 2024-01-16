/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = head;
        ListNode* np = head;
        while (n) {
            np = np->next;
            n--;
        }
        while (np && np->next) {
            np = np->next;
            temp = temp->next;
        }
        if (!temp->next || !np) {
            return head->next;
        }
        temp->next = temp->next->next;
        return head;
    }
};